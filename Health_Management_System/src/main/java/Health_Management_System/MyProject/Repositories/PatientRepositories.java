package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Medical_Record;
import Health_Management_System.MyProject.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepositories extends JpaRepository<Patient, Integer> {
}
