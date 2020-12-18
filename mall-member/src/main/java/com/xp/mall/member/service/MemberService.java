package com.xp.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xp.common.utils.PageUtils;
import com.xp.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 22:23:57
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

