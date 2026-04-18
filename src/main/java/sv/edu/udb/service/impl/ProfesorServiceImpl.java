package sv.edu.udb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.ProfesorRepository;
import sv.edu.udb.repository.domain.Profesor;
import sv.edu.udb.service.ProfesorService;
import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> findAll() { return profesorRepository.findAll(); }

    @Override
    public Profesor save(Profesor profesor) { return profesorRepository.save(profesor); }

    @Override
    public Profesor update(Long id, Profesor profesor) {
        return profesorRepository.findById(id).map(p -> {
            p.setNombre(profesor.getNombre());
            return profesorRepository.save(p);
        }).orElse(null);
    }

    @Override
    public void delete(Long id) { profesorRepository.deleteById(id); }
}