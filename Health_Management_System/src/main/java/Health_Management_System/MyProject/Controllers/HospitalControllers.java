package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.DoctorServices;
import Health_Management_System.MyProject.Services.HospitalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Hospital")
public class HospitalControllers {

    @Autowired
    HospitalServices hospitalServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Hospital> List<Hospital> getAllHospital() {

        return (List<Hospital>) hospitalServices.getAllHospital();
    }
    @GetMapping(value = "getById")
    public <Hospital> Hospital getHospitalById(@RequestParam Integer id) {

        return (Hospital) hospitalServices.getHospitalById(id);
    }
}
