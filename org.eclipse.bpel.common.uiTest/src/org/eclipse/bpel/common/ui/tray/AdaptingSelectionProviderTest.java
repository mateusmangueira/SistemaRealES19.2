package org.eclipse.bpel.common.ui.tray;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AdaptingSelectionProviderTest</code> contains tests for the class <code>{@link AdaptingSelectionProvider}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:30
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class AdaptingSelectionProviderTest {
	/**
	 * Run the AdaptingSelectionProvider() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testAdaptingSelectionProvider_1()
		throws Exception {

		AdaptingSelectionProvider result = new AdaptingSelectionProvider();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isBroadcastingSelectionChange());
	}

	/**
	 * Run the AdaptingSelectionProvider(EditPartViewer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testAdaptingSelectionProvider_2()
		throws Exception {
		EditPartViewer viewer = new GraphicalViewerImpl();

		AdaptingSelectionProvider result = new AdaptingSelectionProvider(viewer);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Invalid thread access
		//       at org.eclipse.draw2d.DeferredUpdateManager.sendUpdateRequest(DeferredUpdateManager.java:261)
		//       at org.eclipse.draw2d.DeferredUpdateManager.queueWork(DeferredUpdateManager.java:247)
		//       at org.eclipse.draw2d.DeferredUpdateManager.addInvalidFigure(DeferredUpdateManager.java:133)
		//       at org.eclipse.draw2d.Figure.revalidate(Figure.java:1451)
		//       at org.eclipse.draw2d.Figure.setLayoutManager(Figure.java:1694)
		//       at org.eclipse.draw2d.LightweightSystem.createRootFigure(LightweightSystem.java:169)
		//       at org.eclipse.draw2d.LightweightSystem.init(LightweightSystem.java:187)
		//       at org.eclipse.draw2d.LightweightSystem.<init>(LightweightSystem.java:79)
		//       at org.eclipse.gef.ui.parts.GraphicalViewerImpl.createLightweightSystem(GraphicalViewerImpl.java:102)
		//       at org.eclipse.gef.ui.parts.GraphicalViewerImpl.<init>(GraphicalViewerImpl.java:66)
		assertNotNull(result);
	}

	/**
	 * Run the IStructuredSelection calculateSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCalculateSelection_1()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = null;

		IStructuredSelection result = fixture.calculateSelection(selection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
		assertEquals(null, result.getFirstElement());
		assertEquals(true, result.isEmpty());
	}

	/**
	 * Run the IStructuredSelection calculateSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCalculateSelection_2()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		IStructuredSelection result = fixture.calculateSelection(selection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
		assertEquals(null, result.getFirstElement());
		assertEquals(true, result.isEmpty());
	}

	/**
	 * Run the IStructuredSelection calculateSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCalculateSelection_3()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		IStructuredSelection result = fixture.calculateSelection(selection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
		assertEquals(null, result.getFirstElement());
		assertEquals(true, result.isEmpty());
	}

	/**
	 * Run the IStructuredSelection calculateSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCalculateSelection_4()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		IStructuredSelection result = fixture.calculateSelection(selection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
		assertEquals(null, result.getFirstElement());
		assertEquals(true, result.isEmpty());
	}

	/**
	 * Run the IStructuredSelection calculateSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCalculateSelection_5()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		IStructuredSelection result = fixture.calculateSelection(selection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
		assertEquals(null, result.getFirstElement());
		assertEquals(true, result.isEmpty());
	}

	/**
	 * Run the IStructuredSelection calculateSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testCalculateSelection_6()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		IStructuredSelection result = fixture.calculateSelection(selection);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
		assertEquals(null, result.getFirstElement());
		assertEquals(true, result.isEmpty());
	}

	/**
	 * Run the void internalSetSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInternalSetSelection_1()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = null;

		fixture.internalSetSelection(selection);

		// add additional test code here
	}

	/**
	 * Run the void internalSetSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInternalSetSelection_2()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		fixture.internalSetSelection(selection);

		// add additional test code here
	}

	/**
	 * Run the void internalSetSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInternalSetSelection_3()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		fixture.internalSetSelection(selection);

		// add additional test code here
	}

	/**
	 * Run the void internalSetSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInternalSetSelection_4()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		fixture.internalSetSelection(selection);

		// add additional test code here
	}

	/**
	 * Run the void internalSetSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInternalSetSelection_5()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		fixture.internalSetSelection(selection);

		// add additional test code here
	}

	/**
	 * Run the void internalSetSelection(IStructuredSelection) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testInternalSetSelection_6()
		throws Exception {
		AdaptingSelectionProvider fixture = new AdaptingSelectionProvider();
		fixture.broadcastingSelectionChange = true;
		fixture.cachedSelection = TreeSelection.EMPTY;
		fixture.postListeners = new ArrayList<ISelectionChangedListener>();
		fixture.listeners = new ArrayList<ISelectionChangedListener>();
		fixture.changingSelection = true;
		fixture.viewers = new ArrayList<EditPartViewer>();
		IStructuredSelection selection = TreeSelection.EMPTY;

		fixture.internalSetSelection(selection);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(AdaptingSelectionProviderTest.class);
	}
}