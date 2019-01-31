package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName:  HelloController   
 * @Description:
 * @author: daoting.XZ
 * @date: 2019年1月9日 上午9:52:47
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello5678687685678kkkkkkkkkkkkkkkkkkkkkkkkk哈哈哈哈哈哈";
	}
}
