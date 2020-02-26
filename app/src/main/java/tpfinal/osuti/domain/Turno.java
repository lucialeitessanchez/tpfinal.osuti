package tpfinal.osuti.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Turno {

    @PrimaryKey(autoGenerate = true)
    private Integer idTurno;
    private Integer nroafiliado;
   // private Date fecha;
    private int hora;

    public Turno() {
    }

    public Turno(Integer idTurno, Integer nroafiliado, /*Date fecha,*/ int hora) {
        this.idTurno = idTurno;
        this.nroafiliado = nroafiliado;
       // this.fecha = fecha;
        this.hora = hora;
    }

    public Turno(Integer nroafiliado, /*Date fecha,*/ int hora) {
        this.nroafiliado = nroafiliado;
        //this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Integer getNroafiliado() {
        return nroafiliado;
    }

    public void setNroafiliado(Integer nroafiliado) {
        this.nroafiliado = nroafiliado;
    }

    /*public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }*/

    public void setHora(int hora) {
        this.hora = hora;
    }


}
