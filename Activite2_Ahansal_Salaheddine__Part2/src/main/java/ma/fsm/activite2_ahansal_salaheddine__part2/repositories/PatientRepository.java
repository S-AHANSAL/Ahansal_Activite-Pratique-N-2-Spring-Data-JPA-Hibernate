package ma.fsm.activite2_ahansal_salaheddine__part2.repositories;

import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Patient findByNom(String name);
}
