package learning.spring.domain.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team CreateTeam(CreateTeamDTO data) {
        var team = new Team(data);
        return teamRepository.save(team);
    }
}
