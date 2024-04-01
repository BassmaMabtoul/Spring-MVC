package ma.bassma.tp3app;


import ma.bassma.tp3app.entities.Patient;
import ma.bassma.tp3app.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3appApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;


    public static void main(String[] args) {
        SpringApplication.run(Tp3appApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Chaimae",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));


    }
}
