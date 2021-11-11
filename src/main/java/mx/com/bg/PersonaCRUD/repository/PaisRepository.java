package mx.com.bg.PersonaCRUD.repository;

import mx.com.bg.PersonaCRUD.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{
    
}
