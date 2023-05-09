package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.Prescription;
import Health_Management_System.MyProject.Models.Test_Result;
import Health_Management_System.MyProject.Repositories.PrescriptionRepositories;
import Health_Management_System.MyProject.Repositories.Test_ResultRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Test_ResultServices {

    @Autowired
    Test_ResultRepositories test_ResultRepositories;
    public List<Test_Result> getAllTest_Result() {

        return (List<Test_Result>) test_ResultRepositories.findAll();
    }

    public Test_Result getTest_ResultById(Integer id) {

        return (Test_Result) test_ResultRepositories.findById(id).get();
    }
}
