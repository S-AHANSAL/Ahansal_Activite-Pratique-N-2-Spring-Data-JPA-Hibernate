package ma.fsm.activite2_ahansal_salaheddine__part2;

import ma.fsm.activite2_ahansal_salaheddine__part2.entities.*;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.ConsultationRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.MedecinRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.PatientRepository;
import ma.fsm.activite2_ahansal_salaheddine__part2.repositories.RendezVousRepository;
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
    CommandLineRunner start(PatientRepository patientRepository,
                            MedecinRepository medecinRepository,
                            RendezVousRepository rendezVousRepository,
                            ConsultationRepository consultationRepository){
        return args -> {
            Stream.of("Mohamed", "Hassan", "Najat").forEach(name -> {
                Patient patient = new Patient();
                patient.setNom(name);
                patient.setDateNaissance(new Date());
                patient.setMalade(false);
                patientRepository.save(patient);
            });
            Stream.of("Aymane","Hassan","Ayoub").forEach(name->{
                Medecin medecin = new Medecin();
                medecin.setNom(name);
                medecin.setEmail(name+"@gmail.com");
                medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                medecinRepository.save(medecin);
                medecinRepository.save(medecin);
            });
            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient1 = patientRepository.findByNom("Mohamed");
            Medecin medecin = medecinRepository.findByNom("Hassan");

            RendezVous rendezVous=new RendezVous();
            rendezVous.setStatus(StatusRDV.PENDINS);
            rendezVous.setDate(new Date());
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            rendezVousRepository.save(rendezVous);

            RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);

            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de consultation ");
            consultationRepository.save(consultation);
        };
    }
}
