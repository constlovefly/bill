package com.smp.bill.controller;


import com.smp.bill.common.utils.ResultModel;
import com.smp.bill.entity.CoalTypeEntity;
import com.smp.bill.service.ICoalTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

/**
 * <p>
 *  煤矿种类前端控制器
 * </p>
 *
 * @author dufei
 * @since 2019-11-11
 */
@RestController
@RequestMapping("/coaltype")
@Api(value = "CoalTypeEntity对象", tags = "煤矿种类")
public class CoalTypeController {

    @Autowired
    private ICoalTypeService coalTypeService;

    @ApiOperation(value = "获取煤矿种类信息", notes = "根据URL的id获取煤矿种类信息")
    @ApiImplicitParam(name = "id", value = "煤矿种类ID", required = true,
            dataType = "String", paramType = "path")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResultModel> getCoalTypeById (@NotEmpty(message = "煤矿种类ID不能为空")
                                                        @PathVariable(value = "id") String id) {
        ResultModel resultModel = new ResultModel();
        try {
            CoalTypeEntity coalTypeEntity = coalTypeService.getById(id);
            resultModel.setData(coalTypeEntity);
            resultModel.setCode("200");
            resultModel.setMessage("success");
        } catch (Exception e) {
            resultModel.setCode("500");
            resultModel.setMessage(e.getClass().getName() + ":" + e.getMessage());
            e.printStackTrace();
        }
        return ResponseEntity.ok(resultModel);
    }
}
