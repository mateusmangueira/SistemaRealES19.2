package org.eclipse.bpel.common.ui.layouts;

import org.eclipse.bpel.common.ui.tray.TrayScrollBar;
import org.eclipse.draw2d.IFigure;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FillParentLayoutTest</code> contains tests for the class <code>{@link FillParentLayout}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FillParentLayoutTest {
	/**
	 * Run the FillParentLayout() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testFillParentLayout_1()
		throws Exception {

		FillParentLayout result = new FillParentLayout();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.getStretchMinorAxis());
		assertEquals(true, result.isStretchMinorAxis());
		assertEquals(0, result.getSpacing());
		assertEquals(1, result.getMinorAlignment());
		assertEquals(false, result.isHorizontal());
		assertEquals(false, result.isObservingVisibility());
	}

	/**
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_1()
		throws Exception {
		FillParentLayout fixture = new FillParentLayout();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
	}

	/**
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_2()
		throws Exception {
		FillParentLayout fixture = new FillParentLayout();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
	}

	/**
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_3()
		throws Exception {
		FillParentLayout fixture = new FillParentLayout();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
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
		new org.junit.runner.JUnitCore().run(FillParentLayoutTest.class);
	}
}