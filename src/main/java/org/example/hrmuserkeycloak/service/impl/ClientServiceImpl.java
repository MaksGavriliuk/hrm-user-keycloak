package org.example.hrmuserkeycloak.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hrmuserkeycloak.dto.ClientDto;
import org.example.hrmuserkeycloak.feign.ClientFeignClient;
import org.example.hrmuserkeycloak.service.ClientService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientFeignClient clientFeignClient;

    @Override
    public ClientDto getClientById(String id) {
        return clientFeignClient.getClientById(id);
    }

    @Override
    public ClientDto getClientByClientId(String clientId) {
        return clientFeignClient.getClientByClientId(clientId);
    }

}
