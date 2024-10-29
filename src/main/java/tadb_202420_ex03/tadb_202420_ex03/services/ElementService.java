package tadb_202420_ex03.tadb_202420_ex03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tadb_202420_ex03.tadb_202420_ex03.Model.Element;
import tadb_202420_ex03.tadb_202420_ex03.Repository.ElementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ElementService {
    private final ElementRepository elementRepository;

    @Autowired
    public ElementService(ElementRepository elementRepository) {
        this.elementRepository = elementRepository;
    }

    public List<Element> findAll() {
        return elementRepository.findAll();
    }

    public Optional<Element> findById(Long elementId) {
        return elementRepository.findById(elementId);
    }

    public Element addElement(Element element) {
        return elementRepository.save(element);
    }

    public Element updateElement(Element element) {
        return elementRepository.save(element);
    }

    public void deleteElement(Long elementId) {
        elementRepository.deleteById(elementId);
    }
}
