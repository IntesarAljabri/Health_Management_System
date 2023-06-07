package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.MedicalRecordeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "medicalRecord")
public class MedicalRecordControllers<Medical_Record> {
    //     http://localhost:8080/medical_record/getAll
    @Autowired
    MedicalRecordeServices medicalRecordServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Medical_Record> getAllMedicalRecord() {

        return medicalRecordServices.getAllMedicalRecords();
    }

    @GetMapping(value = "getById")
    public Medical_Record getMedicalRecordById(@RequestParam Integer id) {
        return (Medical_Record) medicalRecordServices.getMedicalRecordById(id);
    }
}
