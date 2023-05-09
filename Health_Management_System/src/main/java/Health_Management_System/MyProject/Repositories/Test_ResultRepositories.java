package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Patient;
import Health_Management_System.MyProject.Models.Test_Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Test_ResultRepositories extends JpaRepository<Test_Result, Integer> {
}
