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
        // Given - obtener un profesor existente
        Profesor profesor = profesorRepository.findById(1L).orElseThrow();

        Materia materia1 = Materia.builder()
                .nombre("Física")
                .profesor(profesor)
                .build();

        Materia materia2 = Materia.builder()
                .nombre("Química")
                .profesor(profesor)
                .build();

        // When
        Materia savedMateria1 = materiaRepository.save(materia1);
        Materia savedMateria2 = materiaRepository.save(materia2);

        // Then
        assertNotNull(savedMateria1.getId());
        assertNotNull(savedMateria2.getId());
        assertEquals("Física", savedMateria1.getNombre());
        assertEquals("Química", savedMateria2.getNombre());
    }
}