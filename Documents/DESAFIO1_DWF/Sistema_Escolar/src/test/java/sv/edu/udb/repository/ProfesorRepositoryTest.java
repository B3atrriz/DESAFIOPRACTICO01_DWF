package sv.edu.udb.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.repository.domain.Profesor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ProfesorRepositoryTest {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    @Commit
    void shouldInsertTwoNewProfesores() {
        // Given
        Profesor profesor1 = Profesor.builder()
                .nombre("Roberto Gómez")
                .build();

        Profesor profesor2 = Profesor.builder()
                .nombre("Elena Vásquez")
                .build();

        // When
        Profesor savedProfesor1 = profesorRepository.save(profesor1);
        Profesor savedProfesor2 = profesorRepository.save(profesor2);

        // Then
        assertNotNull(savedProfesor1.getId());
        assertNotNull(savedProfesor2.getId());

        // Verificar que se guardaron
        List<Profesor> allProfesores = profesorRepository.findAll();
        assertTrue(allProfesores.size() >= 2);
    }
}