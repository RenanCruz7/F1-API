package learning.spring.domain.pilot;

import learning.spring.domain.team.Team;

public record DetailsPilotDTO(
        Long id,
        String name,
        int licenseNumber,
        int worldTitle,
        Team team
) {
    public DetailsPilotDTO(Pilot pilot) {
        this(pilot.getId(), pilot.getName(), pilot.getLicenseNumber(), pilot.getWorldTitle(), pilot.getTeam());
    }
}
