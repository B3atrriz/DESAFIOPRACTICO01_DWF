package sv.edu.udb.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.repository.domain.AlumnoMateria;
import sv.edu.udb.repository.domain.Materia;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class AlumnoMateriaRepositoryTest {

    @Autowired
    private AlumnoMateriaRepository alumnoMateriaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Test
    @Commit
    void shouldInsertTwoNewInscripciones() {
        // Given - obtener alumno y materia existentes
        Alumno alumno = alumnoRepository.findById(1L).orElseThrow();
        Materia materia1 = materiaRepository.findById(1L).orElseThrow();
        Materia materia2 = materiaRepository.findById(2L).orElseThrow();

        AlumnoMateria inscripcion1 = AlumnoMateria.builder()
                .alumno(alumno)
                .materia(materia1)
                .build();

        AlumnoMateria inscripcion2 = AlumnoMateria.builder()
                .alumno(alumno)
                .materia(materia2)
                .build();

        // When
        AlumnoMateria savedInscripcion1 = alumnoMateriaRepository.save(inscripcion1);
        AlumnoMateria savedInscripcion2 = alumnoMateriaRepository.save(inscripcion2);

        // Then
        assertNotNull(savedInscripcion1);
        assertNotNull(savedInscripcion2);
        assertEquals(alumno.getId(), savedInscripcion1.getAlumno().getId());
        assertEquals(materia1.getId(), savedInscripcion1.getMateria().getId());
    }
}