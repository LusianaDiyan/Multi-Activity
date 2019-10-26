package applusiana.multyactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMinuman, btnMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMinuman = findViewById(R.id.btnMinum);
        btnMakanan = findViewById(R.id.btnMakan);

        btnMinuman.setOnClickListener(this);

        btnMakanan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        if (v.getId() == R.id.btnMakan){
            intent = new Intent(MainActivity.this, MakananActivity.class);
        }else if (v.getId() == R.id.btnMinum){
            intent = new Intent(MainActivity.this, MinumanActivity.class);
        }
        startActivity(intent);
    }
}
