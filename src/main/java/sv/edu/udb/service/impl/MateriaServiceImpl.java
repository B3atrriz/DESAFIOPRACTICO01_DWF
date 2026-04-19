package sv.edu.udb.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.MateriaService;
import java.util.List;

@Service
public class MateriaServiceImpl implements MateriaService {
    @Autowired
    private MateriaRepository repository;

    @Override
    public List<Materia> findAll() { return repository.findAll(); }
    @Override
    public Materia save(Materia materia) { return repository.save(materia); }
    @Override
    public void delete(Long id) { repository.deleteById(id); }
}