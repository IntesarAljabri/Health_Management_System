package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Models.Medical_Record;
import Health_Management_System.MyProject.Services.Medical_RecordServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "medical_record")
public class Medical_RecordControllers {
    //     http://localhost:8080/medical_record/getAll
    @Autowired
    Medical_RecordServices medical_recordServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Medical_Record> getAllMedical_Record() {

        return Medical_RecordServices.getAllMedical_Record();
    }

    @GetMapping(value = "getById")
    public Medical_Record getMedical_recordById(@RequestParam Integer id) {

        return medical_recordServices.getMedical_RecordById(id);
    }
}
