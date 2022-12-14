import junit.framework.TestCase;

public class FormularTest extends TestCase {
	public void testAreaTriangle() {
		try {
			FormularUtil.getAreaByHeronFormula(4, 2, 1);
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Input value is not edge of triangle.");
		}
		assertEquals(FormularUtil.getAreaByHeronFormula(10, 16.4, 17.7), 80.81);
	}

	public void testCaptchaCreate() {
		try {
			System.out.println(FormularUtil.captchaCreate(3));
			System.out.println(FormularUtil.captchaCreate(9));
		} catch (Exception e) {
			assertEquals(e.getMessage(), "Error");
		}
	}
}
