package sv.edu.udb.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.AlumnoRepository;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.service.AlumnoService;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoRepository repository;

    @Override
    public List<Alumno> findAll() { return repository.findAll(); }

    @Override
    public Alumno findById(Long id) { return repository.findById(id).orElse(null); } // <-- NUEVO

    @Override
    public Alumno save(Alumno alumno) { return repository.save(alumno); }

    @Override
    public void delete(Long id) { repository.deleteById(id); }
}