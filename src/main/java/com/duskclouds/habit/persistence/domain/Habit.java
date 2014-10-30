package com.duskclouds.habit.persistence.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Habit implements Serializable{
	
	private static final long serialVersionUID = -1737679078165493729L;
	
	@Id
	@GeneratedValue
	private Long id;
	private int repetition;
	private int target;
	private String name;
	private int enabled = 0;
		
	protected Habit() {}
	
	public Habit(String name, int repetition, int target) {
		this.name = name;
		this.repetition = repetition;
		this.target = target;
	}

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

	public boolean getEnabled() {
		boolean enabled = this.enabled == 1 ? true : false;
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled ? 1 : 0;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	

}
