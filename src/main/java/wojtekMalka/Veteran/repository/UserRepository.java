package wojtekMalka.Veteran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wojtekMalka.Veteran.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
}
