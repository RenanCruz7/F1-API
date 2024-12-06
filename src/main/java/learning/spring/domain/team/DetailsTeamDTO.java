package learning.spring.domain.team;

import java.util.Date;

public record DetailsTeamDTO(
        Long id,
        String teamName,
        String carName,
        String engine,
        Date foundation

) {
}
