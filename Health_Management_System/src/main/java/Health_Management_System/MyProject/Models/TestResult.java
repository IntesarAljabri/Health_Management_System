package Health_Management_System.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "TestResult")
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TestId")
    Integer test_id;

    @ManyToOne
    @JoinColumn(name = "PatientId")
    Patient patient;
}
