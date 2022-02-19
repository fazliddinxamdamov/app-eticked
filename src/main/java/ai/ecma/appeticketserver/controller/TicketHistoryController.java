package ai.ecma.appeticketserver.controller;

import ai.ecma.appeticketserver.enums.PermissionEnum;
import ai.ecma.appeticketserver.payload.ApiResult;
import ai.ecma.appeticketserver.payload.CustomPage;
import ai.ecma.appeticketserver.payload.req.RoleReqDto;
import ai.ecma.appeticketserver.payload.resp.CategoryRespDto;
import ai.ecma.appeticketserver.payload.resp.RoleRespDto;
import ai.ecma.appeticketserver.payload.resp.TicketHistoryRespDto;
import ai.ecma.appeticketserver.utils.AppConstant;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import static ai.ecma.appeticketserver.utils.AppConstant.DEFAULT_PAGE_NUMBER;
import static ai.ecma.appeticketserver.utils.AppConstant.DEFAULT_PAGE_SIZE;

/**
 * This interface not documented :(
 *
 * @author Muhammad Mo'minov
 * @since 16.12.2021
 */
@RequestMapping(TicketHistoryController.ROLE_CONTROLLER)
public interface TicketHistoryController {
    String ROLE_CONTROLLER = AppConstant.BASE_PATH + "/ticket/history";

    @GetMapping("/get-all")
    ApiResult<CustomPage<TicketHistoryRespDto>> getAll(@RequestParam(name = "page", defaultValue = DEFAULT_PAGE_NUMBER, required = false) Integer page,
                                                       @RequestParam(name = "size", defaultValue = DEFAULT_PAGE_SIZE, required = false) Integer size);


    @GetMapping("/get/{ticketId}")
    ApiResult<CustomPage<TicketHistoryRespDto>> getAllByTicketId(@PathVariable(value = "ticketId")  UUID ticketId,
                                                           @RequestParam(name = "page", defaultValue = DEFAULT_PAGE_NUMBER, required = false) Integer page,
                                                           @RequestParam(name = "size", defaultValue = DEFAULT_PAGE_SIZE, required = false) Integer size);



}
