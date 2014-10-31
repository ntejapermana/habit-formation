package com.duskclouds.habit.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duskclouds.habit.service.HabitService;
import com.duskclouds.habit.web.dto.HabitDto;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	private HabitService habitService;

	@RequestMapping(method = RequestMethod.GET)
	public String indexMethod(ModelMap model) {
		model.addAttribute("habits", getHabits());
		return "/dashboard";
	}
	
	@ModelAttribute("habits")
	private List<HabitDto> getHabits(){
		return habitService.getAllHabits();
	}
}
