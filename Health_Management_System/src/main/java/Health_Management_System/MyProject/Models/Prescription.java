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
@Table(name = "Prescription")
public class Prescription {

    //الوصفات الطبية
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PrescriptionId")
    Integer prescription_id;

    @Column(name = "PrescriptionName")
    String prescription_name;

    @Column(name = "Description")
    String description;

//    @OneToMany(mappedBy = "prescription")
//    @JsonIgnore
//    private List<Medical_appointment> medicalAppointments;

    @ManyToMany(mappedBy = "prescription")
    @JsonIgnore
    private List<MedicalAppointment> medicalAppointments;
}
