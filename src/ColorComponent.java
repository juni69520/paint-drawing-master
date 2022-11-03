import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

/**
 * 
 * @param ColorComponent
 *            Pallette de couleur
 */

class ColorComponent extends JComponent {
	private Color c;
	private Rectangle2D rect;

	public ColorComponent(Color c) {
		super();
		this.c = c;
		this.rect = new Rectangle2D.Double(5, 5, 15, 15);
		this.setPreferredSize(new Dimension(20, 20));
		this.setMaximumSize(new Dimension(25, 25));
	}

    @Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(c);
		g2.fill(rect);

	}

	public Color getColor() {
		return c;
	}

	public void setColor(Color c) {
		this.c = c;
		repaint();
	}
}