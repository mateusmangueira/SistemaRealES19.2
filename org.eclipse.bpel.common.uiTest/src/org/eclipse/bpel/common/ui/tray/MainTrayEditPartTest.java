package org.eclipse.bpel.common.ui.tray;

import org.eclipse.bpel.common.ui.decorator.EditPartMarkerDecorator;
import org.eclipse.bpel.model.adapters.AbstractAdapter;
import org.eclipse.bpel.model.impl.BPELFactoryImpl;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MainTrayEditPartTest</code> contains tests for the class <code>{@link MainTrayEditPart}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:29
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class MainTrayEditPartTest {
	/**
	 * Run the MainTrayEditPart() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testMainTrayEditPart_1()
		throws Exception {

		MainTrayEditPart result = new MainTrayEditPart();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDirectEditLabel());
		assertEquals(null, result.getLabelProvider());
		assertEquals("MainTrayEditPart( null )", result.toString());
		assertEquals(null, result.getParent());
		assertEquals(null, result.getRoot());
		assertEquals(false, result.isActive());
		assertEquals(0, result.getSelected());
		assertEquals(null, result.getModel());
		assertEquals(false, result.hasFocus());
		assertEquals(null, result.getViewer());
	}

	/**
	 * Run the EditPartMarkerDecorator createEditPartMarkerDecorator() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCreateEditPartMarkerDecorator_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		EditPartMarkerDecorator result = fixture.createEditPartMarkerDecorator();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the void createEditPolicies() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCreateEditPolicies_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		fixture.createEditPolicies();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
	}

	/**
	 * Run the TrayContainerEditPart.TrayContainerFigure createMainFigure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCreateMainFigure_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		TrayContainerEditPart.TrayContainerFigure result = fixture.createMainFigure();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the IFigure createTitleFigure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCreateTitleFigure_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		IFigure result = fixture.createTitleFigure();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Label getDirectEditLabel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetDirectEditLabel_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		Label result = fixture.getDirectEditLabel();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Object getModelObjectFromSelection(ISelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetModelObjectFromSelection_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);
		ISelection target = TreeSelection.EMPTY;

		Object result = fixture.getModelObjectFromSelection(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Object getModelObjectFromSelection(ISelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetModelObjectFromSelection_2()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);
		ISelection target = TreeSelection.EMPTY;

		Object result = fixture.getModelObjectFromSelection(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Object getModelObjectFromSelection(ISelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetModelObjectFromSelection_3()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);
		ISelection target = TreeSelection.EMPTY;

		Object result = fixture.getModelObjectFromSelection(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the Object getModelObjectFromSelection(ISelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testGetModelObjectFromSelection_4()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);
		ISelection target = TreeSelection.EMPTY;

		Object result = fixture.getModelObjectFromSelection(target);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
		assertNotNull(result);
	}

	/**
	 * Run the void refreshVisuals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRefreshVisuals_1()
		throws Exception {
		MainTrayEditPart fixture = new MainTrayEditPart();
		fixture.adapter = new AbstractAdapter();
		fixture.labelProvider = WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider();
		fixture.mainFigure = new MainTrayEditPart().new TrayContainerFigure();
		fixture.nameLabel = new Label();
		fixture.acc = new TrayAccessibleEditPart(new MainTrayEditPart());
		fixture.mainTrayTitleFigure = new MainTrayEditPart().new MainTrayTitleFigure();
		fixture.decorator = new EditPartMarkerDecorator(new BPELFactoryImpl());
		fixture.directEditManager = new TrayCategoryEntryEditPartDirectEditManager(new MainTrayEditPart(), Object.class, (CellEditorLocator) null);

		fixture.refreshVisuals();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayContainerEditPart$TrayContainerFigure.<init>(TrayContainerEditPart.java:35)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
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
	 * @generatedBy CodePro at 14/10/19 22:29
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
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MainTrayEditPartTest.class);
	}
}