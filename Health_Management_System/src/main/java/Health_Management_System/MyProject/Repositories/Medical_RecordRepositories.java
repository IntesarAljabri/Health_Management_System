package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Medical_Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Medical_RecordRepositories extends JpaRepository<Medical_Record, Integer> {
}
