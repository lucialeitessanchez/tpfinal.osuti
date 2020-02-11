package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class altauser extends AppCompatActivity {

    EditText nombape;
    EditText numafiliado;
    EditText email;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altauser);

        nombape = (EditText) findViewById(R.id.etNombreyApellido);
        if(nombape.getText().toString().isEmpty()){
            Toast.makeText(this,"Debe ingresar un nombre y apellido", Toast.LENGTH_LONG).show();
        }




    }
}