package com.smp.bill.common.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: PageModel
 * @Description: 分页封装类
 * @Author: dufei
 * @Date: Created in 2019/11/11 23:08
 * @Version: 1.0.0
 **/

@Data
@ApiModel
public class PageModel<T> {

    //当前页数
    @ApiModelProperty(value = "当前页数")
    private int pageNo;

    //每页显示数量
    @ApiModelProperty(value = "每页显示数量")
    private int pageSize;

    @ApiModelProperty(value = "总条数")
    private int totalRecord;

    //数据列表
    @ApiModelProperty(value = "数据列表")
    private List<T> parameterType;

    //总页数
    @ApiModelProperty(value = "总页数")
    private int totalPage;

    //排序字段
    @ApiModelProperty(value = "排序字段")
    private String orderByField;

    //是否升序
    @ApiModelProperty(value = "是否升序")
    private boolean isAsc;

}
