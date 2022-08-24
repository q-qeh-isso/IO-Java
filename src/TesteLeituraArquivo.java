import java.io.*;
import java.util.Scanner;

public class TesteLeituraArquivo {
	
	public static void main(String[] args) {
		
		/*try (InputStream in = new FileInputStream("teste.txt");
			//InputStream in = System.in; // do teclado e mostra oq foi digitado (eco)
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);)
			{
			
			//utilizando InputStream
			//int byteLido = in.read(); //le o primeiro byte
			while(byteLido != -1){ //le todos os bytes até nao encontrar mais que resulta -1
				System.out.print( (char) byteLido); //converte cada byte em char
				byteLido = in.read();
			}
			
			//utilizando BufferedStream
			String linha = br.readLine();
			do {
				System.out.println(linha);
				linha = br.readLine();
			} while(linha != null);
			
		} catch (IOException e) {
			//System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}*/
		
		try(Scanner scan = new Scanner(new FileInputStream("teste.txt"));){		
			while(scan.hasNextLine()){
				System.out.println(scan.nextLine());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
