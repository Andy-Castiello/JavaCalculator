package Gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Gui.Display.Display;
import Gui.Keyboard.Keyboard;

public class Frame extends JFrame {

	private JPanel mainPanel;

	private Display displayPanel;

	private Keyboard keyboardPanel;

	public Frame() {

		ThemeColor.setMainColor(new Color(27,98,179));
		ThemeColor.setTheme(ThemeColor.DARK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(300, 500);

		this.mainPanel = new JPanel(null);
		this.mainPanel.setBackground(ThemeColor.getBgColor());

		this.displayPanel = new Display();

		this.keyboardPanel = new Keyboard(this.displayPanel);

		this.mainPanel.add(displayPanel);
		this.mainPanel.add(keyboardPanel);

		this.add(mainPanel);

	}

}
