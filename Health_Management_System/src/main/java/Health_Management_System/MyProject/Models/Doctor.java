package Health_Management_System.MyProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "Doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DoctorId")
    Integer id;

    @Column(name = "DoctorName")
    String doctor_name;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<MedicalAppointment> appointments;

    @OneToMany(mappedBy = "doctor")
    @JsonIgnore
    private List<Patient> patients;

    @ManyToOne
    @JoinColumn(name = "HospitalId", referencedColumnName = "HospitalId")
    Hospital hospital;
}
