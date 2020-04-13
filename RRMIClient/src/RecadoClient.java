import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;


public class RecadoClient {
	
	public static void main(String arg[]) {
		try {
			IMural mural = (IMural) Naming.lookup("//localhost:9999/ServidorAgenda");
			Recado recado1 = new Recado(1, "Qual a nota da minha V1?", "Alberto Parente");
			mural.registrarRecado(recado1);
			
			Recado recado2 = new Recado(2, "Nota 08", "Victor");
			mural.registrarRecado(recado2);
			mural.removerRecado(recado2);
			System.out.println(mural.removerRecado(recado2));
			
			Recado recado3 = new Recado(3, "Desculpe esqueci de colocar os pontos dos exercicios sua nota final é: 10", "Victor");
			mural.registrarRecado(recado3);
			
			
			List<Recado> recados = mural.consultarRecados();
			for(Recado cont: recados) {
				System.out.println(cont.getNome() + " " + cont.getTexto());
			}
		} catch(Exception e) {
			System.out.println("HelloClient exception: " + e.getMessage());
		}
	}
}
