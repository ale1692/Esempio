package it.pattern.dao;

public class DaoPatternDemo {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDaoImpl();

		// print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println(student.toString());
		}

		// update student
		Student student = studentDao.getAllStudents().get(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// get the student
		studentDao.getStudent(0);
		System.out.println(student.toString());
	}

}
