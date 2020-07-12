package com.missyou.controller.dashboard.core;

import com.missyou.business.core.service.ICoreAdminService;
import com.missyou.commons.base.BaseController;
import com.missyou.repository.core.domain.CoreAdmin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员
 *
 * @author skboy
 * @since v1.0.0
 */
@RestController
@RequestMapping("core/admin")
public class CoreAdminController extends BaseController<CoreAdmin, ICoreAdminService> {



}