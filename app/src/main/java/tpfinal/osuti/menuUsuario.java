package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuUsuario extends AppCompatActivity implements View.OnClickListener {

    Button btnMedicos,btnAfiliacion,btnTurnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);
        inicializarMenu();
    }

    private void inicializarMenu(){
        btnMedicos=(Button)findViewById(R.id.item_listamedicos);
        btnMedicos.setOnClickListener(this);
        btnTurnos=(Button)findViewById(R.id.item_turnos);
        btnTurnos.setOnClickListener(this);
        btnAfiliacion=(Button)findViewById(R.id.item_afiliacion);
        btnAfiliacion.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.item_listamedicos:
                startActivity(new Intent(menuUsuario.this,listamedicos.class));
                break;

            case R.id.item_turnos:
                startActivity(new Intent(menuUsuario.this,abmTurno.class));
                break;

            case R.id.item_afiliacion:
               // startActivity(new Intent(menuUsuario.this,listamedicos.class));
                break;
        }
    }
}
