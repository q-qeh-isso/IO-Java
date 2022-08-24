import java.io.*;

public class TesteEscritaArquivo {
	
	public static void main(String[] args) {
		
		/*try(OutputStream out = new FileOutputStream("saida.txt");
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);)
		{
			bw.write("Primeira Linha");
			bw.newLine();
			bw.write("Segunda Linha");
			bw.newLine();
			bw.write("Terceira Linha");
			bw.flush(); //confirmar escrita			
		} catch(Exception e){
			e.printStackTrace();
		}*/
		
		try(PrintWriter writer = 
				new PrintWriter(new FileOutputStream("saida2.txt")))
			{
				writer.println("Primeira Linha");
				writer.println("Segunda Linha");
				writer.println("Terceira Linha");
				writer.flush(); //confirmar escrita
			} catch(Exception e){
				e.printStackTrace();
			}
		
	}

}
