package org.example.hrmuserkeycloak.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hrmuserkeycloak.dto.GroupDto;
import org.example.hrmuserkeycloak.dto.RoleDto;
import org.example.hrmuserkeycloak.dto.RolesDto;
import org.example.hrmuserkeycloak.dto.UserDto;
import org.example.hrmuserkeycloak.dto.UserPasswordDto;
import org.example.hrmuserkeycloak.feign.UserFeignClient;
import org.example.hrmuserkeycloak.service.RoleMappingService;
import org.example.hrmuserkeycloak.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserFeignClient userFeignClient;

    private final RoleMappingService roleMappingService;

    @Override
    public List<UserDto> getUsers() {
        return userFeignClient.getUsers();
    }

    @Override
    public UserDto getUserById(String id) {
        return userFeignClient.getUserById(id);
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return userFeignClient.createUser(userDto);
    }

    @Override
    public void deleteUser(String id) {
        userFeignClient.deleteUser(id);
    }

    @Override
    public void setPassword(String id, UserPasswordDto userPasswordDto) {
        userFeignClient.setPassword(id, userPasswordDto);
    }

    @Override
    public RolesDto getRoles(String id) {
        return userFeignClient.getRoles(id);
    }

    @Override
    public void assignRoles(String id, List<RoleDto> roleDtoList) {
        roleMappingService.assignRoles(id, roleDtoList);
    }

    @Override
    public void unassignRoles(String id, List<RoleDto> roleDtoList) {
        roleMappingService.unassignRoles(id, roleDtoList);
    }

    @Override
    public List<GroupDto> getAvailableClientRoles(String userId, String clientId) {
        return userFeignClient.getAvailableClientRoles(userId, clientId);
    }

    @Override
    public void assignGroup(String userId, String groupId) {
        userFeignClient.assignGroup(userId, groupId);
    }

    @Override
    public void unassignGroup(String userId, String groupId) {
        userFeignClient.unassignGroup(userId, groupId);
    }

}
