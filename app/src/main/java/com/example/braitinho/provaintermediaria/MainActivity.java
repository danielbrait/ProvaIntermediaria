package com.example.braitinho.provaintermediaria;

/*Nome: Daniel Brait Fernandes da Silva
  RA:201517694*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    /*Nome: Daniel Brait Fernandes da Silva
      RA: 201517694*/
    public final static String EXTRA_MESSAGE = "com.example.braitinho.provaintermediaria";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*Nome: Daniel Brait Fernandes da Silva
  RA: 201517694*/

    public void ligar(View view)
    {
        Intent intent = new Intent(this, MenssagemActivity.class);
        EditText editText = (EditText) findViewById(R.id.txt_digita);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    /*Nome: Daniel Brait Fernandes da Silva
  RA: 201517694*/
}
