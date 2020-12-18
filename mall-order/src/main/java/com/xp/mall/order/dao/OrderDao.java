package com.xp.mall.order.dao;

import com.xp.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 22:33:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
