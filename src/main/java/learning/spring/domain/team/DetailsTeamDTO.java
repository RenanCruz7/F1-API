package learning.spring.domain.team;

import learning.spring.domain.pilot.Pilot;

import java.util.Date;
import java.util.List;

public record DetailsTeamDTO(
        Long id,
        String teamName,
        String carName,
        String engine,
        Date foundation,
        List<Pilot> pilot

) {
    public DetailsTeamDTO(Team team) {
        this(team.getTeamId(), team.getTeamName(), team.getCarName(), team.getEngine(), team.getFoundation(), team.getPilots());
    }
}
