package Health_Management_System.MyProject.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "Insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "CompanyId")
    Integer company_id;

    @Column(name = "CompanyName")
    String company_name;

    @ManyToMany(mappedBy = "insurance")
    @JsonIgnore
    private List<Hospital> hospitals;
}
