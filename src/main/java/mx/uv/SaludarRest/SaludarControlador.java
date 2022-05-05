package mx.uv.SaludarRest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RestController 
public class SaludarControlador {
    int id=0;
    List<Saludador> saludar = new ArrayList<>();

    @RequestMapping(value ="/saludar/nombre/{nombre}", method=RequestMethod.GET)
    public String Saludar(@PathVariable String nombre){
        id += 1;
        return "hola "+ nombre+ " con id: "+ id;
               
        
    }

    @GetMapping("/saludar")
    public Saludador saludarAlguien(@RequestParam(name = "xx", defaultValue="hola") String nombre){
        return new Saludador(id, nombre);
        
    }

    
}
