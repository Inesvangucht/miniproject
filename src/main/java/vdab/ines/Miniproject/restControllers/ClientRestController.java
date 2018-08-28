package vdab.ines.Miniproject.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vdab.ines.Miniproject.entities.Client;
import vdab.ines.Miniproject.services.ClientService;

@RestController
@RequestMapping("/client")

public class ClientRestController {
    private final ClientService clientService;

    @Autowired
    public ClientRestController(ClientService clientService) {
        this.clientService = clientService;
    }


}
