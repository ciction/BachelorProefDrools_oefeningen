package com.sample;

public class Course {
	private String name;
	private int day;
	
	private String requiredCourse = null;
	private int requiredCourseCount = 0;

	
	
	public Course(String name, int day) {
		super();
		this.name = name;
		this.day = day;
	}
	
	public Course(String name, int day, String requiredCourse, int requiredCourseCount) {
		super();
		this.name = name;
		this.day = day;
		this.requiredCourse = requiredCourse;
		this.requiredCourseCount = requiredCourseCount;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getRequiredCourse() {
		return requiredCourse;
	}
	public void setRequiredCourse(String requiredCourse) {
		this.requiredCourse = requiredCourse;
	}



	public int getRequiredCourseCount() {
		return requiredCourseCount;
	}



	public void setRequiredCourseCount(int requiredCourseCount) {
		this.requiredCourseCount = requiredCourseCount;
	}
	
	
	
	
}
