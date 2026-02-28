package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.repository.domain.AlumnoMateria;

@Repository
public interface AlumnoMateriaRepository extends JpaRepository<AlumnoMateria, AlumnoMateria.AlumnoMateriaId> {
}