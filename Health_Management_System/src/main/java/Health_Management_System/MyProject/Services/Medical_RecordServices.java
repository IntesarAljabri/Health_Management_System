package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Medical_Appointment;
import Health_Management_System.MyProject.Models.Medical_Record;
import Health_Management_System.MyProject.Repositories.Medical_AppointmentRepositories;
import Health_Management_System.MyProject.Repositories.Medical_RecordRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Medical_RecordServices{
    @Autowired
    static
    Medical_RecordRepositories medical_RecordRepositories;
    public static List<Medical_Record> getAllMedical_Record() {

        return (List<Medical_Record>) medical_RecordRepositories.findAll();
    }

    public Medical_Record getMedical_RecordById(Integer id) {

        return (Medical_Record) medical_RecordRepositories.findById(id).get();
    }

}
