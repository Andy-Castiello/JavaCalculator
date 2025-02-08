package Gui.Keyboard;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Gui.ThemeColor;
import Gui.Display.Display;

public class BackspaceButton extends Button {

	public BackspaceButton(Display display) {

		super("<", ThemeColor.getBgColor().brighter().brighter().brighter().brighter(), ThemeColor.getFgColor());
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent e) {

				String currentText = display.getPrimaryText();

				if (currentText != null && currentText.length() > 0) {

					display.setPrimaryText(currentText.substring(0, currentText.length() - 1));
				}

			}
		});
	}
}