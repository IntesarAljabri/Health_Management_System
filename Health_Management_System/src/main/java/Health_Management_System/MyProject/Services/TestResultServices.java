package Health_Management_System.MyProject.Services;

import Health_Management_System.MyProject.Models.TestResult;
import Health_Management_System.MyProject.Repositories.TestResultRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestResultServices {

    @Autowired
    TestResultRepositories testResultRepositories;
    public List<TestResult> getAllTestResult() {

        return (List<TestResult>) testResultRepositories.findAll();
    }

    public TestResult getTestResultById(Integer id) {

        return (TestResult) testResultRepositories.findById(id).get();
    }
}
