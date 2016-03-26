package com.example.jdaruix.exemplos;

import android.os.Bundle;
import android.widget.TextView;
import com.example.jdaruix.exemplos.util.DebugActivity;

public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);
        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");
        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(nome + ", seja bem-vindo");

    }
}
