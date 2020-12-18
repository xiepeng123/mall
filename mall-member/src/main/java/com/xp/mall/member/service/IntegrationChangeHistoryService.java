package com.xp.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 22:23:57
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

