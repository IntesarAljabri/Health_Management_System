package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepositories extends JpaRepository<Patient, Integer> {
}
