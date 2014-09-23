/**
 * Background constructor for Chess Game
 * Alisa and Saahiti
 * Final Summative
 * ICS3U - Mr. Marco
 * Jan 23rd 2013
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * class downloaded from the internet
 * paints background image on to panels
 */


public class ImagePanel extends JPanel {
	public static Image image = Toolkit.getDefaultToolkit().createImage(
			"src\\chessGlobe2.jpg");
	public static ImageIcon img;

	public ImagePanel() {
		super();
	}

	public ImagePanel(String image) {
		super();
	}

	public ImagePanel(LayoutManager layout) {
		super(layout);
	}

	public void paintComponent(Graphics g) {
		// /image = image.getScaledInstance(200, 200, Image.SCALE_FAST);
		img = new ImageIcon("src\\chessGlobe2.jpg");
		super.paintComponent(g);

		if (image != null)
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}