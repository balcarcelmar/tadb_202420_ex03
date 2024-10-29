package tadb_202420_ex03.tadb_202420_ex03.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tadb_202420_ex03.tadb_202420_ex03.Model.Compound;
import tadb_202420_ex03.tadb_202420_ex03.Model.Element;
import tadb_202420_ex03.tadb_202420_ex03.Repository.CompoundRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompoundService {

    private final CompoundRepository compoundRepository;

    @Autowired
    public CompoundService(CompoundRepository compoundRepository) {
        this.compoundRepository = compoundRepository;
    }

    public List<Compound> findAll() {
        return compoundRepository.findAll();
    }

    public Optional<Compound> findById(Long compoundId) {
        return compoundRepository.findById(compoundId);
    }

    public Compound addCompound(Compound compound) {
        return compoundRepository.save(compound);
    }

    public Compound updateCompound(Compound compound) {
        return compoundRepository.save(compound);
    }

    public void deleteCompound(Long elementId) {
        compoundRepository.deleteById(elementId);
    }
}
