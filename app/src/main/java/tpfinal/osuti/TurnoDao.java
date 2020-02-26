package tpfinal.osuti;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tpfinal.osuti.domain.Turno;

@Dao
public interface TurnoDao {
    @Query("SELECT * FROM turno")
    List<Turno> getAll();

    @Insert
    void insert(Turno turno);

    @Insert
    void insertAll(Turno... turnos);

    @Delete
    void delete(Turno turno);

    @Update
    void actualizar(Turno turno);
}
