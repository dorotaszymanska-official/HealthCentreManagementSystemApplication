package com.example.HealthCentreManagementSystemApplication.controller;

import com.example.HealthCentreManagementSystemApplication.dto.PatientDto;
import com.example.HealthCentreManagementSystemApplication.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AuthenticationController {

    private final PatientService patientService;


    public AuthenticationController(PatientService patientService) {
        this.patientService = patientService;
    }


    @RequestMapping("/index")
    public ModelAndView getMainView() {
        ModelAndView mav = new ModelAndView("index.html");
        return mav;
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

//	@GetMapping("/main")
//	public ModelAndView getMainPage() {
//		ModelAndView modelAndView = new ModelAndView("main.html");
//		return modelAndView;
//	}

//	 @RequestMapping("/main")
//	 @ResponseBody
//	 public String getLoginPage() {
//	    return "main";
//	 }

    @GetMapping("/logout")
    public RedirectView getLogoutPage() {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/index"); // Adres URL strony głównej
        return redirectView;
//        return "main-page";
    }

    @GetMapping("/register")
    public ModelAndView getRegisterPage() {
        PatientDto patientDto = new PatientDto();
        ModelAndView modelAndView = new ModelAndView("register.html");
        modelAndView.addObject("patientDto", patientDto);
        return modelAndView;
    }
    @PostMapping("/register")
    public ModelAndView createCustomer(@ModelAttribute("patientDto") PatientDto patientDto) {
        System.out.println("!!!!! " + patientDto + " !!!!!");
        patientService.addPatient(patientDto);
        return new ModelAndView("redirect:/index");
    }



}
