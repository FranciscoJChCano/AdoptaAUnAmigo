package Repositories;

import java.util.Optional;

import Models.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User,Long> {
    Optional<User> findByUsername(String username);
}