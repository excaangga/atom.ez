package com.example.lidm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.commons.collections4.map.MultiKeyMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PlaygroundActivity extends AppCompatActivity {
    SharedPreferences prefs_playground = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playground);
        prefs_playground = getSharedPreferences("playground", MODE_PRIVATE);
        hideSystemUI();

        List<Integer> allElements = Arrays.asList(R.id.e1,R.id.e2,R.id.e3,R.id.e4,R.id.e5,R.id.e6,R.id.e7,R.id.e8,R.id.e9,R.id.e10,
                R.id.e11,R.id.e12,R.id.e13,R.id.e14,R.id.e15,R.id.e16,R.id.e17,R.id.e18,R.id.e19,R.id.e20,
                R.id.e21,R.id.e22,R.id.e23,R.id.e24,R.id.e25,R.id.e26,R.id.e27,R.id.e28,R.id.e29,R.id.e30,
                R.id.e31,R.id.e32,R.id.e33,R.id.e34,R.id.e35,R.id.e36,R.id.e37,R.id.e38,R.id.e39,R.id.e40,
                R.id.e41,R.id.e42,R.id.e43,R.id.e44,R.id.e45,R.id.e46,R.id.e47,R.id.e48,R.id.e49,R.id.e50,
                R.id.e51,R.id.e52,R.id.e53,R.id.e54,R.id.e55,R.id.e56,R.id.e57,R.id.e58,R.id.e59,R.id.e60,
                R.id.e61,R.id.e62,R.id.e63,R.id.e64,R.id.e65,R.id.e66,R.id.e67,R.id.e68,R.id.e69,R.id.e70,
                R.id.e71,R.id.e72,R.id.e73,R.id.e74,R.id.e75,R.id.e76,R.id.e77,R.id.e78,R.id.e79,R.id.e80,
                R.id.e81,R.id.e82,R.id.e83,R.id.e84,R.id.e85,R.id.e86,R.id.e87,R.id.e88,R.id.e89,R.id.e90,
                R.id.e91,R.id.e92,R.id.e93,R.id.e94,R.id.e95,R.id.e96,R.id.e97,R.id.e98,R.id.e99,R.id.e100,
                R.id.e101,R.id.e102,R.id.e103,R.id.e104,R.id.e105,R.id.e106,R.id.e107,R.id.e108,R.id.e109,R.id.e110,
                R.id.e111,R.id.e112,R.id.e113,R.id.e114,R.id.e115,R.id.e116,R.id.e117,R.id.e118);
        final ArrayList <LinearLayout> elements = new ArrayList<>();
        final ArrayList <LinearLayout> temp_reaction = new ArrayList<>();
        final ArrayList <String> reaction = new ArrayList<>();
        final ArrayList <String> unsur = new ArrayList<>();
        final boolean[] clicked = {false};
        final int[] click = {0};

        ImageView back = (ImageView) findViewById(R.id.backbutton_pgr);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final TextView txt_simbol = (TextView) findViewById(R.id.txt_simbol);
        final TextView txt_nama = (TextView) findViewById(R.id.txt_nama);
        final TextView txt_reaksi = (TextView) findViewById(R.id.txt_reaksi);
        final TextView txt_massa = (TextView) findViewById(R.id.txt_massa);
        final TextView txt_ikatan = (TextView) findViewById(R.id.txt_ikatan);
        final ImageView img_senyawa = (ImageView) findViewById(R.id.img_senyawa);

        ImageView btn_close = (ImageView) findViewById(R.id.btn_close);
        final RelativeLayout lay_reaksi = (RelativeLayout) findViewById(R.id.lay_reaksi);

        final MultiKeyMap<String,Reaction> data_reaction =new MultiKeyMap();
        //final HashMap<String, Reaction> data_reaction = new HashMap<>();

        Reaction HCl = new Reaction("HCl","Asam Klorida","36,458 g/mol","H(g) + Cl(g) -> HCl(l)", R.drawable.ikatan_hcl_kov, "Ikatan Kovalen");
        Reaction H2O = new Reaction("H2O","Air","18,015 g/mol","2H2(g) + O2(g) -> 2H2O(l)", R.drawable.ikatan_h2o_hy, "Ikatan Hidrogen");
        Reaction HF = new Reaction("HF","Asam Hidrofluorik","20 g/mol","H2(g) + F2(g) -> 2HF(g)", R.drawable.ikatan_hf_hy, "Ikatan Hidrogen");
        Reaction CO2 = new Reaction("CO2","Karbon Dioksida","44,01 g/mol","C(g) + O2(g) -> CO2(g)", R.drawable.ikatan_co2_kov, "Ikatan Kovalen");
        Reaction Li3N = new Reaction("Li3N","Litium Nitrida","34,83 g/mol","6Li(s) + N2(g) -> 2Li3N(s)", R.drawable.ikatan_li3n_ion, "Ikatan Ion");
        Reaction Li2O = new Reaction("Li2O","Litium Oksida","29,88 g/mol","4Li(s) + O2(g) -> 2Li2O(s)", R.drawable.ikatan_li2o_ion, "Ikatan Ion");
        Reaction NaCl = new Reaction("NaCl","Natrium Klorida","58,44 g/mol","2Na(s) + Cl2(g) -> NaCl(s)",R.drawable.ikatan_nacl_ion_jpg, "Ikatan Ion");
        Reaction NaBr = new Reaction("NaBr","Natrium Bromida","102,894 g/mol","2Na(s) + Br2(g) -> NaBr(s)",R.drawable.ikatan_nabr_ion, "Ikatan Ion");
        Reaction KCl = new Reaction("KCl","Kalium Klorida","74,5513 g/mol","2K(s) + Cl2(g) -> KCl(s)", R.drawable.ikatan_kcl_ion, "Ikatan Ion");
        Reaction MgCl2 = new Reaction("MgCl2","Magnesium Klorida","95,211 g/mol","Mg(s) + Cl2(g) -> MgCl2(s)", R.drawable.ikatan_mgcl_ion, "Ikatan Ion");
        Reaction CaCl2 = new Reaction("CaCl2","Kalsium Klorida","110,98 g/mol","Ca(s) + Cl2(g) -> CaCl2(s)",R.drawable.ikatan_cacl2_ion, "Ikatan Ion");
        Reaction Fe2O3 = new Reaction("Fe2O3","Besi(III) Oksida","159,69 g/mol","4Fe(s) + 3O2(g) -> 2Fe2O3(s)", R.drawable.ikatan_fe2o3_ion, "Ikatan Ion");
        Reaction PbO = new Reaction("PbO","Timbal(II) Oksida","223,2 g/mol","2Pb(s) + O2(g) -> 2PbO(s)",R.drawable.ikatan_pbo_kov, "Ikatan Kovalen");
        Reaction SO2 = new Reaction("SO2","Belerang Dioksida","64,066 g/mol","S(s) + O2(g) -> SO2(s)", R.drawable.ikatan_so2_kov, "Ikatan Kovalen");
        Reaction C3H8 = new Reaction("C3H8","Propana"," 44 g/mol","3C(s) + 4H2(g) -> C3H8(s)",R.drawable.ikatan_c3h8_kov, "Ikatan Kovalen");
        Reaction HgCl2 = new Reaction("HgCl2","Raksa (II) Klorida"," 271,52 g/mol","Hg(l) + Cl2(g) -> HgCl2(s)", R.drawable.ikatan_hgcl2_ion, "Ikatan Ion");
        Reaction SnO2 = new Reaction("SnO2","Timah Dioksida"," 150,71 g/mol","Sn(s) + O2(g) -> SnO2(s)", R.drawable.ikatan_sno2_ion, "Ikatan Ion");
        Reaction SnCl2 = new Reaction("SnCl2","Timah(II) Klorida","189,6 g/mol","Sn(s) + Cl2(g) -> SnCl2(s)",R.drawable.ikatan_sncl2_ion, "Ikatan Ion");
        Reaction BCl3 = new Reaction("BCl3","Boron Triklorida","117,17 g/mol","B(g) + Cl3(g) -> BCl3(g)",R.drawable.ikatan_bcl3_kov_, "Ikatan Kovalen");

        unsur.add("H");
        unsur.add("Cl");
        unsur.add("O");
        unsur.add("F");
        unsur.add("C");
        unsur.add("Li");
        unsur.add("N");
        unsur.add("Na");
        unsur.add("Br");
        unsur.add("K");
        unsur.add("Mg");
        unsur.add("Ca");
        unsur.add("Fe");
        unsur.add("Pb");
        unsur.add("S");
        unsur.add("C");
        unsur.add("Hg");
        unsur.add("Sn");
        unsur.add("B");

        data_reaction.put("H","Cl", HCl);
        data_reaction.put("H","O", H2O);
        data_reaction.put("H","F", HF);
        data_reaction.put("C","O", CO2);
        data_reaction.put("Li","N", Li3N);
        data_reaction.put("Li","O", Li2O);
        data_reaction.put("Na","Cl", NaCl);
        data_reaction.put("Na","Br", NaBr);
        data_reaction.put("K", "Cl", KCl);
        data_reaction.put("Mg","Cl", MgCl2);
        data_reaction.put("Ca","Cl", CaCl2);
        data_reaction.put("Fe", "O", Fe2O3);
        data_reaction.put("Pb","O", PbO);
        data_reaction.put("S", "O", SO2);
        data_reaction.put("C", "H", C3H8);
        data_reaction.put("Hg","Cl", HgCl2);
        data_reaction.put("Sn","O", SnO2);
        data_reaction.put("Sn","Cl", SnCl2);
        data_reaction.put("B","Cl", BCl3);




        final Animation pulse = AnimationUtils.loadAnimation(this, R.anim.pulse);

        for(int i = 0; i < 118; i++){
            elements.add((LinearLayout) findViewById(allElements.get(i)));
        }

        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lay_reaksi.setVisibility(View.GONE);
                for (int a = 0; a < elements.size(); a++){
                    elements.get(a).setAlpha(1);
                    elements.get(a).clearAnimation();
                }
                temp_reaction.clear();
            }
        });

        for(int i=0; i<elements.size();i++){
            final int finalI = i;
            elements.get(i).setOnClickListener(new View.OnClickListener() {
                private Object String;

                @Override
                public void onClick(View v) {
                    //elements.get(finalI).startAnimation(pulse);
                    if(clicked[0] == false){
                        if(unsur.contains(v.getTag().toString()) == true){
                            reaction.add(v.getTag().toString());
                            temp_reaction.add(elements.get(finalI));
                            elements.get(finalI).startAnimation(pulse);
                            v.setAlpha((float) 0.5);
                            for(int a = 0; a < elements.size(); a++){
                                if(data_reaction.containsKey(v.getTag().toString(), elements.get(a).getTag().toString()) == true ||data_reaction.containsKey(elements.get(a).getTag(), v.getTag())){
                                    elements.get(a).startAnimation(pulse);
                                }
                            }
                            clicked[0] = true;
                            click[0] = 1;
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Unsur yang dapat bereaksi dengan " + v.getTag() + " tidak ditemukan.", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else if(clicked[0] == true && reaction.contains(v.getTag().toString()) == true ){
                        reaction.remove(v.getTag().toString());
                        temp_reaction.remove(elements.get(finalI));
                        elements.get(finalI).clearAnimation();
                        v.setAlpha(1);
                        for(int a = 0; a < elements.size(); a++){
                            if(data_reaction.containsKey(v.getTag(), elements.get(a).getTag()) == true ||data_reaction.containsKey(elements.get(a).getTag(), v.getTag())){
                                elements.get(a).clearAnimation();
                            }
                        }
                        clicked[0] = false;
                        click[0] = 0;
                    }
                    else if(clicked[0] == true && reaction.contains(v.getTag().toString()) == false ){
                        reaction.add(v.getTag().toString());
                        temp_reaction.add(elements.get(finalI));
                        elements.get(finalI).startAnimation(pulse);
                        if (data_reaction.containsKey(v.getTag().toString(), reaction.get(0)) == true ){
                            for (int a = 0; a < elements.size(); a++){
                                if(!temp_reaction.contains(elements.get(a)))
                                elements.get(a).clearAnimation();
                            }
                            lay_reaksi.setVisibility(View.VISIBLE);
                            txt_simbol.setText(data_reaction.get(v.getTag().toString(), reaction.get(0)).getReact_simbol());
                            txt_massa.setText(data_reaction.get(v.getTag().toString(), reaction.get(0)).getReact_massa());
                            txt_reaksi.setText(data_reaction.get(v.getTag().toString(), reaction.get(0)).getReact_reaction());
                            txt_nama.setText(data_reaction.get(v.getTag().toString(), reaction.get(0)).getReact_nama());
                            txt_ikatan.setText(data_reaction.get(v.getTag().toString(), reaction.get(0)).getReact_ikatan());
                            img_senyawa.setImageResource(data_reaction.get(v.getTag().toString(), reaction.get(0)).getReact_gambar());
                            reaction.clear();
                            clicked[0] = false;
                            click[0] = 0;
                        }
                        else if (data_reaction.containsKey(reaction.get(0), v.getTag()) == true){
                            for (int a = 0; a < elements.size(); a++){
                                if(!temp_reaction.contains(elements.get(a)))
                                    elements.get(a).clearAnimation();
                            }
                            lay_reaksi.setVisibility(View.VISIBLE);
                            txt_simbol.setText((data_reaction.get(reaction.get(0), v.getTag()).getReact_simbol()));
                            txt_massa.setText(data_reaction.get(reaction.get(0), v.getTag()).getReact_massa());
                            txt_reaksi.setText(data_reaction.get(reaction.get(0), v.getTag()).getReact_reaction());
                            txt_nama.setText(data_reaction.get(reaction.get(0), v.getTag()).getReact_nama());
                            txt_ikatan.setText(data_reaction.get(reaction.get(0),v.getTag().toString()).getReact_ikatan());
                            img_senyawa.setImageResource(data_reaction.get( reaction.get(0), v.getTag().toString()).getReact_gambar());
                            reaction.clear();
                            clicked[0] = false;
                            click[0] = 0;
                        }
                        else {
                            reaction.remove(v.getTag().toString());
                            temp_reaction.remove(elements.get(finalI));
                            elements.get(finalI).clearAnimation();
                            Toast.makeText(getApplicationContext(), "Unsur " + v.getTag().toString() + " tidak dapat bereaksi dengan " + reaction.get(0) + ".", Toast.LENGTH_SHORT).show();
                            clicked[0] = true;
                            click[0] = 1;
                        }
                    }
                }
            });
        }
    }

    protected void onResume() {
        super.onResume();
        if (prefs_playground.getBoolean("firstrun", true)) {
            showPopup_pgr();
            prefs_playground.edit().putBoolean("firstrun", false).commit();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }


    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;

    public void showPopup_pgr(){

        dialogBuilder = new AlertDialog.Builder(this);
        final View popupView = getLayoutInflater().inflate(R.layout.pop_playground, null);
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
