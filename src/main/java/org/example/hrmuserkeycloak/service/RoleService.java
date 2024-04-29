package org.example.hrmuserkeycloak.service;

import org.example.hrmuserkeycloak.dto.RoleDto;

import java.util.List;

public interface RoleService {

    List<RoleDto> getRoles();

    RoleDto getRoleById(String id);

    RoleDto createRole(RoleDto roleDto);

    RoleDto updateRole(String id, RoleDto roleDto);

    void deleteRole(String id);

}
