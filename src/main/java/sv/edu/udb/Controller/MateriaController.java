package sv.edu.udb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.service.MateriaService;
import java.util.List;

@RestController
@RequestMapping("/api/materia")
@CrossOrigin(origins = "*") // Permite la conexión con el Front-End
public class MateriaController {

    @Autowired
    private MateriaService service;

    @GetMapping
    public List<Materia> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Materia create(@RequestBody Materia materia) {
        return service.save(materia);
    }

    @PutMapping("/{id}") // Método para actualizar requerido en el CRUD
    public Materia update(@PathVariable Long id, @RequestBody Materia materia) {
        materia.setId(id);
        return service.save(materia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}