package com.doctorsapplicationg4e12.controller;

import com.doctorsapplicationg4e12.model.ClientModel;
import com.doctorsapplicationg4e12.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> getAllClients(){ return clientService.getAllClients(); }
    @GetMapping("/{id}")
    public Optional<ClientModel> getClient(@PathVariable Integer id){return clientService.getClient(id);}
    @PostMapping("/save")
    public ClientModel saveClient(@RequestBody ClientModel clientModel){return clientService.saveClient(clientModel);}
    @DeleteMapping("/delete/{id}")
    public boolean deleteClient(@PathVariable Integer id){return clientService.deleteClient(id);}
    @PutMapping("/update")
    public ClientModel updateClient(@RequestBody ClientModel clientModel){return clientService.updateClient(clientModel);}
}