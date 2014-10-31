package com.duskclouds.habit.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duskclouds.habit.persistence.domain.Habit;
import com.duskclouds.habit.persistence.repository.HabitRepository;
import com.duskclouds.habit.web.dto.HabitDto;

@Service
public class HabitServiceImpl implements HabitService {	
	
	private static final Logger LOG = LoggerFactory.getLogger(HabitServiceImpl.class);
	
	@Autowired
	private HabitRepository habitRepository;

	@Override
	public List<HabitDto> getAllHabits() {
		List<HabitDto> habits = new ArrayList<HabitDto>();
		for(Habit habit : habitRepository.findAll()) {
			HabitDto data = new HabitDto();
			data.setId(habit.getId());
			data.setName(habit.getName());
			data.setRepetition(habit.getRepetition());
			data.setTarget(habit.getTarget());
			LOG.debug(data.getName());
			habits.add(data);
			LOG.debug("Hehehehehe");
		}		
		LOG.debug("Huauahaahahahaha");
		return habits;
	}

}
