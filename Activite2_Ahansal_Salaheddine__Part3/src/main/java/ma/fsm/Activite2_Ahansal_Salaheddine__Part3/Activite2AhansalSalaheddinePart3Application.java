package ma.fsm.Activite2_Ahansal_Salaheddine__Part3;

import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.entities.Role;
import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.entities.User;
import ma.fsm.Activite2_Ahansal_Salaheddine__Part3.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Activite2AhansalSalaheddinePart3Application {

    public static void main(String[] args) {

        SpringApplication.run(Activite2AhansalSalaheddinePart3Application.class, args);
    }
    @Bean
    CommandLineRunner start(UserService userService) {
       return args -> {
           User u = new User();
           u.setUsername("user1");
           u.setPassword("password1");
           userService.addNewUser(u);

           User u2 = new User();
           u2.setUsername("admin");
           u2.setPassword("password2");
           userService.addNewUser(u2);

           Stream.of("STUDENT","USER","ADMIN").forEach(r->{
               Role role1 = new Role();
               role1.setRoleName(r);
               userService.addNewRole(role1);
           });
           userService.addRoleToUser("user1", "STUDENT");
           userService.addRoleToUser("user1", "USER");
           userService.addRoleToUser("admin", "USER");
           userService.addRoleToUser("admin", "ADMIN");

           try {
               User user = userService.authenticate("user1", "password1");
               System.out.println(user.getUserId());
               System.out.println(user.getUsername());
               System.out.println("Roles =>");
               user.getRoles().forEach(r->{
                   System.out.println("Role =>"+r.toString());
               });

           }catch (Exception e) {
               e.printStackTrace();
           }



       };
    }



}
