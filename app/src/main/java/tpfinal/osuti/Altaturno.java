package tpfinal.osuti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import tpfinal.osuti.domain.Turno;

public class Altaturno extends AppCompatActivity{

    EditText idTurno, nroAfiliado, fecha, hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        idTurno = (EditText) findViewById(R.id.ETidTurno);
        nroAfiliado = (EditText) findViewById(R.id.ETnroafiliadoabm);
        fecha = (EditText) findViewById(R.id.ETdateabm);
        hora = (EditText) findViewById(R.id.ETHoraadm);

        Turno turnoAlta = new Turno();

        //seteo de variables
        int intVal = Integer.parseInt(idTurno.getText().toString());
        turnoAlta.setIdTurno(intVal);
        turnoAlta.setNroafiliado(Integer.parseInt(nroAfiliado.getText().toString()));
        turnoAlta.setHora(Integer.parseInt(hora.getText().toString()));

        Intent intentResultado = new Intent();
        setResult(Activity.RESULT_OK, intentResultado);
        finish();


    }
}