package mx.com.bg.PersonaCRUD.service;

import java.util.ArrayList;
import java.util.List;
import mx.com.bg.PersonaCRUD.model.Persona;
import mx.com.bg.PersonaCRUD.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements IPersona {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersonas() {
        var personasDB = personaRepository.findAll();
        List<Persona> personas = new ArrayList<>();
        
        for (Persona persona : personasDB) {
            if(!(persona.getEstado_db().equals("DELETE"))){
                personas.add(persona);
            }  
        }

        return personas;
    }

    @Override
    public Persona getPersona(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    public Persona createPersona(Persona persona) {
        persona.setEstado_db("CREATED");
        return personaRepository.save(persona);
    }

    public Persona updatePersona(Persona persona) {
        Persona personaDB = getPersona(persona.getIdpersona());
        if (personaDB == null) {
            return null;
        }

        personaDB.setNombre(persona.getNombre());
        personaDB.setApellido(persona.getApellido());
        personaDB.setEdad(persona.getEdad());
        personaDB.setEstado(persona.getEstado());
        personaDB.setPais(persona.getPais());

        return personaRepository.save(personaDB);
    }

    public Persona deletePersona(Long id) {
        Persona personaDB = getPersona(id);
        if (personaDB == null) {
            return null;
        }
        personaDB.setEstado_db("DELETE");
        return personaRepository.save(personaDB);
    }
}
