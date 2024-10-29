package tadb_202420_ex03.tadb_202420_ex03.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "elements")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Element {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private float atomicNumber;

    @Column(nullable = false)
    private String electronicConfiguration;
}
