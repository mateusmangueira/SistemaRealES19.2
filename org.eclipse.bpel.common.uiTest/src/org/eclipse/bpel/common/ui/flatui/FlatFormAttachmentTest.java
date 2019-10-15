package org.eclipse.bpel.common.ui.flatui;

import org.eclipse.bpel.common.ui.calendar.DatePicker;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FlatFormAttachmentTest</code> contains tests for the class <code>{@link FlatFormAttachment}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:28
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FlatFormAttachmentTest {
	/**
	 * Run the FlatFormAttachment() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_1()
		throws Exception {

		FlatFormAttachment result = new FlatFormAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment(Control) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_2()
		throws Exception {
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));

		FlatFormAttachment result = new FlatFormAttachment(control);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_3()
		throws Exception {
		int numerator = 1;
		int offset = 1;

		FlatFormAttachment result = new FlatFormAttachment(numerator, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (1/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment(Control,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_4()
		throws Exception {
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		int offset = 1;

		FlatFormAttachment result = new FlatFormAttachment(control, offset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_5()
		throws Exception {
		int numerator = 1;
		int denominator = 0;
		int offset = 1;

		FlatFormAttachment result = new FlatFormAttachment(numerator, denominator, offset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be zero
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.bpel.common.ui.flatui.FlatFormAttachment.<init>(FlatFormAttachment.java:80)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment(int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_6()
		throws Exception {
		int numerator = 1;
		int denominator = 1;
		int offset = 1;

		FlatFormAttachment result = new FlatFormAttachment(numerator, denominator, offset);

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (1/1)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment(Control,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormAttachment_7()
		throws Exception {
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		int offset = 1;
		int alignment = 1;

		FlatFormAttachment result = new FlatFormAttachment(control, offset, alignment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment divide(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testDivide_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int value = 1;

		FlatFormAttachment result = fixture.divide(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the int gcd(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGcd_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int m = 1;
		int n = 1;

		int result = fixture.gcd(m, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertEquals(0, result);
	}

	/**
	 * Run the int gcd(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGcd_2()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int m = 1;
		int n = 1;

		int result = fixture.gcd(m, n);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertEquals(0, result);
	}

	/**
	 * Run the FlatFormAttachment minus(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testMinus_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int value = 1;

		FlatFormAttachment result = fixture.minus(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment minus(FlatFormAttachment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testMinus_2()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		FlatFormAttachment attachment = new FlatFormAttachment(1, 1, 1);

		FlatFormAttachment result = fixture.minus(attachment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment plus(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testPlus_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int value = 1;

		FlatFormAttachment result = fixture.plus(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the FlatFormAttachment plus(FlatFormAttachment) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testPlus_2()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		FlatFormAttachment attachment = new FlatFormAttachment(1, 1, 1);

		FlatFormAttachment result = fixture.plus(attachment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the int solveX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testSolveX_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 0;
		fixture.numerator = 1;
		int value = 1;

		int result = fixture.solveX(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertEquals(0, result);
	}

	/**
	 * Run the int solveX(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testSolveX_2()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int value = 1;

		int result = fixture.solveX(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertEquals(0, result);
	}

	/**
	 * Run the int solveY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testSolveY_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 0;
		int value = 1;

		int result = fixture.solveY(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertEquals(0, result);
	}

	/**
	 * Run the int solveY(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testSolveY_2()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;
		int value = 1;

		int result = fixture.solveY(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertEquals(0, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), -1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;

		String result = fixture.toString();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testToString_2()
		throws Exception {
		FlatFormAttachment fixture = new FlatFormAttachment((Control) null, 1, 1);
		fixture.denominator = 1;
		fixture.numerator = 1;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("y = (1/1)x + 1", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FlatFormAttachmentTest.class);
	}
}