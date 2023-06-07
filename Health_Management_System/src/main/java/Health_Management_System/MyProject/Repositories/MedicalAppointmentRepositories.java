package Health_Management_System.MyProject.Repositories;


import Health_Management_System.MyProject.Models.MedicalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalAppointmentRepositories extends JpaRepository<MedicalAppointment, Integer> {
}
