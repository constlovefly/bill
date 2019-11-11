package com.smp.bill.common.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: ResultModel
 * @Description: 返回数据封装
 * @Author: dufei
 * @Date: Created in 2019/11/11 23:31
 * @Version: 1.0.0
 **/


@ApiModel
@Data
public class ResultModel<T> implements Serializable {

    @ApiModelProperty(value = "返回编码")
    private String code;

    @ApiModelProperty(value = "数据对象")
    private T data;

    @ApiModelProperty(value = "返回编码描述")
    private String message;

}
