package ex2;

public class DaoPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();
		
		for (Student s : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo: " + s.getRollNo() + ", Name: " + s.getName() + " ]");
		}
		
		Student s = studentDao.getAllStudents().get(0);
		s.setName("Michael");
		studentDao.updateStudent(s);
		
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo: " + s.getRollNo() + ", Name: " + s.getName() + " ]");
	}
}
