package controllers;

import entities.User;
import entities.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String showMainPage(Principal p) {

		return "index";
	}

	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}

	@RequestMapping("/pageone")
	public String showPageOne(Model model)
	{
		model.addAttribute("title","First Page");
		model.addAttribute("pagenumber","1");
		return "pageone";
	}


	@GetMapping("/register")
	public String showRegistrationPage(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}

	@PostMapping("/register")
	public String processRegistrationPage(@Valid @ModelAttribute("user") User userData,
	                                      BindingResult bindingresult, Model model)
	{
		model.addAttribute("user", userData);
		if (bindingresult.hasErrors()) {
			return "register";
		} else {
			userService.saveRole(userData);
			model.addAttribute("message", "User Account Succesfully Created!");
		}
		return "index";
	}
	@RequestMapping("/pagetwo")
	public String showPageTwo(Model model)
	{
		model.addAttribute("title","Second Page");
		model.addAttribute("pagenumber","2");
		return "pagetwo";
	}

	@RequestMapping("/pagethree")
	public String showPageThree(Model model)
	{
		model.addAttribute("title","Third Page");
		model.addAttribute("pagenumber","3");
		return "pagethree";
	}


}
