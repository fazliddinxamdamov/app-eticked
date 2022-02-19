package ai.ecma.appeticketserver.payload.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * This class not documented :(
 *
 * @author Fazliddin Xamdamov
 * @since 18.12.2021
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PromoCodeRespDto {

    private Long number;
    private Double percent;
    private UUID userId;
    private Boolean isUsed;
    private Timestamp expireDate;  //  2021-03-24 16:48:05.591
}