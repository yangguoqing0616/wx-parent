package com.beijing.wm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beijing.wm.product.entity.ProductAttrValueEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * spu属性值
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-12-10 22:28:23
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

