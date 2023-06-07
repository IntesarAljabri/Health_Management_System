package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepositories extends JpaRepository<Hospital, Integer> {
}
