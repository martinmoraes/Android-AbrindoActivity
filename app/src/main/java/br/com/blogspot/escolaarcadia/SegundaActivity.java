package br.com.blogspot.escolaarcadia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.com.escolaarcadia.android_abrindoactivity.R;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        String msg = getIntent().getStringExtra("menssagem");
         msg += " " + getIntent().getStringExtra("data");

        TextView tv = (TextView) findViewById(R.id.textView);

        tv.setText(msg);




    }
}
