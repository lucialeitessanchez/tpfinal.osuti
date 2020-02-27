package tpfinal.osuti.domain;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

import tpfinal.osuti.ItemsTurno;

@Entity (tableName="turno")
public class Turno implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    private Integer idTurno;
    private Integer nroafiliado;
    private Date fecha;
    private int hora;
    @Ignore
    private List<ItemsTurno> itemsTurnoList;

    public List<ItemsTurno> getItemsTurnoList() {
        return itemsTurnoList;
    }

    public void setItemsTurnoList(List<ItemsTurno> itemsTurnoList) {
        this.itemsTurnoList = itemsTurnoList;
    }



    public Turno() {
    }

    public Turno(Parcel in){

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

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest,int flags){
        dest.writeInt(idTurno);
        dest.writeInt(nroafiliado);
        dest.writeLong(fecha.getTime());
        dest.writeInt(hora);
        dest.writeList(itemsTurnoList);

    }

    private void readFromParcel(Parcel in){
        this.idTurno=in.readInt();
        this.nroafiliado=in.readInt();
        this.fecha=new Date(in.readLong());
        this.hora=in.readInt();
        in.readList(this.itemsTurnoList, this.getClass().getClassLoader());
    }
    public static final Parcelable.Creator<Turno> CREATOR = new Parcelable.Creator<Turno>() {
        public Turno createFromParcel(Parcel in) {
            return new Turno(in);
        }

        public Turno[] newArray(int size) {
            return new Turno[size];
        }
    };


}
