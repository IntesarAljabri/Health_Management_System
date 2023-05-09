package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Patient;
import Health_Management_System.MyProject.Models.Prescription;
import Health_Management_System.MyProject.Repositories.PatientRepositories;
import Health_Management_System.MyProject.Repositories.PrescriptionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrescriptionServices {

    @Autowired
    PrescriptionRepositories prescriptionRepositories;
    public List<Prescription> getAllPrescription() {

        return (List<Prescription>) prescriptionRepositories.findAll();
    }

    public Prescription getPrescriptionById(Integer id) {

        return (Prescription) prescriptionRepositories.findById(id).get();
    }
}
