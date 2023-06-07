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
@Table(name = "Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PatientId")
    Integer patientId;

    @Column(name = "PatientName")
    String patientName;

    @Column(name = "Age")
    Integer age;

    @Column(name = "PhoneNumber")
    Integer phoneNumber;


    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private List<MedicalRecord> medicalRecords;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    List<TestResult> testResults;

    @ManyToOne
    @JoinColumn(name = "DoctorId", referencedColumnName = "DoctorId")
    Doctor doctor;
}
