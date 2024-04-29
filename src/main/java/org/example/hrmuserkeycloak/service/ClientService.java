package org.example.hrmuserkeycloak.service;

import org.example.hrmuserkeycloak.dto.ClientDto;

public interface ClientService {

    ClientDto getClientById(String id);

    ClientDto getClientByClientId(String email);

}
