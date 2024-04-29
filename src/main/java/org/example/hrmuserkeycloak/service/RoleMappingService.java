package org.example.hrmuserkeycloak.service;

import org.example.hrmuserkeycloak.dto.RoleDto;

import java.util.List;

public interface RoleMappingService {

    void assignRoles(String userId, List<RoleDto> roleDtoList);

    void unassignRoles(String userId, List<RoleDto> roleDtoList);

}
