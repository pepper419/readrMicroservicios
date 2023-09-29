package com.monaschinas.readr.user.domain.service;

import com.monaschinas.readr.user.domain.model.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoleService {
  List<Role> getAll();
  Page<Role> getAll(Pageable pageable);
  Role getById(Long roleId);
  Role create(Role role);
  Role update(Long roleId, Role role);
  ResponseEntity<?> delete(Long roleId);
}
