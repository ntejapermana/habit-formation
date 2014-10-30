package com.duskclouds.habit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.duskclouds.habit.persistence.repository.HabitRepository;

public class HabitServiceImpl implements HabitService {	
	
	@Autowired
	private HabitRepository habitRepository;

}
