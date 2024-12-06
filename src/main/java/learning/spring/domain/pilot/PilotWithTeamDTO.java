package learning.spring.domain.pilot;

import learning.spring.domain.team.Team;

import java.util.Date;

public record PilotWithTeamDTO(
        Long id,
        String name,
        Date birthDate,
        int licenseNumber,
        int worldTitle,
        Team team
) {
    public PilotWithTeamDTO(Pilot pilot) {
        this(pilot.getId(), pilot.getName(), pilot.getBirthDate(), pilot.getLicenseNumber(), pilot.getWorldTitle(), pilot.getTeam());
    }
}