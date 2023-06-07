package Health_Management_System.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "MedicalRecord")
public class MedicalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicalRecordId")
    Integer medicalRecordId;

    @Column(name = "VisitDate")
    String visit_date;

    @ManyToOne
    @JoinColumn(name = "PatientId")
    Patient patient;
}
