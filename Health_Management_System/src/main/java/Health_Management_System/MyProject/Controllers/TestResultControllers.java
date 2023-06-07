package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.PrescriptionServices;
import Health_Management_System.MyProject.Services.TestResultServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "TestResult")
public class TestResultControllers {

    @Autowired
    TestResultServices testResultServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <TestResult> List<TestResult> getAllTest_Result() {

        return (List<TestResult>) testResultServices.getAllTestResult();
    }
    @GetMapping(value = "getById")
    public <TestResult> TestResult getTest_ResultById(@RequestParam Integer id) {

        return (TestResult) testResultServices.getTestResultById(id);
    }

}
