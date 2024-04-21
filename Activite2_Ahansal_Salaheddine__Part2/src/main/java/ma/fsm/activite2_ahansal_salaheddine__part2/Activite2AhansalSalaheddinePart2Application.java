package ma.fsm.activite2_ahansal_salaheddine__part2;

import ma.fsm.activite2_ahansal_salaheddine__part2.entities.*;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.ConsultationRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.MedecinRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.PatientRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.RendezVousRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Activite2AhansalSalaheddinePart2Application {

    public static void main(String[] args) {
        SpringApplication.run(Activite2AhansalSalaheddinePart2Application.class, args);

    }

    @Bean
    CommandLineRunner start(IHospitalService hospitalService,
                            PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository){
        return args -> {
            Stream.of("Mohamed","Hassan","Najat").forEach(name->{
                Patient patient = new Patient();
                patient.setNom(name);
                patient.setDateNaissance(new Date());
                patient.setMalade(false);
                hospitalService.savePatient(patient);
            });
            Stream.of("Aymane","Hassan","Ayoub").forEach(name->{
                Medecin medecin = new Medecin();
                medecin.setNom(name);
                medecin.setEmail(name+"@gmail.com");
                medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                hospitalService.saveMedecin(medecin);
            });
            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient1 = patientRepository.findByNom("Mohamed");

            Medecin medecin = medecinRepository.findByNom("Ayoub");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            RendezVous saveDRDV = hospitalService.saveRDV(rendezVous);
            System.out.println(saveDRDV.getId());

            RendezVous rendezVous1 = rendezVousRepository.findAll().get(0);

            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de consultation ");
            hospitalService.saveConsultation(consultation);


        };
    }

}
