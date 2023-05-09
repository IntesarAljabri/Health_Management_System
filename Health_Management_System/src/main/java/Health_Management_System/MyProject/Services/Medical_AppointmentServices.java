package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Insurance;
import Health_Management_System.MyProject.Models.Medical_Appointment;
import Health_Management_System.MyProject.Repositories.InsuranceRepositories;
import Health_Management_System.MyProject.Repositories.Medical_AppointmentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Medical_AppointmentServices {
    @Autowired
    Medical_AppointmentRepositories medical_AppointmentRepositories;
    public List<Medical_Appointment> getAllMedical_Appointment() {

        return (List<Medical_Appointment>) medical_AppointmentRepositories.findAll();
    }

    public Medical_Appointment getMedical_AppointmentById(Integer id) {

        return (Medical_Appointment) medical_AppointmentRepositories.findById(id).get();
    }
}
