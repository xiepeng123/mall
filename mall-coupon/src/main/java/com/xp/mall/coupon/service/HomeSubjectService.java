package com.xp.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 19:58:42
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

