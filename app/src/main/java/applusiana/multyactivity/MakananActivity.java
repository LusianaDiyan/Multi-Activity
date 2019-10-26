package applusiana.multyactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Path;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by USER on 15/03/2018.
 */

public class MakananActivity extends Activity {

    CheckBox Gulai, stKambing, stAyam, Pecel, Lemak, Opor, AyGoreng, AyBakar, AyPanggang;
    Button pesanMakan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        stKambing   = findViewById(R.id.sateKam);
        stAyam      = findViewById(R.id.sateAyam);
        Gulai       = findViewById(R.id.gulai);
        Pecel       = findViewById(R.id.pecel);
        Lemak       = findViewById(R.id.lemak);
        Opor        = findViewById(R.id.opor);
        AyGoreng    = findViewById(R.id.ayGoreng);
        AyBakar     = findViewById(R.id.ayBakar);
        AyPanggang  = findViewById(R.id.ayPanggang);
        pesanMakan  = findViewById(R.id.btnMakan);

        pesanMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertPesan = new AlertDialog
                        .Builder(MakananActivity.this).create();
                alertPesan.setTitle("Message");
                alertPesan.setMessage("Makanan yang Anda pesan :" + Makanan());
                alertPesan.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                });

                alertPesan.setButton(AlertDialog.BUTTON_NEGATIVE, "CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                    }
                });

                alertPesan.show();
            }
        });

        super.onBackPressed();
    }

    public String Makanan(){
        String Makan = "";

        if (Gulai.isChecked()){
            Makan = "Gulai Kambing ;";
        }
        if (stKambing.isChecked()){
            Makan = "Sate Kambing ;";
        }
        if (stAyam.isChecked()){
            Makan = "Sate Ayam ;";
        }
        if (Pecel.isChecked()){
            Makan = "Nasi Pecel ;";
        }
        if (Lemak.isChecked()){
            Makan = "Nasi Lemak ;";
        }
        if (Opor.isChecked()){
            Makan = "Opor Ayam ;";
        }
        if (AyGoreng.isChecked()){
            Makan = "Ayam Goreng ;";
        }
        if (AyBakar.isChecked()){
            Makan = "Ayam Bakar ;";
        }
        if (AyPanggang.isChecked()){
            Makan = "Ayam Panggang ;";
        }
        return Makan;
    }
}
