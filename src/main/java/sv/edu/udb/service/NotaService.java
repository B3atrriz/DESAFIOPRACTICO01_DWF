package sv.edu.udb.service;

import sv.edu.udb.repository.domain.Nota;
import java.util.List;

public interface NotaService {
    List<Nota> findAll();
    Nota findById(Long id);
    Nota save(Nota nota);
    void delete(Long id);
}