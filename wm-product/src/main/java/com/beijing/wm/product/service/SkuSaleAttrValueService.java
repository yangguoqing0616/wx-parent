package com.beijing.wm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beijing.wm.product.entity.SkuSaleAttrValueEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-12-10 22:28:23
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

