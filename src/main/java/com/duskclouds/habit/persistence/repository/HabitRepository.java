package com.duskclouds.habit.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.duskclouds.habit.persistence.domain.Habit;

public interface HabitRepository extends CrudRepository<Habit, Long> {

}
