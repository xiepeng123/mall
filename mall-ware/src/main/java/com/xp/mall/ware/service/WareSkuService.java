package com.xp.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 22:38:34
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

