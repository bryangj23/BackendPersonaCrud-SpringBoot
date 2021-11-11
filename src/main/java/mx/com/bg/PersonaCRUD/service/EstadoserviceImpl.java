package mx.com.bg.PersonaCRUD.service;

import java.util.ArrayList;
import java.util.List;
import mx.com.bg.PersonaCRUD.model.Estado;
import mx.com.bg.PersonaCRUD.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoserviceImpl {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> getAllEstado() {
        return estadoRepository.findAll();
    }

    public List<Estado> findByCountry(Long id) {
        List<Estado> estados = estadoRepository.findAll();
        List<Estado> estadospais = new ArrayList<>();

        for (Estado estado : estados) {
            if (estado.getPais().getId() == id) {
                estadospais.add(estado);
            }
        }
        return estadospais;
    }

}
