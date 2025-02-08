package Gui.Display;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Gui.ThemeColor;

public class Display extends JPanel {

	private JLabel secondaryDisplay;
	private JLabel primaryDisplay;

	public Display() {

		this.secondaryDisplay = new JLabel();
		this.primaryDisplay = new JLabel();

		this.secondaryDisplay.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
		this.secondaryDisplay.setText("");
		this.secondaryDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		this.secondaryDisplay.setFont(new Font("Arial", Font.BOLD, 20));
		this.secondaryDisplay.setForeground(ThemeColor.getFgColor());

		this.primaryDisplay.setText("");
		this.primaryDisplay.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
		this.primaryDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		this.primaryDisplay.setFont(new Font("Arial", Font.BOLD, 40));
		this.primaryDisplay.setForeground(ThemeColor.getFgColor());

		this.setLayout(new GridLayout(2, 1, 0, 0));
		this.setBounds(0, 0, 300, 170);
		this.setOpaque(false);

		this.add(this.secondaryDisplay);
		this.add(this.primaryDisplay);
	}

	public void setPrimaryText(String text) {

		this.primaryDisplay.setText(text);
	}

	public String getPrimaryText() {

		return this.primaryDisplay.getText();
	}

	public void setSecondaryText(String text) {

		this.secondaryDisplay.setText(text);
	}

	public String getSecondaryText() {

		return this.secondaryDisplay.getText();
	}

	public String calculate() {

		String[] text = this.secondaryDisplay.getText().split(" ");

		double value1 = Double.parseDouble(text[0]);
		double value2 = Double.parseDouble(this.getPrimaryText());

		double result;

		switch (text[1]) {
		case "/": {

			result = value1 / value2;
			break;
		}
		case "x": {
			result = value1 * value2;
			break;
		}
		case "-": {
			result = value1 - value2;
			break;
		}
		case "+": {
			result = value1 + value2;
			break;
		}
		default:
			System.out.print(getFocusTraversalKeysEnabled());
			throw new IllegalArgumentException("Unexpected value: " + text[1]);
		}
		return String.valueOf(result);

	}
}
