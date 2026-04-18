package sv.edu.udb.service;

import sv.edu.udb.repository.domain.Profesor;
import java.util.List;

public interface ProfesorService {
    List<Profesor> findAll();
    Profesor save(Profesor profesor);
    Profesor update(Long id, Profesor profesor);
    void delete(Long id);
}