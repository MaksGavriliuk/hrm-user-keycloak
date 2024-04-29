package org.example.hrmuserkeycloak.controller;

import lombok.RequiredArgsConstructor;
import org.example.hrmuserkeycloak.dto.ClientDto;
import org.example.hrmuserkeycloak.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientDto getClientById(@PathVariable String id) {
        return clientService.getClientById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ClientDto getClientByClientId(@RequestParam String clientId) {
        return clientService.getClientByClientId(clientId);
    }

}
