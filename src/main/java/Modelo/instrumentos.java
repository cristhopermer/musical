package Modelo;

public class instrumentos {
    private String codigo2;
    private String nombre2;
    private String tipo2;

    public instrumentos() {
    }

    public instrumentos(String codigo, String nombre, String tipo) {
        this.codigo2 = codigo;
        this.nombre2 = nombre;
        this.tipo2 = tipo;
    }
    public String getCodigo2() {
        return codigo2;
    }
    public void setCodigo2(String codigo) {
        this.codigo2 = codigo;
    }
    public String getNombre2() {
        return nombre2;
    }
    public void setNombre2(String nombre) {
        this.nombre2 = nombre;
    }
    public String getTipo2() {
        return tipo2;
    }
    public void setTipo2(String tipo) {
        this.tipo2 = tipo;
    }   
}
