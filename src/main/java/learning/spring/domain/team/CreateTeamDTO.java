package learning.spring.domain.team;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record CreateTeamDTO(
        @NotBlank
        @Size(min = 3, max = 100)
        String teamName,
        @NotBlank
        @Size(min = 3, max = 100)
        String carName,
        @NotBlank
        @Size(min = 3, max = 100)
        String engine,
        @NotBlank
        Date foundation
) {
}
