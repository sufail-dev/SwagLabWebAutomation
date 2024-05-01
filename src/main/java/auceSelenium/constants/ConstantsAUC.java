package auceSelenium.constants;

public final class ConstantsAUC {
	
	private static final String CHROMEDRIVER=System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver-win.exe";

	public static String getChromedriver() {
		return CHROMEDRIVER;
	}

}
