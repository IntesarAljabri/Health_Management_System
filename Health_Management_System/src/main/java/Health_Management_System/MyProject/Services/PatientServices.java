package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Patient;

import Health_Management_System.MyProject.Repositories.PatientRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServices {
    @Autowired
    PatientRepositories patientRepositories;
    public List<Patient> getAllPatient() {

        return (List<Patient>) patientRepositories.findAll();
    }

    public Patient getPatientById(Integer id) {

        return (Patient) patientRepositories.findById(id).get();
    }
}
