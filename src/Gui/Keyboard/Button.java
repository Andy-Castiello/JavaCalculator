package Gui.Keyboard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Button extends JLabel{
	
	private int radius;
	
	public Button(String text, Color bgColor,Color fgColor) {
		
		this.radius = 20;
		this.setBackground(bgColor);
		this.setOpaque(false);
		this.setText(text);
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Arial", Font.BOLD, 20));
		this.setForeground(fgColor);
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				e.getComponent().setBackground(bgColor.brighter());
			}
			@Override
				public void mouseReleased(MouseEvent e) {
				
				e.getComponent().setBackground(bgColor);
			}
		});
	}
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Background color
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        g2d.dispose();
        super.paintComponent(g);
    }
  };
	


