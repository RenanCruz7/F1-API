package learning.spring.domain.pilot;

import learning.spring.domain.team.Team;
import learning.spring.domain.team.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotService {
    @Autowired
    private PilotRepository pilotRepository;

    @Autowired
    private TeamRepository teamRepository;

    public Pilot CreatePilot(CreatePilotDTO data) {
        Team team = teamRepository.findById(data.teamId()).orElseThrow(() -> new IllegalArgumentException("Team not found"));
        var pilot = new Pilot(data,team);
        return pilotRepository.save(pilot);
    }

    public PilotWithTeamDTO getPilotWithTeam(Long id) {
        Pilot pilot = pilotRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Pilot not found"));
        return new PilotWithTeamDTO(pilot);
    }
}
