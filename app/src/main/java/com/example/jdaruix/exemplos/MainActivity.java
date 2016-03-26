package com.example.jdaruix.exemplos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jdaruix.exemplos.util.DebugActivity;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = ((TextView) findViewById(R.id.tLogin)).getText().toString();
                String senha = ((TextView) findViewById(R.id.tSenha)).getText().toString();

                if(login.equals("jamil") && senha.equals("12345"))
                {
                    //alerta("Acesso Permitido");
                    Intent intent = new Intent(getBaseContext(), BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Jamil Salim Daruix");
                    intent.putExtras(params);
                    startActivity(intent);
                }
                else
                {
                    alerta("Acesso não permitido");
                }
            }
        });
    }

    private void alerta(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
