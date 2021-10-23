package br.com.dio.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.auth.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
