package com.beijing.wm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beijing.wm.product.entity.AttrAttrgroupRelationEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-12-10 22:28:23
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

