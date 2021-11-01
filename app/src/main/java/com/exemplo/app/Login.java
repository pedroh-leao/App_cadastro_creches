package com.exemplo.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.loginBtn);

        //responsavel por implementar todos os eventos de botoes
        cadastroEventos();
    }

    private void cadastroEventos(){

        /* o botão login muda diretamente para tela inicial (MainActivity) sem nenhuma verificação apenas enquanto
        está feito só os protótipos das telas */
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent trocaAct = new Intent(Login.this, MainActivity.class);

                //pedimos para iniciar a activity passada como parâmetro
                startActivity(trocaAct);
            }
        });
    }
}