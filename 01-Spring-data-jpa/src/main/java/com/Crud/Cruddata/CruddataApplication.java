package com.Crud.Cruddata;

import com.Crud.Cruddata.DAO.StudentDAO;
import com.Crud.Cruddata.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddataApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createstudent(studentDAO);

//			createmultiplestudents(studentDAO);

//			readstudent(studentDAO);

//			readById(studentDAO);

//			readallstudents(studentDAO);

//			readStudentByLastName(studentDAO);

//			updateStudentById(studentDAO);

//			deleteById(studentDAO);

//			readallstudents(studentDAO);
			deleteAll(studentDAO);
		};
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Deleting all rows...");
		System.out.println(studentDAO.DeleteAll() + "Students Deleted...");
	}

	private void deleteById(StudentDAO studentDAO) {
		System.out.println("Deleting student...");
		studentDAO.DeleteByid(3);
		System.out.println("Deleted...");
	}

	private void readById(StudentDAO studentDAO) {
		Student mystud = studentDAO.findbyid(1);
		System.out.println(mystud);
	}

	private void updateStudentById(StudentDAO studentDAO) {
		int StudentId = 1;
		System.out.println("Getting student by student id: " + StudentId );
		Student mystudent = studentDAO.findbyid(StudentId);

		System.out.println("Updating the student...");
		mystudent.setFirstName("Gane");
		System.out.println("first name updated");
		studentDAO.updateStudent(mystudent);

		System.out.println(mystudent);
	}

	private void readStudentByLastName(StudentDAO studentDAO) {
		List<Student> result = studentDAO.findByLastName("Ragolu");
		for(Student res : result){
			System.out.println(res);
		}
	}

	private void readallstudents(StudentDAO studentDAO) {
		List<Student> result = studentDAO.findAll();
		for(Student res : result){
			System.out.println(res);
		}
	}

	private void readstudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("Student object created");
		Student tempstudent = new Student("praveen","nooli","praveen@gmail.com");

		//save student object
		studentDAO.save(tempstudent);
		System.out.println("Student was saved");
		//display student id
		System.out.println("The student id that saved is : " + tempstudent.getId());
		//read student data
		Student studentobj = studentDAO.findbyid(tempstudent.getId());
		System.out.println("Student object is found : " + studentobj);
	}

	private void createmultiplestudents(StudentDAO studentDAO) {
		System.out.println("Creating student objects");
		System.out.println("Creating student objects");
		Student mystudent1 = new Student("raju","mohan","mohan@gmail.com");
		Student mystudent2 = new Student("ravi","krishna","krishna@gmail.com");
		Student mystudent3 = new Student("sankar","sri","sri@gmail.com");
		studentDAO.save(mystudent1);
		studentDAO.save(mystudent2);
		studentDAO.save(mystudent3);

	}

	public void createstudent(StudentDAO studentDAO){
		//create the student object
		System.out.println(" Creating the student object");
		Student mystudent = new Student("Vamsi","Ragolu","vamsi@gmail.com");
		System.out.println(" Created the student object");
		//save the student object
		System.out.println("Saving the student object");
		studentDAO.save(mystudent);
		System.out.println("Saved the student object");
		//display the student id
		System.out.println("The saved student id is: " + mystudent.getId());

	}

}
