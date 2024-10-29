package tadb_202420_ex03.tadb_202420_ex03.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tadb_202420_ex03.tadb_202420_ex03.Model.Compound;
import tadb_202420_ex03.tadb_202420_ex03.services.CompoundService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compound")
public class CompoundController {

    private final CompoundService compoundService;

    @Autowired
    public CompoundController(CompoundService compoundService){
        this.compoundService = compoundService;
    }

    @GetMapping("/findAll")
    public List<Compound> findAll(){
        return compoundService.findAll();
    }

    @GetMapping("/findById/{compoundId}")
    public Optional<Compound> findById(@PathVariable Long compoundId){
        return compoundService.findById(compoundId);
    }

    @PostMapping("/addElement")
    public Compound addCompound(@RequestBody Compound compound){
        return compoundService.addCompound(compound);
    }

    @PutMapping("/updateElement/{compoundId}")
    public Compound updateCompoundById(@PathVariable String compoundId, @RequestBody Compound compound){
        return compoundService.updateCompound(compound);
    }

    @DeleteMapping("/deleteElement/{compoundId}")
    public void deleteCompound(@PathVariable Long compoundId){
        compoundService.deleteCompound(compoundId);
    }
}