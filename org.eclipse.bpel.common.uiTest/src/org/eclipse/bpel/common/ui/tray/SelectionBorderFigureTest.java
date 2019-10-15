package org.eclipse.bpel.common.ui.tray;

import org.eclipse.bpel.common.ui.calendar.CalendarControl;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Composite;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SelectionBorderFigureTest</code> contains tests for the class <code>{@link SelectionBorderFigure}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class SelectionBorderFigureTest {
	/**
	 * Run the SelectionBorderFigure() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSelectionBorderFigure_1()
		throws Exception {

		SelectionBorderFigure result = new SelectionBorderFigure();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getParent());
		assertEquals(false, result.isOpaque());
		assertEquals(false, result.isMirrored());
		assertEquals(null, result.getForegroundColor());
		assertEquals(false, result.isCoordinateSystem());
		assertEquals(null, result.getLocalForegroundColor());
		assertEquals(null, result.getLocalBackgroundColor());
		assertEquals(false, result.isFocusTraversable());
		assertEquals(null, result.internalGetEventDispatcher());
		assertEquals(false, result.isRequestFocusEnabled());
		assertEquals(null, result.getClippingStrategy());
		assertEquals(true, result.isEnabled());
		assertEquals(null, result.getToolTip());
		assertEquals(null, result.getBackgroundColor());
		assertEquals(null, result.getBorder());
		assertEquals(true, result.isVisible());
		assertEquals(null, result.getCursor());
		assertEquals(null, result.getFont());
		assertEquals(false, result.hasFocus());
		assertEquals(true, result.isShowing());
		assertEquals(null, result.getLayoutManager());
	}

	/**
	 * Run the void paint(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testPaint_1()
		throws Exception {
		SelectionBorderFigure fixture = new SelectionBorderFigure();
		fixture.setPaintSelectionBorder(true);
		Graphics graphics = new SWTGraphics(new GC(new CalendarControl((Composite) null)));

		fixture.paint(graphics);

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
		//       at org.eclipse.swt.widgets.Canvas.<init>(Canvas.java:78)
		//       at org.eclipse.bpel.common.ui.calendar.CalendarControl.<init>(CalendarControl.java:136)
	}

	/**
	 * Run the void paintSelectionBorder(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testPaintSelectionBorder_1()
		throws Exception {
		SelectionBorderFigure fixture = new SelectionBorderFigure();
		fixture.setPaintSelectionBorder(true);
		Graphics graphics = new SWTGraphics(new GC(new CalendarControl((Composite) null)));

		fixture.paintSelectionBorder(graphics);

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
		//       at org.eclipse.swt.widgets.Canvas.<init>(Canvas.java:78)
		//       at org.eclipse.bpel.common.ui.calendar.CalendarControl.<init>(CalendarControl.java:136)
	}

	/**
	 * Run the void paintSelectionBorder(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testPaintSelectionBorder_2()
		throws Exception {
		SelectionBorderFigure fixture = new SelectionBorderFigure();
		fixture.setPaintSelectionBorder(false);
		Graphics graphics = new SWTGraphics(new GC(new CalendarControl((Composite) null)));

		fixture.paintSelectionBorder(graphics);

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
		//       at org.eclipse.swt.widgets.Canvas.<init>(Canvas.java:78)
		//       at org.eclipse.bpel.common.ui.calendar.CalendarControl.<init>(CalendarControl.java:136)
	}

	/**
	 * Run the void setPaintSelectionBorder(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSetPaintSelectionBorder_1()
		throws Exception {
		SelectionBorderFigure fixture = new SelectionBorderFigure();
		fixture.setPaintSelectionBorder(true);
		boolean paint = true;

		fixture.setPaintSelectionBorder(paint);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(SelectionBorderFigureTest.class);
	}
}