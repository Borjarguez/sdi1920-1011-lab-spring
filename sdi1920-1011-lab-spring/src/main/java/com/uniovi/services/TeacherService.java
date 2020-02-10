package com.uniovi.services;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.uniovi.entities.Teacher;

@Service
public class TeacherService {

	private List<Teacher> teachersList = new LinkedList<Teacher>();

	@PostConstruct
	public void init() {
		teachersList.add(new Teacher(1L, "pepe", "prueba", "prueba", "t"));
	}

	public List<Teacher> getTeachers() {
		return teachersList;
	}

	public Teacher getTeacher(Long id) {
		return teachersList.parallelStream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTeacher(Teacher t) {
		if (t.getId() == null) {
			t.setId(teachersList.get(teachersList.size() - 1).getId() + 1);
		}
		teachersList.add(t);
	}

	public void deleteTeacher(Long id) {
		teachersList.removeIf(t -> t.getId().equals(id));
	}

}
