package org.eclipse.bpel.common.ui.figures;

import org.eclipse.bpel.common.ui.tray.MainTrayEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>InsetResizeHandleTest</code> contains tests for the class <code>{@link InsetResizeHandle}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class InsetResizeHandleTest {
	/**
	 * Run the InsetResizeHandle(GraphicalEditPart,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testInsetResizeHandle_1()
		throws Exception {
		GraphicalEditPart owner = new MainTrayEditPart();
		int direction = 1;
		int verticalInset = 1;
		int horizontalInset = 1;

		InsetResizeHandle result = new InsetResizeHandle(owner, direction, verticalInset, horizontalInset);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		//       at org.eclipse.bpel.common.ui.tray.MainTrayEditPart$MainTrayContainerFigure.<init>(MainTrayEditPart.java:119)
		//       at org.eclipse.bpel.common.ui.tray.MainTrayEditPart.createMainFigure(MainTrayEditPart.java:182)
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart.createFigure(TrayContainerEditPart.java:67)
		//       at org.eclipse.gef.editparts.AbstractGraphicalEditPart.getFigure(AbstractGraphicalEditPart.java:494)
		//       at org.eclipse.gef.handles.ResizeHandle.<init>(ResizeHandle.java:43)
		//       at org.eclipse.bpel.common.ui.figures.InsetResizeHandle.<init>(InsetResizeHandle.java:35)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(InsetResizeHandleTest.class);
	}
}