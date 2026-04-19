package sv.edu.udb.service;
import sv.edu.udb.repository.domain.Alumno;
import java.util.List;

public interface AlumnoService {
    List<Alumno> findAll();
    Alumno save(Alumno alumno);
    void delete(Long id);
}