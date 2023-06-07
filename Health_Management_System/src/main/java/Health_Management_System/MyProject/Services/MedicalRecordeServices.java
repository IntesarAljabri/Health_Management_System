package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Repositories.MedicalRecordRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalRecordeServices<Medical_Record> {

    @Autowired
    MedicalRecordRepositories medicalRecordRepositories;

    public List<Medical_Record> getAllMedicalRecords() {
        return (List<Medical_Record>) medicalRecordRepositories.findAll();
    }

    public Medical_Record getMedicalRecordById(Integer id) {
        return (Medical_Record) medicalRecordRepositories.findById(id).orElse(null);
    }
}
