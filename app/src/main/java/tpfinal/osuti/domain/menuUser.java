package tpfinal.osuti.domain;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import tpfinal.osuti.R;
import tpfinal.osuti.abmTurno;
import tpfinal.osuti.listamedicos;
import tpfinal.osuti.loginuser;

public class menuUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusuario,menu);
        return super.onCreateOptionsMenu(menu);
    }


    //tendria que hacer que valide el usuario y despues de eso recien mostrar los items
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent,intent2,intent3;
        switch (item.getItemId()){
            case (R.id.item_listamedicos):
                intent = new Intent(menuUser.this, listamedicos.class);
                startActivity(intent);
                return true;

            case (R.id.item_Afiliacion):
                //hacer lo de afiliacion

                return true;

            case (R.id.item_turnos):
                //hacer lo de turnos
                intent3 = new Intent(menuUser.this, abmTurno.class);
                startActivity(intent3);
                return true;

            default:
                Toast.makeText(this,". . . . ", Toast.LENGTH_LONG).show();
                return super.onOptionsItemSelected(item);

        }


    }
}
