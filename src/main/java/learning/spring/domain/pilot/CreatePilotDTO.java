package learning.spring.domain.pilot;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Date;

public record CreatePilotDTO(
        @NotBlank
        @Size(min = 3, max = 100)
        String name,

        @NotBlank
        Date birthDate,

        @NotBlank
        int worldTitle,

        @NotBlank
        int licenseNumber
) {
}
