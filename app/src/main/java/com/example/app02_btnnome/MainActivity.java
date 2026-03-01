package com.example.app02_btnnome;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText edtTxt, editTxtEmail;
    private Button btn;
    private TextView textViewResultadoNome, textViewResultadoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //vinculando os XMLs
        edtTxt = findViewById(R.id.edtTxtNome);
        editTxtEmail = findViewById(R.id.editTxtEmail);
        btn = findViewById(R.id.btnExibir);
        textViewResultadoNome = findViewById(R.id.textViewResultadoNome);
        textViewResultadoEmail = findViewById(R.id.textViewResultadoEmail);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtTxt.getText().toString();
                String email = editTxtEmail.getText().toString();

                //validação
                if (!nome.isEmpty() && !email.isEmpty()){
                    textViewResultadoNome.setText("Nome: " + nome);
                    textViewResultadoEmail.setText("Email: " + email);
                    Toast.makeText(MainActivity.this, "Dados processados com sucesso!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Por favor, preencha todos os campos!", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}