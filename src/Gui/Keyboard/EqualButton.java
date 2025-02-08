package Gui.Keyboard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Gui.ThemeColor;
import Gui.Display.Display;

public class EqualButton extends Button {

	public EqualButton(Display display) {

		super("=", ThemeColor.getMainColor().brighter(), ThemeColor.getFgColor());
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {

				if (display.getPrimaryText() != null && display.getPrimaryText().length() > 0
						&& display.getSecondaryText() != null && display.getSecondaryText().length() > 0) {

					String result = display.calculate();

					display.setSecondaryText(display.getSecondaryText() + " " + display.getPrimaryText());
					display.setPrimaryText(result);
				}
			}
		});
	}
}
