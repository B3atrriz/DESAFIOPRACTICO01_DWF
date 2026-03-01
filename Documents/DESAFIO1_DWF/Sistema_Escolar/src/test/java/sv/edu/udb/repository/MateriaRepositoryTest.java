package sv.edu.udb.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.repository.domain.Profesor;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MateriaRepositoryTest {

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    @Commit
    void shouldInsertTwoNewMaterias() {
        // PRIMERO: Crear los profesores
        Profesor profesor1 = Profesor.builder()
                .nombre("Profesor Test 1")
                .build();

        Profesor profesor2 = Profesor.builder()
                .nombre("Profesor Test 2")
                .build();

        Profesor savedProfesor1 = profesorRepository.save(profesor1);
        Profesor savedProfesor2 = profesorRepository.save(profesor2);

        // AHORA SÍ: Crear materias con esos profesores
        Materia materia1 = Materia.builder()
                .nombre("Física")
                .profesor(savedProfesor1)  // Usar el profesor guardado
                .build();

        Materia materia2 = Materia.builder()
                .nombre("Química")
                .profesor(savedProfesor2)  // Usar el profesor guardado
                .build();

        // When
        Materia savedMateria1 = materiaRepository.save(materia1);
        Materia savedMateria2 = materiaRepository.save(materia2);

        // Then
        assertNotNull(savedMateria1.getId());
        assertNotNull(savedMateria2.getId());
        assertEquals("Física", savedMateria1.getNombre());
        assertEquals("Química", savedMateria2.getNombre());
        assertNotNull(savedMateria1.getProfesor());
        assertNotNull(savedMateria2.getProfesor());
    }
}