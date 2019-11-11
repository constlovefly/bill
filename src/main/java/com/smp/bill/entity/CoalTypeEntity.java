package com.smp.bill.entity;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * <p>
 * 煤矿种类实体类
 * </p>
 *
 * @author dufei
 * @since 2019-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_coal_type")
@ApiModel(value="CoalTypeEntity对象", description="煤炭种类")
public class CoalTypeEntity extends Model<CoalTypeEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @ApiModelProperty(value = "煤种类名称", name = "name", example = "沫煤、块煤和籽煤等")
    @NotEmpty(message = "煤炭种类名称不为空")
    @Length(max = 30, message = "煤炭种类名称长度应该少于15字")
    private String name;

    @ApiModelProperty(value = "逻辑已删除值(默认为 1),逻辑未删除值(默认为 0)", name = "logicFlag", example = "0")
    @TableLogic
    @NotBlank
    private String logicFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
