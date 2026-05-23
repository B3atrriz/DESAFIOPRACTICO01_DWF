package sv.edu.udb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Nota;
import sv.edu.udb.service.NotaService;
import java.util.List;

@RestController
@RequestMapping("/api/notas")
@CrossOrigin(origins = "*")
public class NotaController {

    @Autowired
    private NotaService service;

    @GetMapping
    public List<Nota> getAll() { return service.findAll(); }

    @PostMapping
    public Nota create(@RequestBody Nota nota) { return service.save(nota); }

    @PutMapping("/{id}")
    public Nota update(@PathVariable Long id, @RequestBody Nota nota) {
        nota.setId(id);
        return service.save(nota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}