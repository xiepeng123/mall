package com.xp.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 19:58:42
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

