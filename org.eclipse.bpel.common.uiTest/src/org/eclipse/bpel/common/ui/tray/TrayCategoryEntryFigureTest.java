package org.eclipse.bpel.common.ui.tray;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TrayCategoryEntryFigureTest</code> contains tests for the class <code>{@link TrayCategoryEntryFigure}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:30
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class TrayCategoryEntryFigureTest {
	/**
	 * Run the TrayCategoryEntryFigure(IFigure,TrayCategoryEntryEditPart) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testTrayCategoryEntryFigure_1()
		throws Exception {
		IFigure labelPositionReference = new TrayScrollBar();
		TrayCategoryEntryEditPart part = null;

		TrayCategoryEntryFigure result = new TrayCategoryEntryFigure(labelPositionReference, part);

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
	 * Run the Rectangle getCategoryTitleLabelBounds() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetCategoryTitleLabelBounds_1()
		throws Exception {
		TrayCategoryEntryFigure fixture = new TrayCategoryEntryFigure(new TrayScrollBar(), (TrayCategoryEntryEditPart) null);
		fixture.shouldPaintSelectionBorder = true;
		fixture.nameLabel = new Label();

		Rectangle result = fixture.getCategoryTitleLabelBounds();

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
	 * Run the TrayCategoryEntryEditPart getEditPart() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetEditPart_1()
		throws Exception {
		TrayCategoryEntryFigure fixture = new TrayCategoryEntryFigure(new TrayScrollBar(), (TrayCategoryEntryEditPart) null);
		fixture.shouldPaintSelectionBorder = true;
		fixture.nameLabel = new Label();

		TrayCategoryEntryEditPart result = fixture.getEditPart();

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
	 * Run the Label getLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetLabel_1()
		throws Exception {
		TrayCategoryEntryFigure fixture = new TrayCategoryEntryFigure(new TrayScrollBar(), (TrayCategoryEntryEditPart) null);
		fixture.shouldPaintSelectionBorder = true;
		fixture.nameLabel = new Label();

		Label result = fixture.getLabel();

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
	 * Run the String getText() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		TrayCategoryEntryFigure fixture = new TrayCategoryEntryFigure(new TrayScrollBar(), (TrayCategoryEntryEditPart) null);
		fixture.shouldPaintSelectionBorder = true;
		fixture.nameLabel = new Label();

		String result = fixture.getText();

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
	 * Run the void setText(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSetText_1()
		throws Exception {
		TrayCategoryEntryFigure fixture = new TrayCategoryEntryFigure(new TrayScrollBar(), (TrayCategoryEntryEditPart) null);
		fixture.shouldPaintSelectionBorder = true;
		fixture.nameLabel = new Label();
		String text = "";

		fixture.setText(text);

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
		new org.junit.runner.JUnitCore().run(TrayCategoryEntryFigureTest.class);
	}
}