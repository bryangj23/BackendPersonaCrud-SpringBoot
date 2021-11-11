package mx.com.bg.PersonaCRUD.service;

import java.util.List;
import mx.com.bg.PersonaCRUD.model.Persona;

public interface IPersona {
    
    public List<Persona> getAllPersonas();
    public Persona getPersona(Long id);
}
