/****************************************************************************
 * @author Josaphat Mayuba Ndele	et Andres Garcia Cotton					*					*
 * Les programmes permet a faire de dessin de forme rectanglulaire et 		*
 * les ellipses	on peut l'enregistre et ouvrir le meme fichier.				*											*
 * 																			*
 ****************************************************************************/

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DessinFrame application = new DessinFrame("paint drawing");
				application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				application.setSize(800, 600);
				application.setVisible(true);

			}
		});
	}
}
