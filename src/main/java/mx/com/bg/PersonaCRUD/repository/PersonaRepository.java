package mx.com.bg.PersonaCRUD.repository;

import mx.com.bg.PersonaCRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
