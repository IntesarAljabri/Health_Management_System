package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Patient;
import Health_Management_System.MyProject.Models.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultRepositories extends JpaRepository<TestResult, Integer> {
}
