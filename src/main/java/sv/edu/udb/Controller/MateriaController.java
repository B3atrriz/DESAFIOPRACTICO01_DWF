package sv.edu.udb.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.MateriaService;
import java.util.List;

@RestController
@RequestMapping("/api/materias")
public class MateriaController {
    @Autowired
    private MateriaService service;

    @GetMapping
    public List<Materia> getAll() { return service.findAll(); }
    @PostMapping
    public Materia create(@RequestBody Materia materia) { return service.save(materia); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}