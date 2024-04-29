package org.example.hrmuserkeycloak.service;

import org.example.hrmuserkeycloak.dto.GroupCountDto;
import org.example.hrmuserkeycloak.dto.GroupDto;
import org.example.hrmuserkeycloak.dto.RolesDto;
import org.example.hrmuserkeycloak.dto.UserDto;

import java.util.List;

public interface GroupService {

    List<GroupDto> getGroups();

    GroupDto getGroupById(String id);

    GroupDto createGroup(GroupDto groupDto);

    GroupDto updateGroup(String id, GroupDto groupDto);

    GroupDto deleteGroup(String id);

    List<GroupDto> getSubgroups(String id);

    GroupDto createSubgroup(String id, GroupDto groupDto);

    List<UserDto> getMembers(String id);

    GroupCountDto getGroupCount();

    RolesDto getRoles(String groupId);

    List<GroupDto> getClientRoles(String groupId, String clientId);

    List<GroupDto> getAvailableClientRoles(String groupId, String clientId);

    void deleteClientRolesByClientId(String groupId, String clientId);

    List<GroupDto> addClientRoles(String groupId, String clientId, List<GroupDto> groupDtoList);

    List<GroupDto> getAvailableRealmRoles(String groupId);

    List<GroupDto> getRealmRoles(String groupId);

    void deleteRealmRoles(String groupId);

    List<GroupDto> addRealmRoles(String groupId, List<GroupDto> groupDtoList);

}
