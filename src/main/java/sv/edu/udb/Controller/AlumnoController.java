package sv.edu.udb.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.service.AlumnoService;
import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService service;

    @GetMapping
    public List<Alumno> getAll() { return service.findAll(); }
    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) { return service.save(alumno); }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}