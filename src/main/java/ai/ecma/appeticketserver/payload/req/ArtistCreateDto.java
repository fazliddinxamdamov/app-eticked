package ai.ecma.appeticketserver.payload.req;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author Yormamatov Davronbek
 * @since 06.01.2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArtistCreateDto {

    @NotBlank(message = "{ARTIST_NAME_REQUIRED}")
    private String name;

    private String description;
}
