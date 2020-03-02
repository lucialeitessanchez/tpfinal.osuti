package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginuser extends AppCompatActivity {
    EditText usuario,contraseña;
    Button ingresarLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginuser);

        //me faltan las declaraciones del usuario y contraseña y la validacion
     usuario=(EditText)findViewById(R.id.etuser);
     contraseña=(EditText)findViewById(R.id.editTextPassuser);
     ingresarLogin=(Button)findViewById(R.id.btningresaruser);

     ingresarLogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             //que valide y que despues vaya a la pantalla del menu usuario
             if((usuario.getText().toString()).equals((contraseña.getText().toString())) && !(usuario.getText().toString().equals(""))){
            Intent i;
            i= new Intent(loginuser.this, menuUsuario.class);
            startActivity(i);
             }
             else {
                 Toast.makeText(getApplicationContext(),"usuario/contraseña invalidos",Toast.LENGTH_LONG).show();
             }
         }
     });

    }




    //tendria que hacer que valide el usuario y despues de eso recien mostrar los items
   /* @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent,intent2,intent3;
        switch (item.getItemId()){
            case (R.id.item_listamedicos):
                intent = new Intent(loginuser.this,listamedicos.class);
                startActivity(intent);
                return true;

            case (R.id.item_Afiliacion):
                //hacer lo de afiliacion

                return true;

            case (R.id.item_turnos):
                //hacer lo de turnos
                intent3 = new Intent(loginuser.this,abmTurno.class);
                startActivity(intent3);
                return true;

            default:
                Toast.makeText(this,". . . . ", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);

        }


    }
*/

}
