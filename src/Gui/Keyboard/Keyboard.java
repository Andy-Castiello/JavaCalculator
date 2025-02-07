package Gui.Keyboard;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import Gui.ThemeColor;

public class Keyboard extends JPanel {

	public Keyboard() {

		GridBagConstraints gbc = new GridBagConstraints();

		this.setLayout(new GridBagLayout());
		this.setOpaque(false);
		this.setBounds(0, 170, 300, 300);
		this.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));

		Button clearButton = new Button("C", ThemeColor.getBgColor().brighter().brighter().brighter().brighter(), ThemeColor.getFgColor());
		Button backSpace = new Button("<", ThemeColor.getBgColor().brighter().brighter().brighter().brighter(), ThemeColor.getFgColor());

		Button dividedBy = new Button("/",  ThemeColor.getMainColor(), ThemeColor.getFgColor());
		Button times = new Button("x",  ThemeColor.getMainColor(), ThemeColor.getFgColor());
		Button minus = new Button("-",  ThemeColor.getMainColor(), ThemeColor.getFgColor());
		Button plus = new Button("+",  ThemeColor.getMainColor(), ThemeColor.getFgColor());
		
		Button equal = new Button("=",  ThemeColor.getMainColor().brighter(), ThemeColor.getFgColor());
		
		Button zero = new Button("0", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button one = new Button("1", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button two = new Button("2", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button three = new Button("3", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button four = new Button("4", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button five = new Button("5", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button six = new Button("6", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button seven = new Button("7", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button eight = new Button("8", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		Button nine = new Button("9", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());

		Button dot = new Button(".", ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);

		gbc.gridx = 0;
		gbc.gridy = 0;
		add(clearButton, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		add(backSpace, gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		add(dividedBy, gbc);

		gbc.gridx = 3;
		gbc.gridy = 0;

		add(times, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;

		add(nine, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;

		add(eight, gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;

		add(seven, gbc);

		gbc.gridx = 3;
		gbc.gridy = 1;

		add(minus, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;

		add(four, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;

		add(five, gbc);

		gbc.gridx = 2;
		gbc.gridy = 2;

		add(six, gbc);

		gbc.gridx = 3;
		gbc.gridy = 2;

		add(plus, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;

		add(one, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;

		add(two, gbc);

		gbc.gridx = 2;
		gbc.gridy = 3;

		add(three, gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;

		add(dot, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;

		add(zero, gbc);

		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 2;

		add(equal, gbc);
	}
}
