package Gui.Keyboard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Gui.ThemeColor;
import Gui.Display.Display;

public class ClearButton extends Button {

	public ClearButton(Display display) {

		super("C", ThemeColor.getBgColor().brighter().brighter().brighter().brighter(), ThemeColor.getFgColor());
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {

				display.setPrimaryText("");
				display.setSecondaryText("");
			}
		});
	}
}
