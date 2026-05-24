package sv.edu.udb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Profesor;
import sv.edu.udb.service.ProfesorService;
import java.util.List;

@RestController
@RequestMapping("/api/profesor")
@CrossOrigin(origins = "*") // Permite la conexión con el Front-End
public class ProfesorController {

    @Autowired
    private ProfesorService service;

    @GetMapping
    public List<Profesor> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Profesor create(@RequestBody Profesor profesor) {
        return service.save(profesor);
    }

    @PutMapping("/{id}") // Método para actualizar requerido en el CRUD
    public Profesor update(@PathVariable Long id, @RequestBody Profesor profesor) {
        profesor.setId(id);
        return service.save(profesor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}