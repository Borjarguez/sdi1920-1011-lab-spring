package com.uniovi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniovi.entities.Teacher;
import com.uniovi.services.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherService teacherService;

	@RequestMapping("/teacher/list")
	public String getList() {
		return teacherService.getTeachers().toString();
	}

	@RequestMapping("/teacher/add")
	public String setTeacher() {
//		teacherService.addTeacher(teacher);
		return "Ok";
	}

	@RequestMapping("/teacher/details/{id}")
	public String getDetail(@PathVariable Long id) {
		return teacherService.getTeacher(id).toString();
	}
	
	@RequestMapping("teacher/edit/{id}")
	public String editTeacher(@ModelAttribute Teacher t) {
		if(t.getId()!= null) {
			teacherService.getTeacher(t.getId()).setName(t.getName());
			teacherService.getTeacher(t.getId()).setName(t.getSurnames());
			teacherService.getTeacher(t.getId()).setName(t.getCategory());
			return "modified";
		}
		
		return "error";
	}
	
	@RequestMapping("/teacher/delete/{id}")
	public String deleteTeacher(@PathVariable Long id) {
		teacherService.deleteTeacher(id);
		return "Ok";
	}
}
