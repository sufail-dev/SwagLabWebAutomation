package auceSelenium.constants;

public final class ConstantsAUC {
	
	private static final String CHROMEDRIVER=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver-win.exe";
	private static final int EXPLICITWAIT=10;
	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}
	public static String getChromedriver() {
		return CHROMEDRIVER;
	}

}
