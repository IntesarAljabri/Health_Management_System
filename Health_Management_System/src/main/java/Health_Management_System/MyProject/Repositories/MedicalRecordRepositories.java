package Health_Management_System.MyProject.Repositories;


import Health_Management_System.MyProject.Models.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepositories extends JpaRepository<MedicalRecord, Integer> {
}
