package sv.edu.udb.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.repository.domain.Alumno;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class AlumnoRepositoryTest {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Test
    @Commit
    void shouldInsertTwoNewAlumnos() {
        // Given
        Alumno alumno1 = Alumno.builder()
                .nombre("Fernando")
                .apellido("Castro")
                .build();

        Alumno alumno2 = Alumno.builder()
                .nombre("Gabriela")
                .apellido("Mendoza")
                .build();

        // When
        Alumno savedAlumno1 = alumnoRepository.save(alumno1);
        Alumno savedAlumno2 = alumnoRepository.save(alumno2);

        // Then
        assertNotNull(savedAlumno1.getId());
        assertNotNull(savedAlumno2.getId());
        assertEquals("Fernando", savedAlumno1.getNombre());
        assertEquals("Castro", savedAlumno1.getApellido());

        // Verificar que se guardaron
        List<Alumno> allAlumnos = alumnoRepository.findAll();
        assertTrue(allAlumnos.size() >= 2);
    }
}