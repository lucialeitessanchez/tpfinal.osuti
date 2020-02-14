package tpfinal.osuti;

import android.content.Context;

import androidx.room.Room;

public class DBClient {
    private static DBClient DB= null;

    private UsuarioAppDB usuarioDb;

    private DBClient(Context ctx){
        usuarioDb = Room.databaseBuilder(ctx,UsuarioAppDB.class, "usuarioapp-db").allowMainThreadQueries().build();
    }

    public synchronized static DBClient getInstance(Context ctx){
        if(DB==null){
            DB = new DBClient(ctx);
        }
        return DB;
    }

    public UsuarioAppDB getUsuarioDb(){
        return usuarioDb;
    }
}
