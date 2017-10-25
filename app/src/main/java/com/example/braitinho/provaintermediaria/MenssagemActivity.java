package com.example.braitinho.provaintermediaria;
/*Nome: Daniel Brait Fernandes da Silva
  RA: 201517694*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;



public class MenssagemActivity extends Activity {
    /*Nome: Daniel Brait Fernandes da Silva
      RA: 201517694*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menssagem);
        Intent intent  = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setText(message.replace("a","2").replace("b", "2").replace("c", "2").replace("d", "3").replace("e", "3").replace("f", "3").replace("g", "4").replace("h", "4").replace("i", "4").replace("j", "5").replace("k", "5").replace("l", "5").replace("m", "6").replace("n", "6").replace("o", "6").replace("p", "7").replace("q", "7").replace("r", "7").replace("s", "7").replace("t", "8").replace("u", "8").replace("v", "8").replace("w", "9").replace("x", "9").replace("y", "9").replace("z", "9"));
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_mensagem);
        layout.addView(textView);

    }

}
