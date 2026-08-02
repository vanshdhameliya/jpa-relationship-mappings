package tech.logicforge.hospitalManagementSystem.service;

import tech.logicforge.hospitalManagementSystem.entity.Appointment;
import tech.logicforge.hospitalManagementSystem.entity.Doctor;
import tech.logicforge.hospitalManagementSystem.entity.Patient;
import tech.logicforge.hospitalManagementSystem.repository.AppointmentRepository;
import tech.logicforge.hospitalManagementSystem.repository.DoctorRepository;
import tech.logicforge.hospitalManagementSystem.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);

        return appointment;
    }


}
