package ma.fsm.Activite2_Ahansal_Salaheddine__Part3.repositories;

import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRoleName(String roleName);
}
