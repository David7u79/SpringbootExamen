package api;
import entity.Incidencia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class incidencia_api {
    @RequestMapping(value = "/in",method = RequestMethod.GET)
    public Incidencia getById(){
        return new Incidencia(1,"incidencia1","Activo","01/05/2020","Activo");
    }

}
