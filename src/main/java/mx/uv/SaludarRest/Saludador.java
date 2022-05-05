package mx.uv.SaludarRest;

public class Saludador {
    private String  nombre;
    private int id;

    public Saludador(int id, String nombre){
        this.id = id;
        this. nombre =  nombre;
        
    }

    public String getContenido(){
        return  nombre;
    }

    public int getId(){
        return id;
    }

    
}
