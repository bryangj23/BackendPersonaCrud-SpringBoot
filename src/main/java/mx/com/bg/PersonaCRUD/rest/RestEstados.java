
package mx.com.bg.PersonaCRUD.rest;

import java.util.List;
import mx.com.bg.PersonaCRUD.model.Estado;
import mx.com.bg.PersonaCRUD.service.EstadoserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado/")
public class RestEstados {
    @Autowired
    private EstadoserviceImpl estadoserviceImpl;
     
    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadoByPais(@PathVariable("id") Long idPais){
        return ResponseEntity.ok(estadoserviceImpl.findByCountry(idPais));
    } 
}
