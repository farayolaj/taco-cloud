package star.tacocloud.data;

import org.springframework.data.jpa.repository.JpaRepository;
import star.tacocloud.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
