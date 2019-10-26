package applusiana.multyactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * Created by USER on 15/03/2018.
 */

public class MinumanActivity extends Activity {

    CheckBox Nangka, Anggur, Nanas, Apel, Jeruk, Mangga, Semangka, Melon, Strawberry;
    Button pesan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);
        Nangka      = findViewById(R.id.nangka);
        Anggur      = findViewById(R.id.anggur);
        Nanas       = findViewById(R.id.nanas);
        Apel        = findViewById(R.id.apel);
        Jeruk       = findViewById(R.id.jeruk);
        Mangga      = findViewById(R.id.mangga);
        Semangka    = findViewById(R.id.semangka);
        Melon       = findViewById(R.id.melon);
        Strawberry  = findViewById(R.id.straw);
        pesan       = findViewById(R.id.btnPesanMinum);

        pesan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog alertPesan = new AlertDialog
                        .Builder(MinumanActivity.this).create();
                alertPesan.setTitle("Message");
                alertPesan.setMessage("Makanan yang Anda pesan :" + Minuman());
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

    public String Minuman(){
        String Minum = "" ;

        if (Nangka.isChecked()){
            Minum = "Jus Nangka";
        }
        if (Anggur.isChecked()){
            Minum = "Jus Anggur";
        }
        if (Nanas.isChecked()){
            Minum = "Jus Nanas";
        }
        if (Apel.isChecked()){
            Minum = "Jus Apel";
        }
        if (Jeruk.isChecked()){
            Minum = "Jus Jeruk";
        }
        if (Mangga.isChecked()){
            Minum = "Jus Mangga";
        }
        if (Semangka.isChecked()){
            Minum = "Jus Semangka";
        }
        if (Melon.isChecked()){
            Minum = "Jus Melon";
        }
        if (Strawberry.isChecked()){
            Minum = "Jus Strawberry";
        }
        return Minum ;
    }

    //ketika ada notifikasi aplikasi lain, aplikasi ini tidak keluar tetapi masih bisa masuk ke apk lain
    @Override
    protected void onPause() {
        super.onPause();
    }
}
