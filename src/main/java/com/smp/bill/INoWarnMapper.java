package com.smp.bill;

import org.apache.ibatis.annotations.Mapper;

/**
 * @InterfaceName: INoWarnMapper
 * @Description: doScan()会扫描启动类同级目录下的mapper接口，
 *               但是合理的目录结果绝对不允许所有的mapper都在启动类目录下,
 *               所以在启动类目录下添加了一个伪mapper。
 * @Author: dufei
 * @Date: Created in 2019/11/11 22:44
 * @Version: 1.0.1
 **/

@Mapper
public interface INoWarnMapper {
}
