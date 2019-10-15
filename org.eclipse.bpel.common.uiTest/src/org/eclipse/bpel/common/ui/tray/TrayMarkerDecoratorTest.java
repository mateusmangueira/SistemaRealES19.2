package org.eclipse.bpel.common.ui.tray;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.bpel.common.ui.layouts.AlignedFlowLayout;
import org.eclipse.bpel.model.impl.BPELFactoryImpl;
import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TrayMarkerDecoratorTest</code> contains tests for the class <code>{@link TrayMarkerDecorator}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:30
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class TrayMarkerDecoratorTest {
	/**
	 * Run the TrayMarkerDecorator(List<EObject>) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testTrayMarkerDecorator_1()
		throws Exception {
		List<EObject> aListOfModelObjects = new ArrayList<EObject>();

		TrayMarkerDecorator result = new TrayMarkerDecorator(aListOfModelObjects);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(2), result.getDefaultConstraint());
		assertEquals(null, result.getModelObject());
	}

	/**
	 * Run the TrayMarkerDecorator(EObject) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testTrayMarkerDecorator_2()
		throws Exception {
		EObject aModelObject = new BPELFactoryImpl();

		TrayMarkerDecorator result = new TrayMarkerDecorator(aModelObject);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(2), result.getDefaultConstraint());
	}

	/**
	 * Run the TrayMarkerDecorator(List<EObject>,AbstractLayout) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testTrayMarkerDecorator_3()
		throws Exception {
		List<EObject> aListOfModelObjects = new ArrayList<EObject>();
		AbstractLayout aLayout = new AlignedFlowLayout();

		TrayMarkerDecorator result = new TrayMarkerDecorator(aListOfModelObjects, aLayout);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(2), result.getDefaultConstraint());
		assertEquals(null, result.getModelObject());
	}

	/**
	 * Run the TrayMarkerDecorator(EObject,AbstractLayout) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testTrayMarkerDecorator_4()
		throws Exception {
		EObject aModelObject = new BPELFactoryImpl();
		AbstractLayout aLayout = new AlignedFlowLayout();

		TrayMarkerDecorator result = new TrayMarkerDecorator(aModelObject, aLayout);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(2), result.getDefaultConstraint());
	}

	/**
	 * Run the IFigure createFigure(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCreateFigure_1()
		throws Exception {
		TrayMarkerDecorator fixture = new TrayMarkerDecorator(new BPELFactoryImpl());
		IFigure figure = new MainTrayEditPart().new MainTrayTitleFigure();

		IFigure result = fixture.createFigure(figure);

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
	}

	/**
	 * Run the IFigure createFigure(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCreateFigure_2()
		throws Exception {
		TrayMarkerDecorator fixture = new TrayMarkerDecorator(new BPELFactoryImpl());
		IFigure figure = new TrayScrollBar();

		IFigure result = fixture.createFigure(figure);

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
	 * Run the Object getConstraint(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetConstraint_1()
		throws Exception {
		TrayMarkerDecorator fixture = new TrayMarkerDecorator(new BPELFactoryImpl());
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayMarkerDecorator.getConstraint(TrayMarkerDecorator.java:125)
		assertNotNull(result);
	}

	/**
	 * Run the Object getConstraint(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetConstraint_2()
		throws Exception {
		TrayMarkerDecorator fixture = new TrayMarkerDecorator(new BPELFactoryImpl());
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayMarkerDecorator.getConstraint(TrayMarkerDecorator.java:125)
		assertNotNull(result);
	}

	/**
	 * Run the Object getConstraint(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testGetConstraint_3()
		throws Exception {
		TrayMarkerDecorator fixture = new TrayMarkerDecorator(new BPELFactoryImpl());
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayMarkerDecorator.getConstraint(TrayMarkerDecorator.java:125)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(TrayMarkerDecoratorTest.class);
	}
}