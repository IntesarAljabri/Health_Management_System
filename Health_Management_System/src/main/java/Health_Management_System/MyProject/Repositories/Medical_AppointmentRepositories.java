package Health_Management_System.MyProject.Repositories;

import Health_Management_System.MyProject.Models.Medical_Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Medical_AppointmentRepositories extends JpaRepository<Medical_Appointment, Integer> {
}
