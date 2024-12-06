package learning.spring.controller;

import jakarta.transaction.Transactional;
import learning.spring.domain.pilot.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/Pilot")
public class PilotController {

    @Autowired
    private PilotService pilotService;

    @Autowired
    private PilotRepository pilotRepository;


    @PostMapping("/create")
    @Transactional
    public ResponseEntity CreatePilot(@RequestBody CreatePilotDTO data, UriComponentsBuilder uriBuilder) {
        Pilot pilot = pilotService.CreatePilot(data);
        var uri = uriBuilder.path("/Pilot/{id}").buildAndExpand(pilot.getId()).toUri();
        return ResponseEntity.created(uri).body(new DetailsPilotDTO(pilot));
    }

    @GetMapping("/{id}")
    public PilotWithTeamDTO getPilotWithTeam(@PathVariable Long id) {
        return pilotService.getPilotWithTeam(id);
    }
}
