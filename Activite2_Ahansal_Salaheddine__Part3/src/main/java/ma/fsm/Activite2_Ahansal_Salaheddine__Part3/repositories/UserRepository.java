package ma.fsm.Activite2_Ahansal_Salaheddine__Part3.repositories;

import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String userName);

}
