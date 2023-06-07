package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Insurance;
import Health_Management_System.MyProject.Models.MedicalAppointment;


import Health_Management_System.MyProject.Repositories.MedicalAppointmentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalAppointmentServices {
    @Autowired
    MedicalAppointmentRepositories medicalAppointmentRepositories;
    public List<MedicalAppointment> getAllMedicalAppointment() {

        return (List<MedicalAppointment>) medicalAppointmentRepositories.findAll();
    }

    public MedicalAppointment getMedicalAppointmentById(Integer id) {

        return (MedicalAppointment) medicalAppointmentRepositories.findById(id).get();
    }
}
