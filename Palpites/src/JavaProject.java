import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class JavaProject {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome = JOptionPane.showInputDialog("Digite o nome do usuário");
		String entrada = JOptionPane.showInputDialog("Digite seu palpite " + nome + "... (entre 1 e 6) ");
		int palpite = Integer.parseInt(entrada);

		Random r = new Random();
		int i = r.nextInt(6);

		if (palpite == i) {
			JOptionPane.showMessageDialog(null,
					"Acertou " +nome + "! seu palpite foi " + palpite + "\n e nesta jogada o dado caiu mesmo na face " + i);
		} else {
			JOptionPane.showMessageDialog(null, "Errou " +nome + "! seu palpite foi " + palpite + "\n na verdade o dado caiu na face " + i);
		}
	}
}