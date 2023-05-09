package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.InsuranceServices;
import Health_Management_System.MyProject.Services.Medical_AppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Medical_Appointment")
public class Medical_AppointmentControllers {

    @Autowired
    Medical_AppointmentServices medical_appointmentServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Medical_Appointment> List<Medical_Appointment> getAllMedical_Appointment() {

        return (List<Medical_Appointment>) medical_appointmentServices.getAllMedical_Appointment();
    }
    @GetMapping(value = "getById")
    public <Medical_Appointment> Medical_Appointment getMedical_AppointmentById(@RequestParam Integer id) {

        return (Medical_Appointment) medical_appointmentServices.getMedical_AppointmentById(id);
    }
}
