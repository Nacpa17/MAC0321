package ex2;

import static org.junit.Assert.*;

import javax.swing.*;
import java.lang.reflect.Field; 
import org.junit.jupiter.api.*;

import ex1.FatorialInterface;

public class TestFatorialWindow {
	static JFrame frame;
	static JTextField textField;
	static JButton button;
	static JLabel resultLabel;
	
	@BeforeAll
	public static void setup() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		frame = new FatorialInterface();
		frame.setVisible(true);
		
		Field textFieldField = FatorialInterface.class.getDeclaredField("textField");
		Field buttonField = FatorialInterface.class.getDeclaredField("button");
		Field resultLabelField = FatorialInterface.class.getDeclaredField("resultLabel");
		
		textFieldField.setAccessible(true);
		buttonField.setAccessible(true);
		resultLabelField.setAccessible(true);
		
		textField = (JTextField)textFieldField.get(frame);
		button = (JButton)buttonField.get(frame);
		resultLabel = (JLabel)resultLabelField.get(frame);
	}
	
	@AfterAll
	public static void cleanUp() {
		frame.setVisible(false);
	}
	
	@Test
	public void test5Fat() throws InterruptedException {
		textField.setText("5");
		button.doClick();
		Thread.sleep(1000);
		
		assertEquals("O fatorial de 5 é: 120", resultLabel.getText());
	}
	
	@Test
	public void testNegative() throws InterruptedException {
		textField.setText("-5");
		button.doClick();
		Thread.sleep(1000);
		
		assertEquals("O número deve ser não negativo.", resultLabel.getText());
	}
	
	@Test
	public void testInvalid() throws InterruptedException {
		textField.setText("asdasd");
		button.doClick();
		Thread.sleep(1000);
		
		assertEquals("Por favor, insira um número inteiro válido.", resultLabel.getText());
	}
	
	
}
