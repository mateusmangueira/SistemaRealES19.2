package org.eclipse.bpel.common.ui.tray;

import org.eclipse.swt.accessibility.AccessibleControlEvent;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TrayAccessibleEditPartTest</code> contains tests for the class <code>{@link TrayAccessibleEditPart}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class TrayAccessibleEditPartTest {
	/**
	 * Run the TrayAccessibleEditPart(TrayEditPart) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testTrayAccessibleEditPart_1()
		throws Exception {
		TrayEditPart part = new MainTrayEditPart();

		TrayAccessibleEditPart result = new TrayAccessibleEditPart(part);

		// add additional test code here
		assertNotNull(result);
		assertEquals(363258624, result.getAccessibleID());
	}

	/**
	 * Run the void getChildCount(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetChildCount_1()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.children = new Object[] {};
		e.detail = 1;

		fixture.getChildCount(e);

		// add additional test code here
	}

	/**
	 * Run the void getChildren(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetChildren_1()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.children = new Object[] {};

		fixture.getChildren(e);

		// add additional test code here
	}

	/**
	 * Run the void getChildren(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetChildren_2()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.children = new Object[] {};

		fixture.getChildren(e);

		// add additional test code here
	}

	/**
	 * Run the void getChildren(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetChildren_3()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.children = new Object[] {};

		fixture.getChildren(e);

		// add additional test code here
	}

	/**
	 * Run the void getLocation(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetLocation_1()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.y = 1;
		e.height = 1;
		e.width = 1;
		e.x = 1;

		fixture.getLocation(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		//       at org.eclipse.bpel.common.ui.tray.MainTrayEditPart$MainTrayContainerFigure.<init>(MainTrayEditPart.java:119)
		//       at org.eclipse.bpel.common.ui.tray.MainTrayEditPart.createMainFigure(MainTrayEditPart.java:182)
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart.createFigure(TrayContainerEditPart.java:67)
		//       at org.eclipse.gef.editparts.AbstractGraphicalEditPart.getFigure(AbstractGraphicalEditPart.java:494)
		//       at org.eclipse.bpel.common.ui.tray.TrayAccessibleEditPart.getLocation(TrayAccessibleEditPart.java:66)
	}

	/**
	 * Run the void getName(AccessibleEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleEvent e = new AccessibleEvent(new Object());
		e.result = "";

		fixture.getName(e);

		// add additional test code here
	}

	/**
	 * Run the void getName(AccessibleEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetName_2()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleEvent e = new AccessibleEvent(new Object());
		e.result = "";

		fixture.getName(e);

		// add additional test code here
	}

	/**
	 * Run the void getState(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetState_1()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.detail = 1;

		fixture.getState(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayAccessibleEditPart.getState(TrayAccessibleEditPart.java:81)
	}

	/**
	 * Run the void getState(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetState_2()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.detail = 1;

		fixture.getState(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayAccessibleEditPart.getState(TrayAccessibleEditPart.java:81)
	}

	/**
	 * Run the void getState(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetState_3()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.detail = 1;

		fixture.getState(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayAccessibleEditPart.getState(TrayAccessibleEditPart.java:81)
	}

	/**
	 * Run the void getState(AccessibleControlEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetState_4()
		throws Exception {
		TrayAccessibleEditPart fixture = new TrayAccessibleEditPart(new MainTrayEditPart());
		AccessibleControlEvent e = new AccessibleControlEvent(new Object());
		e.detail = 1;

		fixture.getState(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayAccessibleEditPart.getState(TrayAccessibleEditPart.java:81)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
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
	 * @generatedBy CodePro at 14/10/19 22:31
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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TrayAccessibleEditPartTest.class);
	}
}