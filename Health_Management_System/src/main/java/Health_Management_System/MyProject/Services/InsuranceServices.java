package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Hospital;
import Health_Management_System.MyProject.Models.Insurance;
import Health_Management_System.MyProject.Repositories.HospitalRepositories;
import Health_Management_System.MyProject.Repositories.InsuranceRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceServices {

    @Autowired
    InsuranceRepositories insuranceRepositories;
    public List<Insurance> getAllInsurance() {

        return (List<Insurance>) insuranceRepositories.findAll();
    }

    public Insurance getInsuranceById(Integer id) {

        return (Insurance) insuranceRepositories.findById(id).get();
    }
}
