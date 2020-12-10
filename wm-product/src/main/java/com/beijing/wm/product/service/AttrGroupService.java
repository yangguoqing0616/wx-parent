package com.beijing.wm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beijing.wm.product.entity.AttrGroupEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-12-10 22:28:23
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

