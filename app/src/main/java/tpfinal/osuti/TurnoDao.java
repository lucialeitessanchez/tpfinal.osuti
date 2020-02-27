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
    void crearTurno(Turno turno);

    @Delete
    void borrarTurno(Turno turno);

    @Update
    void actualizarTurno(Turno turno);

    @Query("SELECT * FROM turno")
    List<Turno> buscarTurnos();

    @Query("SELECT * FROM Turno WHERE idTurno = :id")
    Turno buscarTurnoPorID(Integer id);
}
