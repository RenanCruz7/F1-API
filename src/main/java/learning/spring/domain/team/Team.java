package learning.spring.domain.team;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "team")
@Entity(name = "team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;
    private String teamName;
    private String carName;
    private String engine;
    private Date foundation;

    public Team(CreateTeamDTO data){
        this.teamName = data.teamName();
        this.carName = data.carName();
        this.engine = data.engine();
        this.foundation = data.foundation();
    }


}
