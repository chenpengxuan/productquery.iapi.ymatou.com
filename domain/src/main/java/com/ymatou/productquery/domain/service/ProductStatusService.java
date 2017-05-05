package com.ymatou.productquery.domain.service;

import com.ymatou.productquery.domain.model.ActivityProducts;
import com.ymatou.productquery.domain.model.LiveProducts;
import com.ymatou.productquery.model.res.ProductStatusEnum;

import java.util.Date;

/**
 * Created by zhangyong on 2017/4/13.
 */
public class ProductStatusService {
    /**
     * 取商品的销售状态
     *
     * @param action
     * @param validStart
     * @param validEnd
     * @param liveProduct
     * @param activityProduct
     * @return
     */
    public static int getProductStatus(int action, Date validStart, Date validEnd, LiveProducts liveProduct, ActivityProducts activityProduct) {
        if (action == -1) {
            return ProductStatusEnum.Deleted.getCode();
        }
        if (activityProduct != null) {
            return ProductStatusEnum.Available.getCode();
        }
        Date now = new Date();
        if (liveProduct != null) {
            return !now.before(liveProduct.getStartTime()) && !now.after(liveProduct.getEndTime()) && liveProduct.getSellStatus() == 1
                    ? ProductStatusEnum.Available.getCode() : ProductStatusEnum.Disable.getCode();
        }
        return !now.before(validStart) && !now.after(validEnd)
                ? ProductStatusEnum.Available.getCode() : ProductStatusEnum.Disable.getCode();
    }
}
