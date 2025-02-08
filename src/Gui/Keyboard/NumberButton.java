package Gui.Keyboard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Gui.ThemeColor;
import Gui.Display.Display;

public class NumberButton extends Button {

	public NumberButton(String text, Display display) {

		super(text, ThemeColor.getBgColor().brighter().brighter(), ThemeColor.getMainColor());
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {

				display.setPrimaryText(display.getPrimaryText() + text);
			}
		});
	}
}
