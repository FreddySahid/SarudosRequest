package mx.uv.SaludarRest;

public class Saludador {
    private String  nombre;
    private int id;

    public Saludador(int id, String nombre){
        this.id = id;
        this. nombre =  nombre;
        
    }

    public String getNombre(){
        return  nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    
}
