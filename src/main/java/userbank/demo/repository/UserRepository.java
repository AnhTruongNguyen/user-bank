package userbank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import userbank.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
