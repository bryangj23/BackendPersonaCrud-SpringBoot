package mx.com.bg.PersonaCRUD.service;

import java.util.List;
import mx.com.bg.PersonaCRUD.model.Pais;
import mx.com.bg.PersonaCRUD.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisServiceImpl {
    @Autowired
    private PaisRepository paisRepository;
    
    public List<Pais> getAllPais(){
        return paisRepository.findAll();
    }
}
