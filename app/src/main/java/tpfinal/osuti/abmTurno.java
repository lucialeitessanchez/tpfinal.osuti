package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import tpfinal.osuti.domain.Turno;

public class abmTurno extends AppCompatActivity {
    Button btnAlta,btnModif,btnBaja;
    //public static final String TURNOSLISTA;
    EditText idTurno,nroAfiliado,fecha,hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abm_turno);



        btnAlta=(Button)findViewById(R.id.btnTurnonuevo);
        btnModif=(Button)findViewById(R.id.btnTurnoMofif);
        btnBaja=(Button)findViewById(R.id.btnTurnoeliminar);

        idTurno = (EditText)findViewById(R.id.ETidTurno);
        nroAfiliado = (EditText)findViewById(R.id.ETnroafiliadoabm);
        fecha = (EditText)findViewById(R.id.ETdateabm);
        hora = (EditText)findViewById(R.id.ETHoraadm);

        final Resources resources = getResources();

        btnAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Turno turno = new Turno();

                int intVal = Integer.parseInt(idTurno.getText().toString());
                turno.setIdTurno(intVal);

                turno.setNroafiliado(Integer.parseInt(nroAfiliado.getText().toString()));



            }
        });

        btnModif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnBaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
