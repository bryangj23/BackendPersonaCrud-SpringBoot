package mx.com.bg.PersonaCRUD.repository;

import mx.com.bg.PersonaCRUD.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
}
