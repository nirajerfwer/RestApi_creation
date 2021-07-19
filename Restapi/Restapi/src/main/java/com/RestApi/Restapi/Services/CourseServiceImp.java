package com.RestApi.Restapi.Services;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.RestApi.Restapi.Entities.Course;
@Service
public class CourseServiceImp implements CourseService {
       List<Course> list ; 
	CourseServiceImp() {
		list = new ArrayList<>();
		list.add(new Course(1111, "delhi", "jaipur", "chamicals", "canter",
				1, 100, "delhi to jaipur truck","12-12-2020"));
		list.add(new Course(1112, "mumbai", "UP", "population", "trian",
				1,100000, "mumbai to up poplation","12-12-2020"));
		//list.add(new Course(1223,"testing2","testing 2 this is part wrking "));
	} 
	@Override
	public List<Course> GetCourses(){
		
		return list;
	}
	@Override
	public Course getCourseonly(long CourseID) {
		Course c = null;
		for(Course course: list) {
			if(course.getShipperId() == CourseID){
				c = course;
				break;
				}
		}
			
		return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public Course Updatecourse(Course Updatecourse) {
		
		for (Course course:list) {
			if (Updatecourse.getShipperId() == course.getShipperId() ) {
				course.setLoadingPoing(Updatecourse.getLoadingPoing());
				course.setUnloadingPoing(Updatecourse.getUnloadingPoing());
				course.setProductType(Updatecourse.getProductType());
				course.setNoOfTrucks(Updatecourse.getNoOfTrucks());
				course.setWeight(Updatecourse.getWeight());
				course.setComment(Updatecourse.getComment());
			}
		}
		return Updatecourse;
	}
	@Override
	public void delectCourse(long CourseID) {
		
	 list = list.stream().filter(d -> d.getShipperId() != CourseID).collect(Collectors.toList());
		
	}
	
	
	

}
