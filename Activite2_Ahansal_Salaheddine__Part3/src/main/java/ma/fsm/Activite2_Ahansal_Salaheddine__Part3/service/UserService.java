package ma.fsm.Activite2_Ahansal_Salaheddine__Part3.service;

import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.entities.Role;
import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUsername(String username);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);
    User authenticate(String username, String password);
}
