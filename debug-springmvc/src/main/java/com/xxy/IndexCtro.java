package com.xxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xiongxiaoyu
 * Data:2019/1/5
 * Time:21:17
 */

@Controller
public class IndexCtro {



	@RequestMapping("/index")
//    @ResponseBody
	public String getIndex(ModelAndView modelAndView) {
		System.out.println("in");
		return "index";
	}


	@RequestMapping("/param")
	@ResponseBody
	public String getParam(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		String result = "name is " + name + " and age is " + age;
		System.out.println(result);
		return result;
	}

	@RequestMapping("/header")
	public String getHeaderParams(@RequestHeader(value = "Accept") String[] accepts) {
		return null;
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}




	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String get(@PathVariable("id") Integer id) {
		System.out.println("get" + id);
		return "/hello" + id;
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
	@ResponseBody
	public String post(@PathVariable("id") Integer id) {
		System.out.println("post" + id);
		return "/hello";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public String put(@PathVariable("id") Integer id) {
		System.out.println("put" + id);
		return "/hello";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable("id") Integer id) {
		System.out.println("delete" + id);
		return "/hello";
	}

}
