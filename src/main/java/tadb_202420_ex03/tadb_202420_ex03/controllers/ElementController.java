package tadb_202420_ex03.tadb_202420_ex03.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tadb_202420_ex03.tadb_202420_ex03.Model.Element;
import tadb_202420_ex03.tadb_202420_ex03.services.ElementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elements")
public class ElementController {
    private final ElementService elementService;

    @Autowired
    public ElementController(ElementService elementService){
        this.elementService = elementService;
    }

    @GetMapping("/findAll")
    public List<Element> findAll(){
        return elementService.findAll();
    }

    @GetMapping("/findById/{elementId}")
    public Optional<Element> findById(@PathVariable Long elementId){
        return elementService.findById(elementId);
    }

    @PostMapping("/addElement")
    public Element AddElement(@RequestBody Element element){
        return elementService.addElement(element);
    }

    @PutMapping("/{elementId}")
    public Element updateElement(@PathVariable String elementId, @RequestBody Element element){
        return elementService.updateElement(element);
    }

    @DeleteMapping("/deleteElement/{elementId}")
    public void deleteElement(@PathVariable Long elementId){
        elementService.deleteElement(elementId);
    }
}

