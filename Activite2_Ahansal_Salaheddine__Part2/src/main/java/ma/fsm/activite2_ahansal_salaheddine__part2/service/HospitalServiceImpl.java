package ma.fsm.activite2_ahansal_salaheddine__part2.service;

import jakarta.transaction.Transactional;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Consultation;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Medecin;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.Patient;
import ma.fsm.activite2_ahansal_salaheddine__part2.entities.RendezVous;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.ConsultationRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.MedecinRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.PatientRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
