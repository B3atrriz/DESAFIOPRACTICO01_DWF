package sv.edu.udb.repository.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double valor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_alumno", nullable = false)
    private Alumno alumno;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_materia", nullable = false)
    private Materia materia;
}