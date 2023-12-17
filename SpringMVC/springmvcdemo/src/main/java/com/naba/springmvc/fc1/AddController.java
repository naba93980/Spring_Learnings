package com.naba.springmvc.fc1;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.naba.springmvc.fc1.service.AddService;


@Controller
public class AddController {
	
	// Basically as is EJB
	private AddService addService;
	
	public AddController() {
		System.out.println(this);

		System.out.println("without param cons");
	}
	
	public AddController(AddService addService) {
		this.addService = addService;
		System.out.println(this);
		System.out.println("ADD SERVICE OBJECT INJECTED");
		System.out.println("ADD CONTROLLR CREATED");
	}
	
    @RequestMapping(value="/add")
	public ModelAndView add(@RequestParam("t1") int t1, @RequestParam("t2") int t2) {
		
		int result = addService.add(t1, t2);
		
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("display");
		mv.addObject("result", result);
		return mv;
		
	}
}
