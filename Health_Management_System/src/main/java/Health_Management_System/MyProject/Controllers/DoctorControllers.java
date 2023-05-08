package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "doctor")
public class DoctorControllers {
    @Autowired
    DoctorServices doctorervices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Doctor> List<Doctor> getAllDoctors() {

        return doctorServices.getAllDoctors();
    }
    @GetMapping(value = "getById")
    public <Doctor> Doctor getDoctorById(@RequestParam Integer id) {

        return doctorServices.getDoctorById(id);
    }
}
