package ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student s1 = new Student("Robert", 0);
		Student s2 = new Student("John", 1);
		students.add(s1);
		students.add(s2);
	}
	
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());;
		System.out.println("Student: Roll No" + student.getRollNo() + ", updated in database");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: RollNo " + student.getRollNo() +
				", deleted from database");
	}
	
}
