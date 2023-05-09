package Health_Management_System.MyProject.Models;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Medical_record")
public class Medical_Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Medical_record_id")
    Integer medical_record_id;

    @Column(name = "Visit_date")
    String visit_date;

    @ManyToOne
    @JoinColumn(name = "Patient_id")
    Patient patient;
}
