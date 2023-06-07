package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Hospital;
import Health_Management_System.MyProject.Repositories.DoctorRepositories;
import Health_Management_System.MyProject.Repositories.HospitalRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServices {

    @Autowired
    HospitalRepositories hospitalRepositories;
    public List<Hospital> getAllHospital() {

        return (List<Hospital>) hospitalRepositories.findAll();
    }

    public Hospital getHospitalById(Integer id) {

        return (Hospital) hospitalRepositories.findById(id).get();
    }
}
