package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import tpfinal.osuti.domain.Turno;

public class abmTurno extends AppCompatActivity implements View.OnClickListener{
    Button btnAlta,btnModif,btnBaja;
    //public static final String TURNOSLISTA;
    EditText idTurno,nroAfiliado,fecha,hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abm_turno);
    }

        /*
        btnAlta=(Button)findViewById(R.id.btnTurnonuevo);
        btnModif=(Button)findViewById(R.id.btnTurnoMofif);
        btnBaja=(Button)findViewById(R.id.btnTurnoeliminar);

        idTurno = (EditText)findViewById(R.id.ETidTurno);
        nroAfiliado = (EditText)findViewById(R.id.ETnroafiliadoabm);
        fecha = (EditText)findViewById(R.id.ETdateabm);
        hora = (EditText)findViewById(R.id.ETHoraadm);

        final Resources resources = getResources();*/




                /*
                Turno turnoAlta = new Turno();

                //seteo de variables
                int intVal = Integer.parseInt(idTurno.getText().toString());
                turnoAlta.setIdTurno(intVal);
                turnoAlta.setNroafiliado(Integer.parseInt(nroAfiliado.getText().toString()));
                turnoAlta.setHora(Integer.parseInt(hora.getText().toString()));

                Intent intentResultado = new Intent();
                setResult(Activity.RESULT_OK, intentResultado);
                finish();

            }*/


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTurnonuevo:
                Intent i = new Intent(abmTurno.this, Altaturno.class );
                startActivity(i);
                break;

            case R.id.btnTurnoMofif:
                //modificar
                startActivity(new Intent(abmTurno.this, Altaturno.class));
                break;

            case R.id.btnTurnoeliminar:
                //borrar
                startActivity(new Intent(abmTurno.this, Altaturno.class));
                break;
        }
    }
}
