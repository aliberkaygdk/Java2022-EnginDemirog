import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.categoryData.JdbcCategoryDao;
import dataAccess.courseData.HibernateCourseDao;
import dataAccess.instructorData.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course = new Course(1, "Java+React", 425);
		Course course1 = new Course(2, "Python", 250);

		List<Course> courses = new ArrayList<Course>();

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(course);
		courseManager.add(course1);

		System.out.println("");
		System.out.println("");

		Category category = new Category(1, "programlama");
		Category category1 = new Category(1, "kodlama");

		List<Category> categories = new ArrayList<Category>();

		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		categoryManager.add(category);
		categoryManager.add(category1);

		System.out.println("");
		System.out.println("");

		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");

		List<Instructor> instructors = new ArrayList<Instructor>();

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers, instructors);
		instructorManager.add(instructor);
		instructorManager.add(instructor1);

	}

}
