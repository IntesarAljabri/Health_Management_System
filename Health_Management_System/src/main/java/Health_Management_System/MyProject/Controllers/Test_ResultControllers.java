package Health_Management_System.MyProject.Controllers;

import Health_Management_System.MyProject.Services.PrescriptionServices;
import Health_Management_System.MyProject.Services.Test_ResultServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "Test_Result")
public class Test_ResultControllers {

    @Autowired
    Test_ResultServices test_ResultServices;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public <Test_Result> List<Test_Result> getAllTest_Result() {

        return (List<Test_Result>) test_ResultServices.getAllTest_Result();
    }
    @GetMapping(value = "getById")
    public <Test_Result> Test_Result getTest_ResultById(@RequestParam Integer id) {

        return (Test_Result) test_ResultServices.getTest_ResultById(id);
    }

}
