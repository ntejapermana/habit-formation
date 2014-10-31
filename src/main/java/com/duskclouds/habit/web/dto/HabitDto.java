package com.duskclouds.habit.web.dto;

public class HabitDto {
	
	private Long id;
	private int repetition;
	private int target;
	private String name;
	private int enabled;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getRepetition() {
		return repetition;
	}
	public void setRepetition(int repetition) {
		this.repetition = repetition;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	
	
}
