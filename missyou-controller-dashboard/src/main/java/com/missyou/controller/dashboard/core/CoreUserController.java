package com.missyou.controller.dashboard.core;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.missyou.business.core.service.ICoreUserService;
import com.missyou.commons.response.ResponseResult;
import com.missyou.repository.core.domain.CoreUser;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Objects;

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
public class CoreUserController {

	@Resource
	private ICoreUserService coreUserService;

	/**
	 * 新增
	 * @param coreUser {@link CoreUser}
	 * @return {@link ResponseResult}
	 */
	@PostMapping("create")
	public ResponseResult create(@Valid @RequestBody CoreUser coreUser, BindingResult bindingResult) {
		// 表单验证
		if (bindingResult.hasErrors()) {
			return ResponseResult.failure(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
		}

		// 业务逻辑
		boolean created = coreUserService.create(coreUser);
		if (created) {
			return ResponseResult.success("创建成功");
		}

		return null;
	}

	/**
	 * 删除
	 * @param coreUserId {@code Long}
	 * @return {@link ResponseResult}
	 */
	@DeleteMapping("remove/{coreUserId}")
	public ResponseResult remove(@PathVariable Long coreUserId) {
		// 业务逻辑
		boolean deleted = coreUserService.remove(coreUserId);
		if (deleted) {
			return ResponseResult.success("删除成功");
		}

		return null;
	}

	/**
	 * 修改
	 * @param coreUser {@link CoreUser}
	 * @return {@link ResponseResult}
	 */
	@PutMapping("update")
	public ResponseResult update(@Valid @RequestBody CoreUser coreUser, BindingResult bindingResult) {
		// 表单验证
		if (bindingResult.hasErrors()) {
			return ResponseResult.failure(Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
		}

		// 业务逻辑
		boolean updated = coreUserService.update(coreUser);
		if (updated) {
			return ResponseResult.success("编辑成功");
		}

		return null;
	}

	/**
	 * 获取
	 * @param coreUserId {@code Long}
	 * @return {@link ResponseResult}
	 */
	@GetMapping("get/{coreUserId}")
	public ResponseResult get(@PathVariable Long coreUserId) {
		CoreUser coreUser = coreUserService.get(coreUserId);
		return ResponseResult.success(coreUser);
	}

	/**
	 * 分页
	 * @param current {@code int} 页码
	 * @param size {@code int} 笔数
	 * @return {@link ResponseResult}
	 */
	@GetMapping("page")
	public ResponseResult page(@RequestParam int current, @RequestParam int size, @ModelAttribute CoreUser coreUser) {
		IPage<CoreUser> page = coreUserService.page(current, size, coreUser);
		return ResponseResult.success(page);
	}

}
