package learning.spring.controller;

import jakarta.transaction.Transactional;
import learning.spring.domain.pilot.DetailsPilotDTO;
import learning.spring.domain.pilot.Pilot;
import learning.spring.domain.team.CreateTeamDTO;
import learning.spring.domain.team.DetailsTeamDTO;
import learning.spring.domain.team.Team;
import learning.spring.domain.team.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RequestMapping("/Team")
@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;


    @PostMapping("/create")
    @Transactional
    public ResponseEntity createTeam(@RequestBody CreateTeamDTO data, UriComponentsBuilder uriBuilder) {
        Team team = teamService.CreateTeam(data);
        var uri = uriBuilder.path("/Team/{id}").buildAndExpand(team.getTeamId()).toUri();
        return ResponseEntity.created(uri).body(new DetailsTeamDTO(team));
    }

}
