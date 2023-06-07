package Health_Management_System.MyProject.Models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "MedicalAppointment")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MedicalAppointmentId")
    Integer medicalAppointment;

    @Column(name = "AppointmentDate")
    String medicslAppintmentDate;

//    @ManyToOne
//    @JoinColumn(name = "Prescription_id")
//    Prescription prescription;

    @ManyToMany
    @JoinTable(name = "MedicalAppointmentPrescription", joinColumns = @JoinColumn(name = "MedicalAppointmentId"), inverseJoinColumns = @JoinColumn(name = "Prescription_id"))
    List<Prescription> prescription;

    @ManyToOne
    @JoinColumn(name = "DoctorId")
    Doctor doctor;
}

