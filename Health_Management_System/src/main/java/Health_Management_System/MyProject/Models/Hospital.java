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
@Table(name = "Hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HospitalId")
    Integer hospital_id;

    @Column(name = "HospitalName")
    String hospital_name;

    @OneToMany(mappedBy = "hospital")
    @JsonIgnore
    List<Doctor> doctors;

    @ManyToMany
    @JoinTable(name = "insurance_providerHospital", joinColumns = @JoinColumn(name = "HospitalId"), inverseJoinColumns = @JoinColumn(name = "Company_id"))
    List<Insurance> insurance_providers;
}
