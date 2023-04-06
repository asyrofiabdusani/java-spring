package com.rofi.springmvcc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rofi.springmvccboot.model.Alien;

@Controller

public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return ("index");
	}
	
	/*
	 * @RequestMapping("/add") public String add(HttpServletRequest req) { int i =
	 * Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2"));
	 * 
	 * int x = i+j; HttpSession session = req.getSession();
	 * 
	 * session.setAttribute("result", x);
	 * 
	 * return "result.jsp"; }
	 */
	
	/*
	 * @RequestMapping("add") public String add(@RequestParam("num1") int
	 * i, @RequestParam("num2") int j, HttpSession session) { int result = i + j;
	 * session.setAttribute("result", result); return "result.jsp"; }
	 */
	
	/*
	 * @RequestMapping("add") public ModelAndView add(@RequestParam("num1") int
	 * i, @RequestParam("num2") int j) { ModelAndView mv = new ModelAndView();
	 * mv.setViewName("result"); int result = i + j;
	 * 
	 * mv.addObject("result", result);
	 * 
	 * return mv; }
	 */
	
	/*
	 * @RequestMapping("add") public String add(@RequestParam("num1") int
	 * i, @RequestParam("num2") int j, Model m) {
	 * 
	 * int result = i + j; m.addAttribute("result", result);
	 * 
	 * return "result"; }
	 */
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {
		
		int result = i + j;
		m.addAttribute("result", result);
		
		return "result";
	}
	
	/*
	 * @RequestMapping("addAlien") public String addAlien(@RequestParam("aId") int
	 * id, @RequestParam("aName") String name, Model m) { Alien a = new Alien();
	 * a.setaId(id); a.setaName(name);
	 * 
	 * m.addAttribute("alien", a); return "result2"; }
	 */
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a, Model m) {	
		return "result2";
	}
}
