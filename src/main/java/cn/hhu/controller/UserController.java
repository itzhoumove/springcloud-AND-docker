package cn.hhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cn.hhu.bean.User;
import cn.hhu.dao.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	/*
	 * 相当于@RequestMapping(method = RequestMethod.GET);
	 * 类似的还有@PostMapping，@PutMapping,@DeleteMapping,@PatchMapping
	 * 
	 * @PathVariable把接受参数传到方法的形参里面
	 */
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		User findOne = this.userRepository.findOne(id);
		return findOne;
	}
}
