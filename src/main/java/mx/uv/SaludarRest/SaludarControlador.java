package mx.uv.SaludarRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController 
public class SaludarControlador {
    int id=1;
    ArrayList<Saludador> saludarLista = new ArrayList<Saludador>();

    @RequestMapping("/SaludarRequest/{nombre}")
    public String SaludarRequest(@PathVariable(("nombre"))String nombre){
         
        Saludador saludo = new Saludador();
        saludo.setId(id);
        saludo.setNombre(nombre);
        saludarLista.add(saludo);
        id += 1;
        return "hola "+ nombre+ " con id: "+ id;
    
    }

    @GetMapping("/BuscarSaludosRequest")
    public ArrayList<Saludador> BuscarSaludosRequest()
    {
        return saludarLista;
    }


    @GetMapping("/ModificarSaludoRequest/{id}/{nombre}")
    public Boolean ModificarSaludoRequest(@PathVariable("id") int id, @PathVariable("nombre") String nombre)
    {
        for(Saludador o : saludarLista)
        {
            if(o.getId() == id)
            {
                o.setId(id);
                o.setNombre(nombre);
            }
        }
        
        return true;
    }

    @GetMapping("/BorrarSaludoResponse/{id}")
    public Boolean BorrarSaludoResponse(@PathVariable("id") int id)
    {
        for(Saludador o : saludarLista)
        {
            if(o.getId() == id)
            {
                saludarLista.remove(o);
            }
        }
        
        return true;
    }

    
}
