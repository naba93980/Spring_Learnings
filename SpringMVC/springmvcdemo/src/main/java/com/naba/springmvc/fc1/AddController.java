package com.naba.springmvc.fc1;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {
	
    @RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int t1 = Integer.parseInt(request.getParameter("t1"));
		int t2 = Integer.parseInt(request.getParameter("t2"));
		int result = t1+t2;
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("display");
		mv.addObject("result", result);
		return mv;
	}
}
