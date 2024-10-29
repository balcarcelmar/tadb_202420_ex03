package tadb_202420_ex03.tadb_202420_ex03.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "compound")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Compound {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String chemicalFormula;
    @Column(nullable = false)
    private Float molarMass;
    @Column(nullable = false)
    private String aggregationState;

}
