package org.eclipse.bpel.common.ui.tray;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.SWTGraphics;
import org.eclipse.draw2d.TreeSearch;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TraySelectionHandleTest</code> contains tests for the class <code>{@link TraySelectionHandle}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:28
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class TraySelectionHandleTest {
	/**
	 * Run the TraySelectionHandle(GraphicalEditPart,SelectionBorderFigure) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testTraySelectionHandle_1()
		throws Exception {
		GraphicalEditPart owner = new MainTrayEditPart();
		SelectionBorderFigure figure = new SelectionBorderFigure();

		TraySelectionHandle result = new TraySelectionHandle(owner, figure);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDragTracker());
		assertEquals(null, result.getDragCursor());
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
	 * Run the DragTracker createDragTracker() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testCreateDragTracker_1()
		throws Exception {
		TraySelectionHandle fixture = new TraySelectionHandle(new MainTrayEditPart(), new SelectionBorderFigure());

		DragTracker result = fixture.createDragTracker();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IFigure findFigureAt(int,int,TreeSearch) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFindFigureAt_1()
		throws Exception {
		TraySelectionHandle fixture = new TraySelectionHandle(new MainTrayEditPart(), new SelectionBorderFigure());
		int x = 1;
		int y = 1;
		TreeSearch search = null;

		IFigure result = fixture.findFigureAt(x, y, search);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IFigure findFigureAt(int,int,TreeSearch) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFindFigureAt_2()
		throws Exception {
		TraySelectionHandle fixture = new TraySelectionHandle(new MainTrayEditPart(), new SelectionBorderFigure());
		int x = 1;
		int y = 1;
		TreeSearch search = null;

		IFigure result = fixture.findFigureAt(x, y, search);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IFigure findMouseEventTargetAt(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFindMouseEventTargetAt_1()
		throws Exception {
		TraySelectionHandle fixture = new TraySelectionHandle(new MainTrayEditPart(), new SelectionBorderFigure());
		int x = 1;
		int y = 1;

		IFigure result = fixture.findMouseEventTargetAt(x, y);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void paint(Graphics) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testPaint_1()
		throws Exception {
		TraySelectionHandle fixture = new TraySelectionHandle(new MainTrayEditPart(), new SelectionBorderFigure());
		Graphics g = new SWTGraphics(new GC(Display.findDisplay(Thread.currentThread())));

		fixture.paint(g);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.graphics.GC.<init>(GC.java:165)
		//       at org.eclipse.swt.graphics.GC.<init>(GC.java:132)
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
		new org.junit.runner.JUnitCore().run(TraySelectionHandleTest.class);
	}
}