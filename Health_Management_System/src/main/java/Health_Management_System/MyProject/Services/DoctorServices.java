package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Repositories.DoctorRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServices<Doctor> {
    @Autowired
    DoctorRepositories doctorRepositories;
    public List<Doctor> getAllDoctor() {

        return (List<Doctor>) doctorRepositories.findAll();
    }

    public Doctor getDoctorById(Integer id) {

        return (Doctor) doctorRepositories.findById(id).get();
    }
}
