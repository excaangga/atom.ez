package com.example.lidm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SpuActivity extends AppCompatActivity {
    SharedPreferences prefs_spu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spu);
        prefs_spu = getSharedPreferences("spu", MODE_PRIVATE);
        hideSystemUI();

        ImageView back = (ImageView) findViewById(R.id.backbutton_spu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        //Gol. 1A
        final LinearLayout h = (LinearLayout) findViewById(R.id.hydrogen);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "h";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout li = (LinearLayout) findViewById(R.id.lithium);
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "li";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout na = (LinearLayout) findViewById(R.id.sodium);
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "na";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout k = (LinearLayout) findViewById(R.id.potassium);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "k";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout rb = (LinearLayout) findViewById(R.id.rubidium);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "rb";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout cs = (LinearLayout) findViewById(R.id.caesium);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "cs";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. 2A
        final LinearLayout be = (LinearLayout) findViewById(R.id.beryllium);
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "be";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout mg = (LinearLayout) findViewById(R.id.magnesium);
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "mg";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ca = (LinearLayout) findViewById(R.id.calcium);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ca";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout sr = (LinearLayout) findViewById(R.id.strontium);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "sr";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ba = (LinearLayout) findViewById(R.id.barium);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ba";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. 3A
        final LinearLayout b = (LinearLayout) findViewById(R.id.boron);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "b";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout al = (LinearLayout) findViewById(R.id.aluminium);
        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "al";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ga = (LinearLayout) findViewById(R.id.gallium);
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ga";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout in = (LinearLayout) findViewById(R.id.indium);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "in";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout tl = (LinearLayout) findViewById(R.id.thallium);
        tl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "tl";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. 4A
        final LinearLayout c = (LinearLayout) findViewById(R.id.carbon);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "c";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout si = (LinearLayout) findViewById(R.id.silicon);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "si";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ge = (LinearLayout) findViewById(R.id.germanium);
        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ge";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout sn = (LinearLayout) findViewById(R.id.tin);
        sn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "sn";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout pb = (LinearLayout) findViewById(R.id.lead);
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "pb";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. 5A
        final LinearLayout n = (LinearLayout) findViewById(R.id.nitrogen);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "n";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout p = (LinearLayout) findViewById(R.id.phosphorous);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "p";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout as = (LinearLayout) findViewById(R.id.arsenic);
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "as";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout sb = (LinearLayout) findViewById(R.id.antimony);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "sb";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout bi = (LinearLayout) findViewById(R.id.bismuth);
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "bi";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. 6A
        final LinearLayout o = (LinearLayout) findViewById(R.id.oxygen);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "o";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout s = (LinearLayout) findViewById(R.id.sulphur);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "s";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout se = (LinearLayout) findViewById(R.id.selenium);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "se";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout te = (LinearLayout) findViewById(R.id.tellurium);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "te";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout po = (LinearLayout) findViewById(R.id.polonium);
        po.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "po";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. 7A
        final LinearLayout f = (LinearLayout) findViewById(R.id.fluorine);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "f";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout cl = (LinearLayout) findViewById(R.id.chlorine);
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "cl";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout br = (LinearLayout) findViewById(R.id.bromine);
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "br";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout i = (LinearLayout) findViewById(R.id.iodine);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "i";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout at = (LinearLayout) findViewById(R.id.astatine);
        at.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "at";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. gas mulia
        final LinearLayout he = (LinearLayout) findViewById(R.id.helium);
        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "he";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ne = (LinearLayout) findViewById(R.id.neon);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ne";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ar = (LinearLayout) findViewById(R.id.argon);
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ar";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout kr = (LinearLayout) findViewById(R.id.krypton);
        kr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "kr";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout xe = (LinearLayout) findViewById(R.id.xenon);
        xe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "xe";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout rn = (LinearLayout) findViewById(R.id.radon);
        rn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "rn";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        //Gol. B
        final LinearLayout sc = (LinearLayout) findViewById(R.id.scandium);
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "sc";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout y = (LinearLayout) findViewById(R.id.yttrium);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "y";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ti = (LinearLayout) findViewById(R.id.titanium);
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ti";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout zr = (LinearLayout) findViewById(R.id.zirconium);
        zr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "zr";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout hf = (LinearLayout) findViewById(R.id.hafnium);
        hf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "hf";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout v = (LinearLayout) findViewById(R.id.vanadium);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "v";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout nb = (LinearLayout) findViewById(R.id.niobium);
        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "nb";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ta = (LinearLayout) findViewById(R.id.tantalum);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ta";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout cr = (LinearLayout) findViewById(R.id.chromium);
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "cr";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout mo = (LinearLayout) findViewById(R.id.molybdenum);
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "mo";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout w = (LinearLayout) findViewById(R.id.tungsten);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "w";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout mn = (LinearLayout) findViewById(R.id.manganese);
        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "mn";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout tc = (LinearLayout) findViewById(R.id.technetium);
        tc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "tc";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout re = (LinearLayout) findViewById(R.id.rhenium);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "re";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout fe = (LinearLayout) findViewById(R.id.iron);
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "fe";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ru = (LinearLayout) findViewById(R.id.ruthenium);
        ru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ru";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout os = (LinearLayout) findViewById(R.id.osmium);
        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "os";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout co = (LinearLayout) findViewById(R.id.cobalt);
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "co";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout rh = (LinearLayout) findViewById(R.id.rhodium);
        rh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "rh";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ir = (LinearLayout) findViewById(R.id.iridium);
        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ir";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ni = (LinearLayout) findViewById(R.id.nickel);
        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ni";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout pd = (LinearLayout) findViewById(R.id.palladium);
        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "pd";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout pt = (LinearLayout) findViewById(R.id.platinum);
        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "pt";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout cu = (LinearLayout) findViewById(R.id.copper);
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "cu";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout ag = (LinearLayout) findViewById(R.id.silver);
        ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "ag";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout au = (LinearLayout) findViewById(R.id.gold);
        au.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "au";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout zn = (LinearLayout) findViewById(R.id.zinc);
        zn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "zn";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout cd = (LinearLayout) findViewById(R.id.cadmium);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "cd";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

        final LinearLayout hg = (LinearLayout) findViewById(R.id.mercury);
        hg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SpuActivity.this, CardActivity.class);
                String x = "hg";

                i.putExtra("data", x);

                startActivity(i);
            }
        });

    }

    protected void onResume() {
        super.onResume();
        if (prefs_spu.getBoolean("firstrun", true)) {
            showPopup_spu();
            prefs_spu.edit().putBoolean("firstrun", false).commit();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        hideSystemUI();
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

    public void showPopup_spu(){

        dialogBuilder = new AlertDialog.Builder(this);
        final View popupView = getLayoutInflater().inflate(R.layout.pop_tpi, null);
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

