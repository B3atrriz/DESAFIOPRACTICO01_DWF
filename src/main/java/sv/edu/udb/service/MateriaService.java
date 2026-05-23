package sv.edu.udb.service;
import sv.edu.udb.repository.domain.Materia;
import java.util.List;

public interface MateriaService {
    List<Materia> findAll();
    Materia findById(Long id); // <-- NUEVO
    Materia save(Materia materia);
    void delete(Long id);
}