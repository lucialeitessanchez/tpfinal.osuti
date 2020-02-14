package tpfinal.osuti;

import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import tpfinal.osuti.domain.Usuario;

public class UsuarioListActivity extends AppCompatActivity {
    ArrayAdapter<Usuario> adapter;
    ListView lvUsuarios;
    List<Usuario> listaUsuariosDataset;

}
