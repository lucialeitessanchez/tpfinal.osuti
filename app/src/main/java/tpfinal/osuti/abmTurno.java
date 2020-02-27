package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tpfinal.osuti.domain.Turno;

public class abmTurno extends AppCompatActivity {
    Button btnAlta,btnModif,btnBaja;
    public static final String TURNOSLISTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abm_turno);



        btnAlta=(Button)findViewById(R.id.btnTurnonuevo);
        btnModif=(Button)findViewById(R.id.btnTurnoMofif);
        btnBaja=(Button)findViewById(R.id.btnTurnoeliminar);


        final Resources resources = getResources();

        btnAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Turno turno = new Turno();

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
