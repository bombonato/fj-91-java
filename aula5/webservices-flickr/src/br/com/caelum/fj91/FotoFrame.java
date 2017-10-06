package br.com.caelum.fj91;

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FotoFrame {

	private JFrame frame;
	private int currentPhoto = 0;
	private List<Photo> photos;
	private Component lastComponentAdded;

	public FotoFrame(List<Photo> photos) throws MalformedURLException {
		this.photos = photos;
		this.frame = new JFrame("Imagens");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(new TrocarFotoMouseListener(this));
		loadPhoto();
	}

	public void nextPhoto() {
		currentPhoto++;
		if (currentPhoto >= photos.size()) {
			currentPhoto = 0;
		}
		loadPhoto();
	}

	public void previousPhoto() {
		currentPhoto--;
		if (currentPhoto < 0) {
			currentPhoto = photos.size() - 1;
		}
		loadPhoto();
	}

	private void loadPhoto() {
		try {
			String imagem;
			imagem = photos.get(currentPhoto).toURL();
			System.out.println(imagem);

			if (lastComponentAdded != null) {
				frame.remove(lastComponentAdded);
			}
			final ImageIcon icon = new ImageIcon(new URL(imagem));
			final JLabel label = new JLabel(icon);
			lastComponentAdded = frame.add(label);
			frame.pack();
			frame.setVisible(true);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public int getWidth() {
		return this.frame.getWidth();
	}

}
