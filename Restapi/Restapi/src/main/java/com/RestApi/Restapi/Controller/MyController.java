package com.RestApi.Restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.Restapi.Entities.Course;
import com.RestApi.Restapi.Services.CourseService;



@RestController
public class MyController {
	@Autowired
	public CourseService courseService; 
 
	@GetMapping("/home")
	public String home() {
		return "testing home";
	}
	@GetMapping("/load")
	public List<Course> GetCourse(){
		return this.courseService.GetCourses();
	}
	@GetMapping("/load/{loadID}")
	public Course GetCourseonly(@PathVariable String loadID) {
		return this.courseService.getCourseonly(Long.parseLong(loadID));
	}
	@PostMapping("/load")
	public String addCourse(@RequestBody Course course)
	{
	try {
	   this.courseService.addCourse(course);
	   return "Successfully add to list";
	}
	catch(Exception e)
	{
		
		return "can't add"+new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
	@PutMapping("/load")
	public String UpdateCourse(@RequestBody Course course) {
		this.courseService.Updatecourse(course);
		return "updated success fully";
		
	}
	@DeleteMapping("/load/{loadID}")
	public String Deletcourse(@PathVariable String loadID) {
		this.courseService.delectCourse(Long.parseLong(loadID));
		return "deleted";
	}
}
