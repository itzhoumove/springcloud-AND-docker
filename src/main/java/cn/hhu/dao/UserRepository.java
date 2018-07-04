package cn.hhu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.hhu.bean.User;
/*
 * @RepositoryJpaRepository支持接口规范方法名查询。
 * 意思是如果在接口中定义的查询方法符合它的命名规则，就可以不用写实现，目前支持的关键字如下。
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
