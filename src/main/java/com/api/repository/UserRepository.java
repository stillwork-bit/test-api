package com.api.repository;

import com.api.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Table;

@Table(name = "test_msg", schema = "test_schema")
public interface UserRepository extends JpaRepository<UserDTO, Long> {
    // Дополнительные методы, если необходимо
}
