package com.evoke.springmvcconcepts;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class ProductController  {

	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
//		String str = "Welcome to spring MVC concepts :)";
		ModelAndView model = new ModelAndView("display");
		model.addObject("message", "Welcome to spring MVC concepts ");
		model.addObject("today", "dfghjkiyjhgfds");
		return model;
	}
}
