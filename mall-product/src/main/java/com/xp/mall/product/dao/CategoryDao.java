package com.xp.mall.product.dao;

import com.xp.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiepeng
 * @email 472271316@qq.com
 * @date 2020-12-13 10:37:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
