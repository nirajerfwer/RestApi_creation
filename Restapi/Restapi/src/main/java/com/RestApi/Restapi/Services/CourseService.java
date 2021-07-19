package com.RestApi.Restapi.Services;
import java.util.List;

import com.RestApi.Restapi.Entities.Course;

public interface CourseService {
	public List<Course> GetCourses();
	public Course getCourseonly(long CourseID);
	public Course addCourse(Course course);
	public Course Updatecourse(Course UpdateCourse);
	public void delectCourse(long CourseID);

}


