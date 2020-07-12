package com.missyou.controller.dashboard.core;

import com.missyou.business.core.service.ICorePostService;
import com.missyou.commons.base.BaseController;
import com.missyou.repository.core.domain.CorePost;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章表 前端控制器
 * </p>
 *
 * @author skboy
 * @since 2020-07-12
 */
@RestController
@RequestMapping("/core/post")
public class CorePostController extends BaseController<CorePost, ICorePostService> {

}
