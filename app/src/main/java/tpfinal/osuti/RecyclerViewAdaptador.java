package tpfinal.osuti;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tpfinal.osuti.domain.Medico;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,especialidad,direccion,horarios,telefono;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.tvnombre);
            especialidad=(TextView)itemView.findViewById(R.id.tvEspecialidad);
            direccion=(TextView)itemView.findViewById(R.id.tvdireccion);
            horarios=(TextView)itemView.findViewById(R.id.tvhorarios);
        }
    }

    public List<Medico> medicoLista;

    public RecyclerViewAdaptador(List<Medico> medicoLista){
        this.medicoLista = medicoLista;

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
        holder.direccion.setText(medicoLista.get(position).ge());
        holder.nombre.setText(medicoLista.get(position).getNombre());

    }
}
