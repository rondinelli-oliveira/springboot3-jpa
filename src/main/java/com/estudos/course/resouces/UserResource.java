package com.estudos.course.resouces;

import com.estudos.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Rondinelli Oliveira","rondinelliads@gmail.com","34999998888", "12345");
        return ResponseEntity.ok().body(u);
    }
}
