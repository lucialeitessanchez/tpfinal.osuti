package tpfinal.osuti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    Button btnNewuser;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(Toolbar)findViewById(R.id.toolbar_principal);
        btnNewuser=(Button) findViewById(R.id.botonNuevouser);
        btnIngresar=(Button) findViewById(R.id.botonIngresar);

        btnNewuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, altauser.class);
                startActivity(i);
            }
        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // QUE VAYA AL MENU PRINCIPAL
            }
        });

    }


}
