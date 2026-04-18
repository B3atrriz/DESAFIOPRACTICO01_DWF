package sv.edu.udb.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.service.AlumnoService;
import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@Tag(name = "Alumnos", description = "Endpoints para la gestión de alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public List<Alumno> getAll() { return alumnoService.findAll(); }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno) { return alumnoService.save(alumno); }

    @PutMapping("/{id}")
    public Alumno update(@PathVariable Long id, @RequestBody Alumno alumno) {
        return alumnoService.update(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { alumnoService.delete(id); }
}