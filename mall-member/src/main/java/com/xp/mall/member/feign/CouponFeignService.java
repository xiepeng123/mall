package com.xp.mall.member.feign;

import com.xp.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: xp
 * Date: 2020/12/15
 * Time: 14:29
 * Description: No Description
 */
@FeignClient(value = "mall-coupon")
public interface CouponFeignService {

  @RequestMapping("/coupon/coupon/member/list")
  public R getMemberCouponList();

}
