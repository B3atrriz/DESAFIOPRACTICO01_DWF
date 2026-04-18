package sv.edu.udb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.AlumnoRepository;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.service.AlumnoService;
import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> findAll() { return alumnoRepository.findAll(); }

    @Override
    public Alumno save(Alumno alumno) { return alumnoRepository.save(alumno); }

    @Override
    public Alumno update(Long id, Alumno alumno) {
        return alumnoRepository.findById(id).map(a -> {
            a.setNombre(alumno.getNombre());
            a.setApellido(alumno.getApellido());
            return alumnoRepository.save(a);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) { alumnoRepository.deleteById(id); }

    @Override
    public Optional<Alumno> findById(Long id) { return alumnoRepository.findById(id); }
}