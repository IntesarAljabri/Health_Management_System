package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.InsuranceServices;
import Health_Management_System.MyProject.Services.MedicalAppointmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Medical_Appointment")
public class MedicalAppointmentControllers {

    @Autowired
    MedicalAppointmentServices medicalAppointmentServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <MedicalAppointment> List<MedicalAppointment> getAllMedicalAppointment() {

        return (List<MedicalAppointment>) medicalAppointmentServices.getAllMedicalAppointment();
    }
    @GetMapping(value = "getById")
    public <MedicalAppointment> MedicalAppointment getMedical_AppointmentById(@RequestParam Integer id) {

        return (MedicalAppointment) medicalAppointmentServices.getMedicalAppointmentById(id);
    }
}
