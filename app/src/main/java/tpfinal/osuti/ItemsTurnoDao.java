package tpfinal.osuti;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ItemsTurnoDao {

    @Insert
    void crearItemsTurno(ItemsTurno itemsTurno);

    @Delete
    void borrarItemsTurno(ItemsTurno itemsTurno);

    @Update
    void actualizarItemsTurno(ItemsTurno itemsTurno);

    @Query("SELECT * FROM ItemsTurno")
    List<ItemsTurno> buscarItemsTurno();

    // ESTO DEBERIA ESTAR IMPLEMETADO EN PedidoEItemsPedidoDAO para alivianar la consulta a la db
    @Query("SELECT * FROM ItemsTurno WHERE idTurno = :idTurno")
    List<ItemsTurno> buscarItemsDeUnTurno(Integer idTurno);
}
