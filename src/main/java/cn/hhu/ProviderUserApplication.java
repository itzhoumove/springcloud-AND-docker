package cn.hhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * 声明为spring boot 项目
 * @SpringBootApplication是一个组合注解
 * @Configuration相当于传统的xml配置beans
 * @EnableAutoConfiguration尝试根据你添加的jar依赖，自动配置你的spring应用
 * @ComponentScan该类自动发现扫描组件
 */

@SpringBootApplication
public class ProviderUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderUserApplication.class,args);
	}
}
