package org.eclipse.bpel.common.ui.tray;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TrayCategoryEntryEditPartDirectEditManagerTest</code> contains tests for the class <code>{@link TrayCategoryEntryEditPartDirectEditManager}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class TrayCategoryEntryEditPartDirectEditManagerTest {
	/**
	 * Run the TrayCategoryEntryEditPartDirectEditManager(GraphicalEditPart,Class,CellEditorLocator) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testTrayCategoryEntryEditPartDirectEditManager_1()
		throws Exception {
		GraphicalEditPart source = new MainTrayEditPart();
		Class editorType = Object.class;
		CellEditorLocator locator = null;

		TrayCategoryEntryEditPartDirectEditManager result = new TrayCategoryEntryEditPartDirectEditManager(source, editorType, locator);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void initCellEditor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testInitCellEditor_1()
		throws Exception {
		TrayCategoryEntryEditPartDirectEditManager fixture = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		fixture.initCellEditor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayCategoryEntryEditPartDirectEditManager.initCellEditor(TrayCategoryEntryEditPartDirectEditManager.java:27)
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
		new org.junit.runner.JUnitCore().run(TrayCategoryEntryEditPartDirectEditManagerTest.class);
	}
}