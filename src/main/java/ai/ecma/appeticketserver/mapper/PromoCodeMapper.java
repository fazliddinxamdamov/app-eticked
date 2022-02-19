package ai.ecma.appeticketserver.mapper;

import ai.ecma.appeticketserver.entity.Category;
import ai.ecma.appeticketserver.entity.PromoCode;
import ai.ecma.appeticketserver.payload.resp.CategoryRespDto;
import ai.ecma.appeticketserver.payload.resp.PromoCodeRespDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import static org.mapstruct.ReportingPolicy.IGNORE;

/**
 * @author Fazliddin Xamdamov
 * @project app-eticket-server
 * @since 12/16/2021
 */

@Mapper(unmappedTargetPolicy = IGNORE, componentModel = "spring")
@Component
public interface PromoCodeMapper {


    PromoCodeRespDto toPromoCodeDto(PromoCode promoCode);

    PromoCode toPromoCode(PromoCodeRespDto promoCodeRespDto);
}
