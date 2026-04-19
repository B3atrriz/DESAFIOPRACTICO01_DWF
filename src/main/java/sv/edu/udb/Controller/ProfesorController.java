package sv.edu.udb.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Profesor;
import sv.edu.udb.service.ProfesorService;
import java.util.List;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService service;

    @GetMapping
    public List<Profesor> getAll() { return service.findAll(); }
    @PostMapping
    public Profesor create(@RequestBody Profesor profesor) { return service.save(profesor); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}