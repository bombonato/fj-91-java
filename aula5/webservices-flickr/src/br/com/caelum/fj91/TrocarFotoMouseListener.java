package br.com.caelum.fj91;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class TrocarFotoMouseListener implements MouseListener {

		private final FotoFrame frame;

		public TrocarFotoMouseListener(FotoFrame frame) {
			this.frame = frame;
		}

		public void mouseReleased(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			double porcento = (e.getX()*1.0)/frame.getWidth();
			if(porcento>0.5){
				frame.nextPhoto();
			}else{
				frame.previousPhoto();
			}
			
		}
	}