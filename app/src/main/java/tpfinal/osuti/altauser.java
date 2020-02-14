package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

import tpfinal.osuti.domain.Usuario;

public class altauser extends AppCompatActivity {

    EditText nombape;
    EditText numafiliado;
    EditText email;
    EditText pass;
    Button registrar;
    Usuario usuarioActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altauser);

        nombape = (EditText) findViewById(R.id.etNombreyApellido);
        if(nombape.getText().toString().isEmpty()){
            Toast.makeText(this,"Debe ingresar un nombre y apellido", Toast.LENGTH_LONG).show();
        }
        else{
           this.usuarioActual = (Usuario) getIntent().getExtras().get("usuarioEditar");
           nombape.setText(this.usuarioActual.getNombreyapellido());
            // QUE HAGA ALGO O NADA
        }

        numafiliado = (EditText) findViewById(R.id.evnroafiliado);
        if(numafiliado.getText().toString().isEmpty()){
            Toast.makeText(this,"Debe ingresar un numero de afiliado valido", Toast.LENGTH_LONG).show();
        }
        else{
            this.usuarioActual = (Usuario) getIntent().getExtras().get("usuarioEditar");
            numafiliado.setText(this.usuarioActual.getNumeroafiliado());
        }

        email = (EditText) findViewById(R.id.etmail);
        if(email.getText().toString().isEmpty()){
            Toast.makeText(this,"Debe ingresar un mail valido", Toast.LENGTH_LONG).show();
        }
        else
        {
            this.usuarioActual = (Usuario) getIntent().getExtras().get("usuarioEditar");
            email.setText(this.usuarioActual.getEmail());
        }

        pass = (EditText) findViewById(R.id.etpass);
        if(pass.getText().toString().isEmpty()){
            Toast.makeText(this,"Debe ingresar una contraseña valida", Toast.LENGTH_LONG).show();
        }
        else
        {
            this.usuarioActual = (Usuario) getIntent().getExtras().get("usuarioEditar");
            pass.setText(this.usuarioActual.getContraseña());
        }

        registrar = (Button) findViewById(R.id.buttonRegistrar);

        registrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //ACA VA LO DE LA DB

                if(usuarioActual == null) {
                    usuarioActual = new Usuario();
                }
                usuarioActual.setNombreyapellido(nombape.getText().toString());
                RegistrarUsuario tareaRegistrarUsuario = new RegistrarUsuario();
                tareaRegistrarUsuario.execute(usuarioActual);
            }

        });


        }

    class RegistrarUsuario extends AsyncTask<Usuario, Void, Void> {

        @Override
        protected Void doInBackground(Usuario... usuarios) {
            UsuarioDao dao = DBClient.getInstance(altauser.this).getUsuarioDb().usuarioDao();
            if(usuarios[0].getNumeroafiliado() != null && usuarios[0].getNumeroafiliado() >0) {
                dao.actualizar(usuarios[0]);
            }else {
                dao.insert(usuarios[0]);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            usuarioActual = null;
            Intent i = new Intent(altauser.this, UsuarioListActivity.class);
            startActivity(i);
        }


}
}
