package sv.edu.udb.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.repository.domain.Alumno;
import sv.edu.udb.repository.domain.AlumnoMateria;
import sv.edu.udb.repository.domain.Materia;
import sv.edu.udb.repository.domain.Profesor;

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

    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    @Commit
    void shouldInsertTwoNewInscripciones() {
        // PASO 1: Crear profesor
        Profesor profesor = Profesor.builder()
                .nombre("Profesor Test")
                .build();
        Profesor savedProfesor = profesorRepository.save(profesor);

        // PASO 2: Crear alumno
        Alumno alumno = Alumno.builder()
                .nombre("Alumno Test")
                .apellido("Apellido Test")
                .build();
        Alumno savedAlumno = alumnoRepository.save(alumno);

        // PASO 3: Crear materias
        Materia materia1 = Materia.builder()
                .nombre("Materia Test 1")
                .profesor(savedProfesor)
                .build();

        Materia materia2 = Materia.builder()
                .nombre("Materia Test 2")
                .profesor(savedProfesor)
                .build();

        Materia savedMateria1 = materiaRepository.save(materia1);
        Materia savedMateria2 = materiaRepository.save(materia2);

        // PASO 4: Crear inscripciones
        AlumnoMateria inscripcion1 = AlumnoMateria.builder()
                .alumno(savedAlumno)
                .materia(savedMateria1)
                .build();

        AlumnoMateria inscripcion2 = AlumnoMateria.builder()
                .alumno(savedAlumno)
                .materia(savedMateria2)
                .build();

        // When
        AlumnoMateria savedInscripcion1 = alumnoMateriaRepository.save(inscripcion1);
        AlumnoMateria savedInscripcion2 = alumnoMateriaRepository.save(inscripcion2);

        // Then
        assertNotNull(savedInscripcion1);
        assertNotNull(savedInscripcion2);
        assertEquals(savedAlumno.getId(), savedInscripcion1.getAlumno().getId());
        assertEquals(savedMateria1.getId(), savedInscripcion1.getMateria().getId());
        assertEquals(savedAlumno.getId(), savedInscripcion2.getAlumno().getId());
        assertEquals(savedMateria2.getId(), savedInscripcion2.getMateria().getId());
    }
}