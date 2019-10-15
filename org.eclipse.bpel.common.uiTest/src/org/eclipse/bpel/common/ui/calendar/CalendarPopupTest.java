package org.eclipse.bpel.common.ui.calendar;

import java.util.Date;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CalendarPopupTest</code> contains tests for the class <code>{@link CalendarPopup}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class CalendarPopupTest {
	/**
	 * Run the Date openCalendarPopup(Control,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenCalendarPopup_1()
		throws Exception {
		Control anchor = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		Date initialDate = new Date();

		Date result = CalendarPopup.openCalendarPopup(anchor, initialDate);

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
	 * Run the Date openCalendarPopup(Shell,Rectangle,int,Date) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenCalendarPopup_2()
		throws Exception {
		Shell shell = new Shell();
		Rectangle absoluteBounds = new Rectangle(1, 1, 1, 1);
		int borderWidth = 1;
		Date initialDate = new Date();

		Date result = CalendarPopup.openCalendarPopup(shell, absoluteBounds, borderWidth, initialDate);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Invalid thread access
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:286)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:277)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:226)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the Date openCalendarPopup(Shell,Rectangle,int,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenCalendarPopup_3()
		throws Exception {
		Shell shell = new Shell();
		Rectangle absoluteBounds = new Rectangle(1, 1, 1, 1);
		int borderWidth = 1;
		Date initialDate = new Date();
		String timezone = "";

		Date result = CalendarPopup.openCalendarPopup(shell, absoluteBounds, borderWidth, initialDate, timezone);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Invalid thread access
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:286)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:277)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:226)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the Date openCalendarPopup(Shell,Rectangle,int,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenCalendarPopup_4()
		throws Exception {
		Shell shell = new Shell();
		Rectangle absoluteBounds = new Rectangle(1, 1, 1, 1);
		int borderWidth = 1;
		Date initialDate = new Date();
		String timezone = "";

		Date result = CalendarPopup.openCalendarPopup(shell, absoluteBounds, borderWidth, initialDate, timezone);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Invalid thread access
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:286)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:277)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:226)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the Date openCalendarPopup(Shell,Rectangle,int,Date,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenCalendarPopup_5()
		throws Exception {
		Shell shell = new Shell();
		Rectangle absoluteBounds = new Rectangle(1, 1, 1, 1);
		int borderWidth = 1;
		Date initialDate = new Date();
		String timezone = "";

		Date result = CalendarPopup.openCalendarPopup(shell, absoluteBounds, borderWidth, initialDate, timezone);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Invalid thread access
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:286)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:277)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:226)
		//       at org.eclipse.swt.widgets.Shell.<init>(Shell.java:160)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
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
	 * @generatedBy CodePro at 14/10/19 22:32
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
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CalendarPopupTest.class);
	}
}