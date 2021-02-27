package wojtekMalka.Veteran.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import wojtekMalka.Veteran.repository.UserRepository;

@RepositoryRestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/value")
    ResponseEntity<?> readAllUsers() {
        logger.warn("Exposing all users!");
        return ResponseEntity.ok(repository.findAll());
    }
}
