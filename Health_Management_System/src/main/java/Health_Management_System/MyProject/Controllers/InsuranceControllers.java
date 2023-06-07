package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.HospitalServices;
import Health_Management_System.MyProject.Services.InsuranceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Insurance")
public class InsuranceControllers {

    @Autowired
    InsuranceServices insuranceServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Insurance> List<Insurance> getAllInsurance() {

        return (List<Insurance>) insuranceServices.getAllInsurance();
    }
    @GetMapping(value = "getById")
    public <Insurance> Insurance getInsuranceById(@RequestParam Integer id) {

        return (Insurance) insuranceServices.getInsuranceById(id);
    }
}
