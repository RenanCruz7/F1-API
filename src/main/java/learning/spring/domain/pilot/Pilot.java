package learning.spring.domain.pilot;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "pilot")
@Table(name = "pilot")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date birthDate;
    private int licenseNumber;
    private int worldTitle;


    public Pilot(CreatePilotDTO data) {
        this.name = data.name();
        this.birthDate = data.birthDate();
        this.licenseNumber = data.licenseNumber();
        this.worldTitle = data.worldTitle();
    }
}
