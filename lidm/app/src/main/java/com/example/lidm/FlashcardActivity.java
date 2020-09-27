package com.example.lidm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gauravk.bubblenavigation.BubbleNavigationConstraintView;
import com.gauravk.bubblenavigation.BubbleToggleView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

import at.markushi.ui.CircleButton;

public class FlashcardActivity extends AppCompatActivity implements View.OnClickListener {
    public ArrayList<Element> elements = new ArrayList<>();
    public ArrayList<Element> elementsadded = new ArrayList<>();
    private RecyclerView CardRecyclerView;
    private RecyclerView DeckRecyclerView;
    private CardAdapter CardAdapter;
    private DeckAdapter DeckAdapter;
    SharedPreferences prefs_flashcard = null;

    Context context;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard);
        View overlay = findViewById(R.id.flashcard_layout);
        overlay.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN);

        prefs_flashcard = getSharedPreferences("flashcard", MODE_PRIVATE);

        CardRecyclerView = (RecyclerView) findViewById(R.id.card_recycler);
        DeckRecyclerView = (RecyclerView) findViewById(R.id.list_recycler);

        final ConstraintLayout frame_card = (ConstraintLayout) findViewById(R.id.frame_card);
        final ConstraintLayout frame_deck = (ConstraintLayout) findViewById(R.id.frame_deck);

        final CircleButton button_shuffle = (CircleButton) findViewById(R.id.card_shuffle);
        button_shuffle.setOnClickListener(this);

        final CircleButton button_close = (CircleButton) findViewById(R.id.card_close);
        button_close.setOnClickListener(this);

        final BubbleNavigationConstraintView floating_top_bar_navigation = findViewById(R.id.flashcard_bar_navigation);
        floating_top_bar_navigation.setTypeface(Typeface.createFromAsset(getAssets(), "rubik.ttf"));
        BubbleToggleView tab_card = findViewById(R.id.tab_card);
        tab_card.setOnClickListener(this);
        BubbleToggleView tab_deck = findViewById(R.id.tab_deck);
        tab_deck.setOnClickListener(this);

        boolean isFilePresent = isFilePresent(this, "storage.json");
        if(isFilePresent) {
            String jsonString = read(this, "storage.json");
            Gson gson = new Gson();
            Type type = new TypeToken<ArrayList<Element>>(){}.getType();
            elements = gson.fromJson(jsonString, type);
            for (int i = 0; i <elements.size(); i++){
                if(elements.get(i).added == true){
                    elementsadded.add(elements.get(i));
                }
            }
        } else {
            initList(getApplicationContext());
            for (int i = 0; i <elements.size(); i++){
                if(elements.get(i).added == true){
                    elementsadded.add(elements.get(i));
                }
            }
        }



        CardAdapter = new CardAdapter(elementsadded);
        CardRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        CardRecyclerView.setItemAnimator(new DefaultItemAnimator());
        CardRecyclerView.setAdapter(CardAdapter);

        DeckAdapter = new DeckAdapter(this, elements);
        DeckRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        DeckRecyclerView.setItemAnimator(new DefaultItemAnimator());
        DeckRecyclerView.setAdapter(DeckAdapter);

        //

        SearchView searchView = (SearchView) findViewById(R.id.list_search);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nextText) {
                //Data akan berubah saat user menginputkan text/kata kunci pada SearchView
                nextText = nextText.toLowerCase();
                ArrayList<Element> dataFilter = new ArrayList<>();
                for(Element data : elements){
                    String nama = data.getName().toLowerCase();
                    if(nama.contains(nextText)){
                        dataFilter.add(data);
                    }
                }
                DeckAdapter.setFilter(dataFilter);
                return true;
            }
        });

        //floating_top_bar_navigation.setBadgeValue(0, "3");
        //floating_top_bar_navigation.setBadgeValue(1, "9+"); //invisible badge
        context = this;

        floating_top_bar_navigation.setCurrentActiveItem(0);
        floating_top_bar_navigation.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                if(position == 0){
                    elementsadded.clear();
                    for (int i = 0; i < elements.size(); i++) {
                        if (elements.get(i).added == true) {
                            elementsadded.add(elements.get(i));
                        }
                    }
                    if(elementsadded.isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Daftar kartu kosong. Silakan tambahkan untuk memulai!",Toast.LENGTH_SHORT).show();
                        button_shuffle.setVisibility(View.INVISIBLE);
                        CardAdapter.notifyDataSetChanged();
                        frame_card.setVisibility(View.VISIBLE);
                        frame_deck.setVisibility(View.INVISIBLE);
                    }
                    else if(elementsadded.isEmpty() == false) {
                        CardAdapter.notifyDataSetChanged();
                        button_shuffle.setVisibility(View.VISIBLE);
                        frame_card.setVisibility(View.VISIBLE);
                        frame_deck.setVisibility(View.INVISIBLE);
                    }
                }
                if(position == 1){
                    frame_card.setVisibility(View.INVISIBLE);
                    frame_deck.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_shuffle:
                for (int i = 0; i < elementsadded.size(); i++){
                    elementsadded.get(i).setFlipped(false);
                }
                Collections.shuffle(elementsadded);
                CardAdapter shuffle = new CardAdapter(elementsadded);
                CardRecyclerView.swapAdapter(shuffle, true);
                break;
            case R.id.card_close:
                finish();
                break;
            default:
                break;
        }
    }

    protected void onResume() {
        super.onResume();
        if (prefs_flashcard.getBoolean("firstrun", true)) {
            showPopup_flashcard();
            prefs_flashcard.edit().putBoolean("firstrun", false).commit();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        String json = new Gson().toJson(elements);
        create(this, "storage.json", json);
    }

    private String readJSON() {
        String json = null;
        try {
            // Opening data.json file
            InputStream inputStream = getAssets().open("data.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            // read values in the byte array
            inputStream.read(buffer);
            inputStream.close();
            // convert byte to string
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return json;
        }
        return json;
    }

    private void initList(final Context context) {
        try {
            JSONObject object = new JSONObject(readJSON());
            JSONArray array = object.getJSONArray("data");
            for (int i = 0; i < array.length(); i++) {
                //get JSONObject
                JSONObject obj = array.getJSONObject(i);
                //getting data
                String atomicMass = obj.getString("atomicMass");
                int atomicNumber = obj.getInt("atomicNumber");
                String atomicRadius = obj.get("atomicRadius").toString();
                String boilingPoint = obj.get("boilingPoint").toString();
                String bondingType = obj.getString("bondingType");
                String cpkHexColor = obj.getString("cpkHexColor");
                String density = obj.getString("density");
                String electronAffinity = obj.get("electronAffinity").toString();
                String electronegativity = obj.getString("electronegativity");
                String electronicConfiguration = obj.getString("electronicConfiguration");
                String groupBlock = obj.getString("groupBlock");
                String ionRadius = obj.getString("ionRadius");
                String ionizationEnergy = obj.getString("ionizationEnergy");
                String meltingPoint = obj.getString("meltingPoint");
                String name = obj.getString("name");
                String oxidationStates = obj.getString("oxidationStates");
                String standardState = obj.getString("standardState");
                String symbol = obj.getString("symbol");
                String vanDelWaalsRadius = obj.getString("vanDelWaalsRadius");
                String yearDiscovered = obj.getString("yearDiscovered");
                boolean isFlipped = false;
                boolean added = false;
                //creating Element and pushing to our ArrayList
                Element element = new Element(atomicMass, atomicNumber, atomicRadius, boilingPoint, bondingType, cpkHexColor, density, electronAffinity, electronegativity, electronicConfiguration, groupBlock, ionRadius, ionizationEnergy, meltingPoint, name, oxidationStates, standardState, symbol, vanDelWaalsRadius, yearDiscovered, isFlipped, added);
                elements.add(element);
            }
            for(int i = 0; i < 20; i++){
                elements.get(i).added = true;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private String read(Context context, String fileName) {
        try {
            FileInputStream fis = context.openFileInput(fileName);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader bufferedReader = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        } catch (FileNotFoundException fileNotFound) {
            return null;
        } catch (IOException ioException) {
            return null;
        }
    }

    private boolean create(Context context, String fileName, String jsonString){
        String FILENAME = "storage.json";
        try {
            FileOutputStream fos = context.openFileOutput(fileName,Context.MODE_PRIVATE);
            if (jsonString != null) {
                fos.write(jsonString.getBytes());
            }
            fos.close();
            return true;
        } catch (FileNotFoundException fileNotFound) {
            return false;
        } catch (IOException ioException) {
            return false;
        }

    }

    public boolean isFilePresent(Context context, String fileName) {
        String path = context.getFilesDir().getAbsolutePath() + "/" + fileName;
        File file = new File(path);
        return file.exists();
    }

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;

    public void showPopup_flashcard(){

        dialogBuilder = new AlertDialog.Builder(this);
        final View popupView = getLayoutInflater().inflate(R.layout.pop_flashcard, null);
        ImageView close = (ImageView) popupView.findViewById(R.id.imageView4);

        dialogBuilder.setView(popupView);
        dialog = dialogBuilder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }
}