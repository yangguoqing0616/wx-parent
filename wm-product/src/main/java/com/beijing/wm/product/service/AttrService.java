package com.beijing.wm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beijing.wm.product.entity.AttrEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-12-10 22:28:23
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

