package tpfinal.osuti;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import tpfinal.osuti.domain.Turno;

@Entity (tableName ="itemsTurno")
public class ItemsTurno implements Parcelable{

    @PrimaryKey(autoGenerate = true)
    private Integer id;

    @ForeignKey(entity = Turno.class,parentColumns = "id", childColumns = "idTurno",onUpdate = ForeignKey.CASCADE)
    private Integer idTurno;
    private Turno turno;
    private Integer nroafiliado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Integer getNroafiliado() {
        return nroafiliado;
    }

    public void setNroafiliado(Integer nroafiliado) {
        this.nroafiliado = nroafiliado;
    }

    @Override
    public  String toString(){
        return nroafiliado + "turno" + turno.getIdTurno();
    }



    public ItemsTurno(){}




    protected ItemsTurno(Parcel in) {
    }

    public static final Creator<ItemsTurno> CREATOR = new Creator<ItemsTurno>() {
        @Override
        public ItemsTurno createFromParcel(Parcel in) {
            return new ItemsTurno(in);
        }

        @Override
        public ItemsTurno[] newArray(int size) {
            return new ItemsTurno[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeLong(idTurno);
        dest.writeParcelable(turno, flags);
        dest.writeInt(nroafiliado);
    }

    private void readFromParcel(Parcel in) {
        this.id = in.readInt();
        this.idTurno = in.readInt();
        this.turno = in.readParcelable(Turno.class.getClassLoader());
        this.nroafiliado = in.readInt();

    }
}
