package mx.com.bg.PersonaCRUD.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import mx.com.bg.PersonaCRUD.model.Persona;
import mx.com.bg.PersonaCRUD.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas/")
public class RestPersona {

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    @GetMapping
    private ResponseEntity<List<Persona>> getAllPersonas() {
        return ResponseEntity.ok(personaServiceImpl.getAllPersonas());
    }

    @PostMapping
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        
        try {
            Persona personaCreated = personaServiceImpl.createPersona(persona);
            return ResponseEntity.created(new URI("/personas/" + personaCreated.getIdpersona())).body(personaCreated);
        } catch (URISyntaxException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deletePersona(@PathVariable("id") Long id){
        return ResponseEntity.ok((personaServiceImpl.deletePersona(id))==null);
    }
}
