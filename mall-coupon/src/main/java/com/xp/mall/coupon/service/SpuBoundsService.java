package com.xp.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 19:58:43
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

