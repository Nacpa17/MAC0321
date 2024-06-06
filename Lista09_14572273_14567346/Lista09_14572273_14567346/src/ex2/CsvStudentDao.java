package ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvStudentDao implements StudentDao {

	List<Student> students = new ArrayList<Student>();
	
	public CsvStudentDao() {
		students = new ArrayList<Student>();
		Student s1 = new Student("Robert", 0);
		Student s2 = new Student("John", 1);
		students.add(s1);
		students.add(s2);
		
		writeData();
	}
	
	private void writeData() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("db.csv");
			for (Student s : students) {
				writer.println(s.getName() + "," + s.getRollNo());
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}
	
	@Override
	public List<Student> getAllStudents() {
		try {
			students.clear();
			BufferedReader read = new BufferedReader(new FileReader("db.csv"));
			String line = read.readLine();
			while (line != null) {
				 String[] entries = line.split(",");
				 students.add(new Student(entries[0], Integer.parseInt(entries[1])));
				 line = read.readLine();
			} 
			return students;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Student getStudent(int rollNo) {
		return getAllStudents().get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		getAllStudents();
		students.get(student.getRollNo()).setName(student.getName());
		writeData();
	}

	@Override
	public void deleteStudent(Student student) {
		getAllStudents();
		students.remove(student.getRollNo()).setName(student.getName());
		writeData();
	}

}
