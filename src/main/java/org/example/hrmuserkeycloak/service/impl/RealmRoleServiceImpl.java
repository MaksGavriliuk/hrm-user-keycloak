package org.example.hrmuserkeycloak.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hrmuserkeycloak.dto.RoleDto;
import org.example.hrmuserkeycloak.feign.RealmRoleFeignClient;
import org.example.hrmuserkeycloak.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service("realmRoleService")
public class RealmRoleServiceImpl implements RoleService {

    private final RealmRoleFeignClient realmRoleFeignClient;

    @Override
    public List<RoleDto> getRoles() {
        return realmRoleFeignClient.getRealmRoles();
    }

    @Override
    public RoleDto getRoleById(String id) {
        return realmRoleFeignClient.getRealmRoleById(id);
    }

    @Override
    public RoleDto createRole(RoleDto roleDto) {
        return realmRoleFeignClient.createRealmRole(roleDto);
    }

    @Override
    public RoleDto updateRole(String id, RoleDto roleDto) {
        return realmRoleFeignClient.updateRealmRole(id, roleDto);
    }

    @Override
    public void deleteRole(String id) {
        realmRoleFeignClient.deleteRealmRole(id);
    }
}
