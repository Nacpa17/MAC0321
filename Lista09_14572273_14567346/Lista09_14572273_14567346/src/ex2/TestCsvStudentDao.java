package ex2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class TestCsvStudentDao {

	@Test
	public void testGetAll() {
		CsvStudentDao db = new CsvStudentDao();
		
		assertEquals(new Student("Robert", 0), db.getAllStudents().get(0));
		assertEquals(new Student("John", 1), db.getAllStudents().get(1));
	}
	
	@Test
	public void testGet() {
		CsvStudentDao db = new CsvStudentDao();
		
		assertEquals(new Student("Robert", 0), db.getStudent(0));
		assertEquals(new Student("John", 1), db.getStudent(1));
	}
	
	@Test
	public void testDelete() {
		CsvStudentDao db = new CsvStudentDao();
		
		db.deleteStudent(new Student("Robert", 0));
		
		assertEquals(new Student("John", 1), db.getAllStudents().get(0));
		assertEquals(1, db.getAllStudents().size());
	}
	
	@Test
	public void testUpdate() {
		CsvStudentDao db = new CsvStudentDao();
		
		db.updateStudent(new Student("Shrek", 0));

		assertEquals(new Student("Shrek", 0), db.getStudent(0));
		assertEquals(new Student("John", 1), db.getStudent(1));
	}
}

