package tech.logicforge.hospitalManagementSystem.service;

import tech.logicforge.hospitalManagementSystem.entity.Patient;
import tech.logicforge.hospitalManagementSystem.entity.type.BloodGroupType;
import tech.logicforge.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    @Transactional
    public void testPatientTransaction() {

        Patient p1 = patientRepository.findById(1L).orElseThrow();
        Patient p2 = patientRepository.findById(1L).orElseThrow();

        System.out.println(p1 +"  "+p2);
        System.out.println(p1 == p2);

        p1.setName("Random Name");
    }

    @Transactional
    public void deletePatient(Long patientId) {
        patientRepository.findById(patientId).orElseThrow();
        patientRepository.deleteById(patientId);
    }

    public void createPatient(Patient patient) {
        Patient createPatients = Patient.builder()
                .name("vansh")
                .birthDate(LocalDate.of(2007, 2, 24))
                .email("dhame@gmail.com")
                .gender("male")
                .bloodGroup(BloodGroupType.O_NEGATIVE)
                .createdAt(LocalDateTime.now())
                .build();

        patientRepository.save(patient);

    }

}
