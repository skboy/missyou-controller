package com.missyou.controller.dashboard.core;

import com.missyou.business.core.service.ICoreUserService;
import com.missyou.commons.base.BaseController;
import com.missyou.repository.core.domain.CoreUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author skboy
 * @since 2020-06-27
 */
@RestController
@RequestMapping("core/user")
public class CoreUserController extends BaseController<CoreUser, ICoreUserService> {


}
