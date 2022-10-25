package business;

import java.util.List;

import dataAccess.courseData.CourseDao;
import entities.Course;
import logging.Logger;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		for (Course crs : courses) {
			if (crs.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs ismi tekrar edemez");
			}

		}
		if (course.getCoursePrice() <= 0) {
			throw new Exception("Kurs fiyatı sıfırdan yüksek olmalıdır");
		}

		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());

		}

	}
}
