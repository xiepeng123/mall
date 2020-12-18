package com.xp.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 22:33:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

