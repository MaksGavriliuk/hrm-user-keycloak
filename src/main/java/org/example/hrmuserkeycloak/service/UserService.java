package org.example.hrmuserkeycloak.service;

import org.example.hrmuserkeycloak.dto.GroupDto;
import org.example.hrmuserkeycloak.dto.RoleDto;
import org.example.hrmuserkeycloak.dto.RolesDto;
import org.example.hrmuserkeycloak.dto.UserDto;
import org.example.hrmuserkeycloak.dto.UserPasswordDto;

import java.util.List;

public interface UserService {

    List<UserDto> getUsers();

    UserDto createUser(UserDto userDto);

    void deleteUser(String id);

    void setPassword(String id, UserPasswordDto userPasswordDto);

    UserDto getUserById(String id);

    RolesDto getRoles(String id);

    void assignRoles(String id, List<RoleDto> roleDtoList);

    void unassignRoles(String id, List<RoleDto> roleDto);

    List<GroupDto> getAvailableClientRoles(String userId, String clientId);

    void assignGroup(String userId, String groupId);

    void unassignGroup(String userId, String groupId);

}
