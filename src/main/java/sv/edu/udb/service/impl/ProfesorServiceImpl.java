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
    private ProfesorRepository repository;

    @Override
    public List<Profesor> findAll() { return repository.findAll(); }
    @Override
    public Profesor save(Profesor profesor) { return repository.save(profesor); }
    @Override
    public void delete(Long id) { repository.deleteById(id); }
}