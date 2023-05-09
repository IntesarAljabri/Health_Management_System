package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.Medical_AppointmentServices;
import Health_Management_System.MyProject.Services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "Patient")
public class PatientControllers {

    @Autowired
    PatientServices patientServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Patient> List<Patient> getAllPatient() {

        return (List<Patient>) patientServices.getAllPatient();
    }
    @GetMapping(value = "getById")
    public <Patient> Patient getPatientById(@RequestParam Integer id) {

        return (Patient) patientServices.getPatientById(id);
    }
}
