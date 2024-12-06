package learning.spring.domain.pilot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotService {
    @Autowired
    private PilotRepository pilotRepository;

    public Pilot CreatePilot(CreatePilotDTO data) {
        var pilot = new Pilot(data);
        return pilotRepository.save(pilot);
    }
}
