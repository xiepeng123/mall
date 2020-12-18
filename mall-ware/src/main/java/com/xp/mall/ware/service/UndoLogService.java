package com.xp.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 22:38:34
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

