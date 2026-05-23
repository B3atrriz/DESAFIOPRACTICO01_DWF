package sv.edu.udb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.repository.NotaRepository;
import sv.edu.udb.repository.domain.Nota;
import sv.edu.udb.service.NotaService;
import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository repository;

    @Override
    public List<Nota> findAll() { return repository.findAll(); }

    @Override
    public Nota findById(Long id) { return repository.findById(id).orElse(null); }

    @Override
    public Nota save(Nota nota) { return repository.save(nota); }

    @Override
    public void delete(Long id) { repository.deleteById(id); }
}