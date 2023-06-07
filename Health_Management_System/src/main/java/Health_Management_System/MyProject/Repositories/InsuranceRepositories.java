package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepositories  extends JpaRepository<Insurance, Integer> {
}
