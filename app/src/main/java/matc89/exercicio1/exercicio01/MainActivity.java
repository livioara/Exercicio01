package matc89.exercicio1.exercicio01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextView campoMensagem;
    private String nome;
    static final String CHAVE_NOME = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoNome = findViewById(R.id.editNome);
        campoMensagem = findViewById(R.id.labelMensagem);

    }

    public void cumprimentar(View view){

        nome =campoNome.getText().toString();
        campoMensagem.setText("Alô, " + nome +"!");
        campoNome.setText("");

    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString(CHAVE_NOME, nome);


    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        nome= savedInstanceState.getString(CHAVE_NOME,"Alô:" );
        campoMensagem.setText("Alô, " +nome + "!");
    }



}