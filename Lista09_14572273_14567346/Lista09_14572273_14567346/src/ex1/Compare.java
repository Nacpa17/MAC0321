/*
 * Fazendo varios testes percebi que a velocidade varia muito com o tamanho do texto e vezes executados.
 * Em geral nos meus testes com  o arquivo atual, escrever no arquivo é mais rápido, diria que isso se deve
 * ao fato da escrita ocorrer por intermedio de um buffer, assim poucos acessos a API de hardware  para a escrita
 * do arquivo sao feitas. O arquivo é primeiro escrito na RAM em um buffer e depois salvo em memoria. A saída padrão
 * também salva na RAM, porem precisa exibir os valores salvos toda vez que é modificada, assim acaba sendo mais lenta.
 * 
 */

package ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.CharBuffer;
import java.util.ArrayList;

public class Compare {
	public static long[] compareOnce(String s) {
		FilePrinter fp = new FilePrinter();
		SystemOutPrinter sp = new SystemOutPrinter();

		long start = System.currentTimeMillis();
		
		fp.print(s);
		
		long fpTime = System.currentTimeMillis() - start;
		start = System.currentTimeMillis();
		
		sp.print(s);
		
		long stdOutTime = System.currentTimeMillis() - start;
		
		System.out.printf("\n==============================\nPrinting in file took %dms, while printing in stdout took %dms\n", fpTime, stdOutTime);
		
		return new long[] { fpTime, stdOutTime };
	}
	
	public static void main(String[] args) {
		
		try {
			BufferedReader r = new BufferedReader(new FileReader("src/ex1/veryImportantAndSecretText.txt"));
			char[] buf = new char[9000000];
			r.read(buf);
			String s = new String(buf);
			
			compareOnce(s);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
