package com.evoke.onlinebookstorecontroller;

import java.lang.System.Logger;

import javax.servlet.http.HttpServletRequest;

import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Controller
public class DemoController {
	Logger logger = (Logger) LoggerFactory.getLogger(DemoController.class);

//	@RequestMapping("/user")
//	public String getBookModel(HttpServletRequest request, Model model) {
//		// read the provided form data
//		String FName = request.getParameter("FirstName");
//		String LName = request.getParameter("LastName");
//		String password = request.getParameter("password");
//
//		if (password.equals("admin")) {
//			String msg = "Hello " + FName + LName + " :)";
//			// add a message to the model
//			model.addAttribute("message", msg);
//			return "user";
//		} else {
//			String msg = "Sorry " + password + "You entered !is  an incorrect password !";
//			model.addAttribute("message", msg);
//			return "errorpage";
//		}
//	}
	@RequestMapping("/display")
	public String getuserpage() {

		return "user";
	}

}
