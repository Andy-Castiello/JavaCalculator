package Gui;

import java.awt.Color;

public class ThemeColor {
	public static int getTheme() {
		return theme;
	}

	public static void setTheme(int theme) {
		if (theme == ThemeColor.LIGHT) {

			ThemeColor.theme = ThemeColor.LIGHT;
			ThemeColor.bgColor = new Color(220, 220, 220);
			ThemeColor.fgColor = new Color(20, 20, 20);
			
		} else {

			ThemeColor.theme = ThemeColor.DARK;
			ThemeColor.bgColor = new Color(20, 20, 20);
			ThemeColor.fgColor = new Color(220, 220, 220);		}
	}

	public static Color getBgColor() {
		return bgColor;
	}

	public static Color getFgColor() {
		return fgColor;
	}

	public static Color getMainColor() {
		return mainColor;
	}

	public static void setMainColor(Color mainColor) {
		ThemeColor.mainColor = mainColor;
	}


	public final static int DARK = 0;
	public final static int LIGHT = 1;

	private static int theme;
	private static Color mainColor;
	private static Color bgColor;
	private static Color fgColor;

}
