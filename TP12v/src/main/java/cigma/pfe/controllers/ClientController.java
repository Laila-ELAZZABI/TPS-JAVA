package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.tools.jar.SignatureFile;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long id){
        return service.getOne(id);
    }
    @PostMapping("/create")
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }
    @PutMapping("/update")
    public Client modify(@RequestBody Client client) {
        return service.modify(client);
    }


}
