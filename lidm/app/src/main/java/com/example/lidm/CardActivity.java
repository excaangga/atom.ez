package com.example.lidm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        hideSystemUI();

        ImageView back = (ImageView) findViewById(R.id.backbutton_card);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView cardbg = (ImageView) findViewById(R.id.card);

        Intent intent = getIntent();

        String stuff = intent.getStringExtra("data");

        switch (stuff) {
            case "h":
                cardbg.setImageResource(R.drawable.card_h);
                break;
            case "li":
                cardbg.setImageResource(R.drawable.card_li);
                break;
            case "na":
                cardbg.setImageResource(R.drawable.card_na);
                break;
            case "k":
                cardbg.setImageResource(R.drawable.card_k);
                break;
            case "rb":
                cardbg.setImageResource(R.drawable.card_rb);
                break;
            case "cs":
                cardbg.setImageResource(R.drawable.card_cs);
                break;

            case "be":
                cardbg.setImageResource(R.drawable.card_be);
                break;
            case "mg":
                cardbg.setImageResource(R.drawable.card_mg);
                break;
            case "ca":
                cardbg.setImageResource(R.drawable.card_ca);
                break;
            case "sr":
                cardbg.setImageResource(R.drawable.card_sr);
                break;
            case "ba":
                cardbg.setImageResource(R.drawable.card_ba);
                break;

            case "b":
                cardbg.setImageResource(R.drawable.card_b);
                break;
            case "al":
                cardbg.setImageResource(R.drawable.card_al);
                break;
            case "ga":
                cardbg.setImageResource(R.drawable.card_ga);
                break;
            case "in":
                cardbg.setImageResource(R.drawable.card_in);
                break;
            case "tl":
                cardbg.setImageResource(R.drawable.card_tl);
                break;

            case "c":
                cardbg.setImageResource(R.drawable.card_c);
                break;
            case "si":
                cardbg.setImageResource(R.drawable.card_si);
                break;
            case "ge":
                cardbg.setImageResource(R.drawable.card_ge);
                break;
            case "sn":
                cardbg.setImageResource(R.drawable.card_sn);
                break;
            case "pb":
                cardbg.setImageResource(R.drawable.card_pb);
                break;

            case "n":
                cardbg.setImageResource(R.drawable.card_n);
                break;
            case "p":
                cardbg.setImageResource(R.drawable.card_p);
                break;
            case "as":
                cardbg.setImageResource(R.drawable.card_as);
                break;
            case "sb":
                cardbg.setImageResource(R.drawable.card_sb);
                break;
            case "bi":
                cardbg.setImageResource(R.drawable.card_bi);
                break;

            case "o":
                cardbg.setImageResource(R.drawable.card_o);
                break;
            case "s":
                cardbg.setImageResource(R.drawable.card_s);
                break;
            case "se":
                cardbg.setImageResource(R.drawable.card_se);
                break;
            case "te":
                cardbg.setImageResource(R.drawable.card_te);
                break;
            case "po":
                cardbg.setImageResource(R.drawable.card_po);
                break;

            case "f":
                cardbg.setImageResource(R.drawable.card_f);
                break;
            case "cl":
                cardbg.setImageResource(R.drawable.card_cl);
                break;
            case "br":
                cardbg.setImageResource(R.drawable.card_br);
                break;
            case "i":
                cardbg.setImageResource(R.drawable.card_i);
                break;
            case "at":
                cardbg.setImageResource(R.drawable.card_at);
                break;

            case "he":
                cardbg.setImageResource(R.drawable.card_he);
                break;
            case "ne":
                cardbg.setImageResource(R.drawable.card_ne);
                break;
            case "ar":
                cardbg.setImageResource(R.drawable.card_ar);
                break;
            case "kr":
                cardbg.setImageResource(R.drawable.card_kr);
                break;
            case "xe":
                cardbg.setImageResource(R.drawable.card_xe);
                break;
            case "rn":
                cardbg.setImageResource(R.drawable.card_rn);
                break;

            case "sc":
                cardbg.setImageResource(R.drawable.card_sc);
                break;
            case "y":
                cardbg.setImageResource(R.drawable.card_y);
                break;
            case "ti":
                cardbg.setImageResource(R.drawable.card_ti);
                break;
            case "zr":
                cardbg.setImageResource(R.drawable.card_zr);
                break;
            case "hf":
                cardbg.setImageResource(R.drawable.card_hf);
                break;
            case "v":
                cardbg.setImageResource(R.drawable.card_v);
                break;
            case "nb":
                cardbg.setImageResource(R.drawable.card_nb);
                break;
            case "ta":
                cardbg.setImageResource(R.drawable.card_ta);
                break;
            case "cr":
                cardbg.setImageResource(R.drawable.card_cr);
                break;
            case "mo":
                cardbg.setImageResource(R.drawable.card_mo);
                break;
            case "w":
                cardbg.setImageResource(R.drawable.card_w);
                break;
            case "mn":
                cardbg.setImageResource(R.drawable.card_mn);
                break;
            case "tc":
                cardbg.setImageResource(R.drawable.card_tc);
                break;
            case "re":
                cardbg.setImageResource(R.drawable.card_re);
                break;
            case "fe":
                cardbg.setImageResource(R.drawable.card_fe);
                break;
            case "ru":
                cardbg.setImageResource(R.drawable.card_ru);
                break;
            case "os":
                cardbg.setImageResource(R.drawable.card_os);
                break;
            case "co":
                cardbg.setImageResource(R.drawable.card_co);
                break;
            case "rh":
                cardbg.setImageResource(R.drawable.card_rh);
                break;
            case "ir":
                cardbg.setImageResource(R.drawable.card_ir);
                break;
            case "ni":
                cardbg.setImageResource(R.drawable.card_ni);
                break;
            case "pd":
                cardbg.setImageResource(R.drawable.card_pd);
                break;
            case "pt":
                cardbg.setImageResource(R.drawable.card_pt);
                break;
            case "cu":
                cardbg.setImageResource(R.drawable.card_cu);
                break;
            case "ag":
                cardbg.setImageResource(R.drawable.card_ag);
                break;
            case "au":
                cardbg.setImageResource(R.drawable.card_au);
                break;
            case "zn":
                cardbg.setImageResource(R.drawable.card_zn);
                break;
            case "cd":
                cardbg.setImageResource(R.drawable.card_cd);
                break;
            case "hg":
                cardbg.setImageResource(R.drawable.card_hg);
                break;
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
}
