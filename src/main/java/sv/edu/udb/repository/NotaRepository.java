package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.repository.domain.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {
}