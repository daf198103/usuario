package controller;


import Service.ClienteService;
import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {


    @Autowired
    private ClienteService service;

    @GetMapping("/clientes")
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> findById(Long id) {
        return service.findById(id);
    }

    @PostMapping("/clientes/save")
    public void save(@RequestBody Cliente cliente) {
        service.save(cliente);
    }

    @PutMapping("/clientes/update")
    public Object update(@RequestBody Cliente cliente) {
        return service.update(cliente);
    }

    @DeleteMapping("/clientes/delete/{id}")
    public void delete(@PathVariable Long id){
        service.deleteById(id);
    }

}
