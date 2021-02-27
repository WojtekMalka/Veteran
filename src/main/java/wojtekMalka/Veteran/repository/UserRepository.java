package wojtekMalka.Veteran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import wojtekMalka.Veteran.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    @RestResource(exported = false)
    void deleteById(Long user_id);

/*    @RestResource(path = "user")
    User findUserByUser_id(@Param("userId") Long user_id);*/
}
