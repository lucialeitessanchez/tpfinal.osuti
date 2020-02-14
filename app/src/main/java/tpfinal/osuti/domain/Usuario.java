package tpfinal.osuti.domain;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity
public class Usuario implements Parcelable{

    @PrimaryKey(autoGenerate = true)
    private String nombreyapellido;
    private Integer numeroafiliado;
    private String email;
    private String contraseña;

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public void setNumeroafiliado(Integer numeroafiliado) {
        this.numeroafiliado = numeroafiliado;
    }

        public void setEmail(String email) {
        this.email = email;
}

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public String getNombreyapellido() {
        return nombreyapellido;
    }

   public Integer getNumeroafiliado() {
        return numeroafiliado;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }



    public Usuario(Parcel parcel) {
        this.nombreyapellido = parcel.readString();
        this.numeroafiliado = parcel.readInt();
        this.email = parcel.readString();
        this.contraseña = parcel.readString();
    }

    public Usuario(){}


    @Override
    public int describeContents() {
        return this.hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if(nombreyapellido!=null)dest.writeString(nombreyapellido);
        if(numeroafiliado!=null)dest.writeInt(numeroafiliado);
        if(email!=null)dest.writeString(email);
        if(contraseña!=null)dest.writeString(contraseña);
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nombreyapellido=" + nombreyapellido +
                ", numeroafiliado='" + numeroafiliado + '\'' +
                ", email=" + email +
                ", contraseña=" + contraseña +
                '}';
    }

    @Override
    public boolean equals(Object u) {
        if (this == u) return true;
        if (u == null || getClass() != u.getClass()) return false;
        Usuario usuario = (Usuario) u;
        return Objects.equals(numeroafiliado, usuario.numeroafiliado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroafiliado);
    }


}
