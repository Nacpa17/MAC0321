package ex3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Random;


/*
 * Vemos pelas APIs das classes que o OutputStream é mais adequado para se escrever dados
 * que não são necessáriamente texto, tendo função para escrever um array de bytes diretamente,
 * enquanto que o PrintWrter é mais adequado para escrever texto em um arquivo, tendo funções como
 * print e println.
 * 
 * Podemos ver executando o código que o OutputStream é muito mais rápido que o PrintWriter para fazer
 * a escrita do vetor de bytes. Isso deve-se a diferente implementação de cada um. O  PrintWriter implementa a
 * classe abstrada Writer, sendo mais optimizado para texto, e ouputStream mais optimizado para dados binarios
 */
public class Compare {
	static PrintWriter pw;
	static OutputStream os;
	
	public static void main(String[] args) throws IOException {
		pw = new PrintWriter("ps");
		os = new FileOutputStream("os");

		byte[] bytes = new byte[500000];
		char[] chars = new char[500000];

		Random rng = new Random();
		rng.nextBytes(bytes);
		
		int i = 0;
		for  (byte b : bytes ) {
			chars[i++] = (char)b;
		}

		long start = System.currentTimeMillis();
		
		pw.write(chars);
		
		long pwTime = System.currentTimeMillis() - start;
		start = System.currentTimeMillis();
		
		os.write(bytes);
		
		long osTime = System.currentTimeMillis() - start;
		
		System.out.printf("PrintWriter  took %dms while OutuputStream took %dms\n", pwTime, osTime);
	}
}
