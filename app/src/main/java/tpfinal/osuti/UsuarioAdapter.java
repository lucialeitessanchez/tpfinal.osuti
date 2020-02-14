package tpfinal.osuti;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import tpfinal.osuti.domain.Usuario;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {
        Context context;
        public UsuarioAdapter(Context ctx, List<Usuario> lista){
            super(ctx,0,lista);
            this.context = ctx;
        }

        @NonNull
        @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            return super.getView(position, convertView, parent);
        }
}
