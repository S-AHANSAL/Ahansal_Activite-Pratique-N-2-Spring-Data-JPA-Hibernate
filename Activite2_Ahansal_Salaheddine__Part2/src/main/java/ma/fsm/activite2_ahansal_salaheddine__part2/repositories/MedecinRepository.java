package ma.fsm.activite2_ahansal_salaheddine__part2.repositories;

import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
