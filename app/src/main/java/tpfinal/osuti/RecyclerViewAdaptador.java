package tpfinal.osuti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tpfinal.osuti.domain.Medico;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    final String[] datos =
            new String[]{"Pediatra","Clinico","Odontologia","Cardiologia","Nutricion"};
    ArrayAdapter<String> adaptador;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,especialidad,direccion,horarios,telefono;
        private Spinner especialidadS;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.textViewNM);
            especialidad=(TextView)itemView.findViewById(R.id.tvEspecialidad);
            telefono=(TextView)itemView.findViewById(R.id.tvtelefonomedic);
            direccion=(TextView)itemView.findViewById(R.id.textViewDir);
            horarios=(TextView)itemView.findViewById(R.id.textViewHR);
            especialidadS = (Spinner) itemView.findViewById(R.id.spinnerEspecialidad);

        }
    }

    public List<Medico> medicoLista;

    public RecyclerViewAdaptador(Context c, List<Medico> medicoLista){
        this.medicoLista = medicoLista;
        this.adaptador= new ArrayAdapter<String>(c,android.R.layout.simple_spinner_item,datos);

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_medico,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(medicoLista.get(position).getNombre());
        holder.especialidad.setText(medicoLista.get(position).getEspecialidad());
        holder.telefono.setText(medicoLista.get(position).getTelefono());
        holder.direccion.setText(medicoLista.get(position).getDireccion());
        holder.horarios.setText(medicoLista.get(position).getHorarios_de_atencion());
        holder.especialidadS.setAdapter(adaptador);

    }

    @Override
    public int getItemCount() {
        return medicoLista.size();
    }
}
