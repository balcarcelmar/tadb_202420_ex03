package tadb_202420_ex03.tadb_202420_ex03.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tadb_202420_ex03.tadb_202420_ex03.Model.Element;

public interface ElementRepository extends JpaRepository<Element, Long> {
}
