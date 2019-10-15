package org.eclipse.bpel.common.ui.figures;

import org.eclipse.bpel.common.ui.tray.TrayScrollBar;
import org.eclipse.draw2d.IFigure;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InsetRelativeHandleLocatorTest</code> contains tests for the class <code>{@link InsetRelativeHandleLocator}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:30
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class InsetRelativeHandleLocatorTest {
	/**
	 * Run the InsetRelativeHandleLocator(IFigure,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInsetRelativeHandleLocator_1()
		throws Exception {
		IFigure reference = new TrayScrollBar();
		int aLocation = 1;
		int verticalInset = 1;
		int horizontalInset = 1;

		InsetRelativeHandleLocator result = new InsetRelativeHandleLocator(reference, aLocation, verticalInset, horizontalInset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
		assertNotNull(result);
	}

	/**
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_1()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_2()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_3()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_4()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_5()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_6()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_7()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_8()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * Run the void relocate(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testRelocate_9()
		throws Exception {
		InsetRelativeHandleLocator fixture = new InsetRelativeHandleLocator(new TrayScrollBar(), 1, 1, 1);
		IFigure target = new TrayScrollBar();

		fixture.relocate(target);

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
	 * @generatedBy CodePro at 14/10/19 22:30
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
	 * @generatedBy CodePro at 14/10/19 22:30
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
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(InsetRelativeHandleLocatorTest.class);
	}
}