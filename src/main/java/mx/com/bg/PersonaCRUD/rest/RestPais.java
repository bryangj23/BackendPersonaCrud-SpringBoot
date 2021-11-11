package mx.com.bg.PersonaCRUD.rest;

import java.util.List;
import mx.com.bg.PersonaCRUD.model.Pais;
import mx.com.bg.PersonaCRUD.service.PaisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises/")
public class RestPais {
    @Autowired
    private PaisServiceImpl paisServiceImpl;
    
    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises(){
        return ResponseEntity.ok(paisServiceImpl.getAllPais());
    }
}
