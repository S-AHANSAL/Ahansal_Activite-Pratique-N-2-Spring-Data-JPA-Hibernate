package ma.fsm.activite2_ahansal_salaheddine__part2.service;

import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Consultation;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Medecin;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Patient;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
