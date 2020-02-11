package tpfinal.osuti.domain;

public class usuario {

    private String nombreyapellido;
    private Integer numeroafiliado;
    private String email;
    private String contraseña;

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



    public usuario(String nombreyapellido, Integer numeroafiliado, String email, String contraseña) {
        this.nombreyapellido = nombreyapellido;
        this.numeroafiliado = numeroafiliado;
        this.email = email;
        this.contraseña = contraseña;
    }

    public usuario(){}
    

}
