package org.example.hrmuserkeycloak.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hrmuserkeycloak.dto.GroupCountDto;
import org.example.hrmuserkeycloak.dto.GroupDto;
import org.example.hrmuserkeycloak.dto.RolesDto;
import org.example.hrmuserkeycloak.dto.UserDto;
import org.example.hrmuserkeycloak.feign.GroupFeignClient;
import org.example.hrmuserkeycloak.service.GroupService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupFeignClient groupFeignClient;

    @Override
    public List<GroupDto> getGroups() {
        return groupFeignClient.getGroups();
    }

    @Override
    public GroupDto getGroupById(String id) {
        return groupFeignClient.getGroupById(id);
    }

    @Override
    public GroupDto createGroup(GroupDto groupDto) {
        return groupFeignClient.createGroup(groupDto);
    }

    @Override
    public GroupDto updateGroup(String id, GroupDto groupDto) {
        return groupFeignClient.updateGroup(id, groupDto);
    }

    @Override
    public GroupDto deleteGroup(String id) {
        return groupFeignClient.deleteGroup(id);
    }

    @Override
    public List<GroupDto> getSubgroups(String id) {
        return groupFeignClient.getSubgroups(id);
    }

    @Override
    public GroupDto createSubgroup(String id, GroupDto groupDto) {
        return groupFeignClient.createSubgroup(id, groupDto);
    }

    @Override
    public List<UserDto> getMembers(String id) {
        return groupFeignClient.getMembers(id);
    }

    @Override
    public GroupCountDto getGroupCount() {
        return groupFeignClient.getGroupCount();
    }

    @Override
    public RolesDto getRoles(String groupId) {
        return groupFeignClient.getRoles(groupId);
    }

    @Override
    public List<GroupDto> getClientRoles(String groupId, String clientId) {
        return groupFeignClient.getClientRoles(groupId, clientId);
    }

    @Override
    public List<GroupDto> getAvailableClientRoles(String groupId, String clientId) {
        return groupFeignClient.getAvailableClientRoles(groupId, clientId);
    }

    @Override
    public void deleteClientRolesByClientId(String groupId, String clientId) {
        groupFeignClient.deleteClientRolesByClientId(groupId, clientId);
    }

    @Override
    public List<GroupDto> addClientRoles(String groupId, String clientId, List<GroupDto> groupDtoList) {
        return groupFeignClient.addClientRoles(groupId, clientId, groupDtoList);
    }

    @Override
    public List<GroupDto> getAvailableRealmRoles(String groupId) {
        return groupFeignClient.getAvailableRealmRoles(groupId);
    }

    @Override
    public List<GroupDto> getRealmRoles(String groupId) {
        return groupFeignClient.getRealmRoles(groupId);
    }

    @Override
    public void deleteRealmRoles(String groupId) {
        groupFeignClient.deleteRealmRoles(groupId);
    }

    @Override
    public List<GroupDto> addRealmRoles(String groupId, List<GroupDto> groupDtoList) {
        return groupFeignClient.addRealmRoles(groupId, groupDtoList);
    }
}