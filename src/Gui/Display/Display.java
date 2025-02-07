package Gui.Display;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Gui.ThemeColor;

public class Display extends JPanel {

	private JLabel count;
	private JLabel result;

	public Display() {

		this.count = new JLabel();
		this.result = new JLabel();

		this.count.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
		this.count.setText("4535 x 45");
		this.count.setHorizontalAlignment(SwingConstants.RIGHT);
		this.count.setFont(new Font("Arial", Font.BOLD, 20));
		this.count.setForeground(ThemeColor.getFgColor());

		this.result.setText("204075");
		this.result.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
		this.result.setHorizontalAlignment(SwingConstants.RIGHT);
		this.result.setFont(new Font("Arial", Font.BOLD, 40));
		this.result.setForeground(ThemeColor.getFgColor());

		this.setLayout(new GridLayout(2, 1, 0, 0));
		this.setBounds(0, 0, 300, 170);
		this.setOpaque(false);

		this.add(this.count);
		this.add(this.result);
	}

}
