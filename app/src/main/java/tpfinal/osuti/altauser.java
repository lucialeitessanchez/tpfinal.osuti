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
    EditText pass,pass2;
    Button registrar;
    Usuario usuarioActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altauser);

        nombape = (EditText) findViewById(R.id.etNombreyApellido);
        numafiliado = (EditText) findViewById(R.id.evnroafiliado);
        email = (EditText) findViewById(R.id.etmail);
        pass = (EditText) findViewById(R.id.etpass);
        pass2 = (EditText) findViewById(R.id.etrepass);
        registrar = (Button) findViewById(R.id.buttonRegistrar);

        //si no rellena todos los campos no estara activo el boton registrar
        if (validarCampos()){
            registrar.setEnabled(true);
        }
        else {
            registrar.setEnabled(false);
        }


            registrar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    //ACA VA LO DE LA DB

                    if (usuarioActual == null) {
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

    private boolean validarCampos() {
        // Nombre y Apellido vacios
        if (nombape.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Debe ingresar un nombre y apellido", Toast.LENGTH_LONG).show();
            return false;
        }
        // Clave vacia
        if (pass.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Debe ingresar una clave", Toast.LENGTH_LONG).show();
            return false;
        }
        // Verificacion de clave vacia
        if (pass2.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Debe repetir la clave", Toast.LENGTH_LONG).show();
            return false;
        }
        if (!validarClave()) {
            Toast.makeText(getApplicationContext(), "Las claves no coinciden", Toast.LENGTH_LONG).show();
            return false;
        }
        // Email vacio
        if (email.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "Debe ingresar un E-mail", Toast.LENGTH_LONG).show();
            return false;
        }
        if (!validarEmail()) {
            Toast.makeText(getApplicationContext(), "El E-mail es incorrecto", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    private boolean validarEmail() {
        if(email.getText().toString().contains("@")){
            int indice = email.getText().toString().indexOf("@");
            int j = 0;
            for(int i = (indice + 1); i < email.getText().length(); i++){
                j++;
            }
            return (j >= 3);
        }
        return false;
    }

    private boolean validarClave() {
        return (pass.getText().toString().equals(pass2.getText().toString()));
    }
}

