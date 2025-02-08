package Gui.Keyboard;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Gui.ThemeColor;
import Gui.Display.Display;

public class Keyboard extends JPanel {

	private GridBagConstraints gbc;
	private NumberButton[] numberButtonsArray;

	public Keyboard(Display display) {

		this.gbc = new GridBagConstraints();

		this.setLayout(new GridBagLayout());
		this.setOpaque(false);
		this.setBounds(0, 170, 300, 300);
		this.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));

		this.gbc.weightx = 1;
		this.gbc.weighty = 1;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.gbc.insets = new Insets(5, 5, 5, 5);

		this.createNumberButtons(display);
		this.gbc.gridwidth = 1;
		this.gbc.gridheight = 1;

		Button dot = new Button(".", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		this.gbc.gridx = 2;
		this.gbc.gridy = 4;
		this.add(dot, this.gbc);

		ClearButton clearButton = new ClearButton(display);
		this.gbc.gridx = 0;
		this.gbc.gridy = 0;
		this.add(clearButton, this.gbc);

		BackspaceButton backSpace = new BackspaceButton(display);
		this.gbc.gridx = 1;
		this.gbc.gridy = 0;
		this.add(backSpace, this.gbc);

		MathOperatorButton dividedBy = new MathOperatorButton("/", display);
		this.gbc.gridx = 2;
		this.gbc.gridy = 0;
		this.add(dividedBy, this.gbc);

		MathOperatorButton times = new MathOperatorButton("x", display);
		this.gbc.gridx = 3;
		this.gbc.gridy = 0;
		this.add(times, this.gbc);

		MathOperatorButton minus = new MathOperatorButton("-", display);
		this.gbc.gridx = 3;
		this.gbc.gridy = 1;
		this.add(minus, this.gbc);

		MathOperatorButton plus = new MathOperatorButton("+", display);
		this.gbc.gridx = 3;
		this.gbc.gridy = 2;
		this.add(plus, this.gbc);

		EqualButton equal = new EqualButton(display);
		this.gbc.gridx = 3;
		this.gbc.gridy = 3;
		this.gbc.gridheight = 2;
		this.add(equal, this.gbc);

	}

	private void createNumberButtons(Display display) {

		this.numberButtonsArray = new NumberButton[10];
		for (short i = 0; i < 10; ++i) {

			this.numberButtonsArray[i] = new NumberButton(Short.toString(i), display);
		}

		short k = 0;
		short j = 3;
		for (short i = 1; i < 10; i++) {

			this.gbc.gridx = k;
			this.gbc.gridy = j;

			this.add(this.numberButtonsArray[i], this.gbc);

			if (k == 2) {

				j--;
				k = 0;
			} else {

				k++;
			}
		}
		this.gbc.gridx = 0;
		this.gbc.gridy = 4;
		this.gbc.gridwidth = 2;
		this.gbc.gridheight = 1;

		this.add(numberButtonsArray[0], this.gbc);
	}
}
