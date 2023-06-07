package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.PatientServices;
import Health_Management_System.MyProject.Services.PrescriptionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Prescription")
public class PrescriptionControllers {

    @Autowired
    PrescriptionServices prescriptionServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Prescription> List<Prescription> getAllPrescription() {

        return (List<Prescription>) prescriptionServices.getAllPrescription();
    }
    @GetMapping(value = "getById")
    public <Prescription> Prescription getPrescriptionById(@RequestParam Integer id) {

        return (Prescription) prescriptionServices.getPrescriptionById(id);
    }


}
