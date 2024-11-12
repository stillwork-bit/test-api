package com.api.controller;

import com.api.model.UserDTO;
import com.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @RequestBody UserDTO user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }

    @DeleteMapping("/{userName}")
    public ResponseEntity<Void> deleteUser(@PathVariable String userName) {
        //Фильтруем список пользователей по имени с учетом null и удаляем всех найденных пользователей
        userService.getAllUsers().stream()
                .filter(x -> x.getName() != null && x.getName().equals(userName)) // Проверка на null и фильтрация по имени
                .forEach(user -> userService.deleteUser(user.getId())); // Удаляем всех пользователей, удовлетворяющих фильтру
        return ResponseEntity.noContent().build();
    }
}
