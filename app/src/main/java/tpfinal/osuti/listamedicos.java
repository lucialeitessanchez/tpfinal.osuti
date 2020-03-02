package tpfinal.osuti;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import tpfinal.osuti.domain.Medico;

public class listamedicos extends AppCompatActivity {

    private RecyclerView recyclerViewMedico;
    private RecyclerViewAdaptador adaptadorMedico;
    private Spinner especialidadS;



    final String[] datos =
    new String[]{"Pediatra","Clinico","Odontologia","Cardiologia","Nutricion"};

    ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datos);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listamedicos);


        recyclerViewMedico=(RecyclerView)findViewById(R.id.recyclerMedico);
        recyclerViewMedico.setLayoutManager(new LinearLayoutManager(this));

        adaptadorMedico=new RecyclerViewAdaptador(obtenerMedicos());
        recyclerViewMedico.setAdapter(adaptadorMedico);

        especialidadS = (Spinner) findViewById(R.id.spinnerEspecialidad);
        especialidadS.setAdapter(adaptador);
        
}



    public List<Medico> obtenerMedicos(){
        List<Medico> medico=new ArrayList<>();
        medico.add(new Medico("Paula Castillo","Pediatra", 4607046,"Av.Aristobulo del Valle 6634",8-20));
       medico.add(new Medico("Federico Gauchat","Clinico",4607046,"Av. Aristóbulo del Valle 6634",8-20));
       medico.add(new Medico("Benjamin Sanchez","Cardiologia",4607046,"Av. Aristóbulo del Valle 6634",8-20));
       medico.add(new Medico("Nicolas Cejas","Clinico",4560067," Belgrano 3055",9-12));
       medico.add(new Medico("Gabriela Caporizzo","Odontologia",4560067," Belgrano 3055",9-12));
       medico.add(new Medico("Walter Leites","Pediatra",4560067," Belgrano 3055",14-18));
       medico.add(new Medico("Virginia Perez","Clinico", 4552678,"Obispo Gelabert 2736",16-20));
       medico.add(new Medico("Pablo Seguro","Odontologia", 4552678,"Obispo Gelabert 2736",16-20));
       medico.add(new Medico("Claudia Sanchez","Cardiologia", 4552678,"Obispo Gelabert 2736",9-12));
       medico.add(new Medico("Rodrigo Castillo","Odontologia",  4529335,"Belgrano 3049",9-12));
       medico.add(new Medico("Mauro Monti","Clinico", 4529335,"Belgrano 3049",9-12));
       medico.add(new Medico("Mariana Zapata","Nutricion", 4529335,"Belgrano 3049",9-12));
       medico.add(new Medico("Rocio Lia","Cardiologia", 4552678,"Obispo Gelabert 2736",16-20));
       medico.add(new Medico("Florencia Fabbro","Otorrino", 4552678,"Obispo Gelabert 2736",16-20));
       medico.add(new Medico("Federico Arguello","Cardiologia", 4552678,"Obispo Gelabert 2736",16-20));

        return medico;
   }
}
