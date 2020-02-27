package tpfinal.osuti;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import tpfinal.osuti.domain.Turno;
import tpfinal.osuti.domain.Usuario;


@Database(entities ={Usuario.class, Turno.class,ItemsTurno.class}, version = 1 )
public abstract class UsuarioAppDB extends RoomDatabase {
    public abstract UsuarioDao usuarioDao();
    public abstract TurnoDao turnoDao();
    public abstract ItemsTurnoDao itemsTurnoDao();
}
