package org.eclipse.bpel.common.ui.decorator;

import org.eclipse.bpel.common.ui.tray.TrayScrollBar;
import org.eclipse.bpel.model.impl.BPELFactoryImpl;
import org.eclipse.core.resources.IMarker;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Layer;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>LinkEditPartMarkerDecoratorTest</code> contains tests for the class <code>{@link LinkEditPartMarkerDecorator}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class LinkEditPartMarkerDecoratorTest {
	/**
	 * Run the LinkEditPartMarkerDecorator(EObject,Connection) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testLinkEditPartMarkerDecorator_1()
		throws Exception {
		EObject aModelObject = new BPELFactoryImpl();
		Connection aConnection = new PolylineConnection();

		LinkEditPartMarkerDecorator result = new LinkEditPartMarkerDecorator(aModelObject, aConnection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Integer(2), result.getDefaultConstraint());
	}

	/**
	 * Run the void addMarkerFigure(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testAddMarkerFigure_1()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IFigure figure = new TrayScrollBar();

		fixture.addMarkerFigure(figure);

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
	 * Run the Connection getConnection() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConnection_1()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		Connection result = fixture.getConnection();

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_1()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_2()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_3()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_4()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_5()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_6()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_7()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetConstraint_8()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;
		IMarker marker = null;

		Object result = fixture.getConstraint(marker);

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
	 * Run the void refreshMarkers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRefreshMarkers_1()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		fixture.refreshMarkers();

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
	 * Run the void refreshMarkers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRefreshMarkers_2()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		fixture.refreshMarkers();

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
	 * Run the void refreshMarkers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRefreshMarkers_3()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		fixture.refreshMarkers();

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
	 * Run the void refreshMarkers() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRefreshMarkers_4()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), (Connection) null);
		fixture.addMarkerFigure(new TrayScrollBar());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		fixture.refreshMarkers();

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
	 * Run the void removeAllMarkerFigures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRemoveAllMarkerFigures_1()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		fixture.removeAllMarkerFigures();

		// add additional test code here
	}

	/**
	 * Run the void removeAllMarkerFigures() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRemoveAllMarkerFigures_2()
		throws Exception {
		LinkEditPartMarkerDecorator fixture = new LinkEditPartMarkerDecorator(new BPELFactoryImpl(), new PolylineConnection());
		fixture.decorationLayer = new Layer();
		fixture.modelObject = new BPELFactoryImpl();
		fixture.resizeChildren = true;

		fixture.removeAllMarkerFigures();

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
		new org.junit.runner.JUnitCore().run(LinkEditPartMarkerDecoratorTest.class);
	}
}