package tpfinal.osuti;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tpfinal.osuti.domain.Usuario;

@Dao
public interface UsuarioDao {
    @Query("SELECT * FROM usuario")
    List<Usuario> getAll();

    @Insert
    void insert(Usuario usuario);

    @Insert
    void insertAll(Usuario... usuarios);

    @Delete
    void delete(Usuario usuario);

    @Update
    void actualizar(Usuario usuario);
}
