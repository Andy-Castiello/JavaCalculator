package Gui.Keyboard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Gui.ThemeColor;
import Gui.Display.Display;

public class MathOperatorButton extends Button {

	public MathOperatorButton(String text, Display display) {

		super(text, ThemeColor.getMainColor(), ThemeColor.getFgColor());

		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {

				if (display.getPrimaryText() != null && display.getPrimaryText().length() > 0) {

					display.setSecondaryText(display.getPrimaryText() + " " + text);
					display.setPrimaryText("");
				}
			}
		});
	}
}
