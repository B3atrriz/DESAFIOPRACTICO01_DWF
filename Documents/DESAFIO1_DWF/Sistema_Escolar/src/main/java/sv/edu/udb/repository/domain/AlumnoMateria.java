package sv.edu.udb.repository.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(AlumnoMateria.AlumnoMateriaId.class)
@Table(name = "alumno_materia")
public class AlumnoMateria {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_materia")
    private Materia materia;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AlumnoMateriaId implements Serializable {
        private Long alumno;
        private Long materia;
    }
}