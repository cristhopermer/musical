package Modelo;

public class musico {
    private String identidad;
    private String nombre;
    private String apellido;
    private String genero;
    private instrumentos inst;

    public musico() {
    }
    public musico(String identidad, String nombre, String apellido, String genero, instrumentos inst) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.inst = inst;
    }
    public String getIdentidad() {
        return identidad;
    }
    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getInst() {
        if (this.inst==null){
            return "";
        }        
        return inst.getNombre2();
        
    }
    public void setInst(instrumentos inst) {
        this.inst = inst;
    }  
}
