package tpfinal.osuti;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class loginuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginuser);
        //me faltan las declaraciones del usuario y contraseña y la validacion
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusuario,menu);
        return super.onCreateOptionsMenu(menu);
    }


    //tendria que hacer que valide el usuario y despues de eso recien mostrar los items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
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
                return true;

        }

        return super.onOptionsItemSelected(item);
    }


}
