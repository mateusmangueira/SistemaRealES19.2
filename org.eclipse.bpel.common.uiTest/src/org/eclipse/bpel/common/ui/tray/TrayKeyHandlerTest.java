package org.eclipse.bpel.common.ui.tray;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.ui.parts.GraphicalViewerImpl;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Event;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TrayKeyHandlerTest</code> contains tests for the class <code>{@link TrayKeyHandler}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class TrayKeyHandlerTest {
	/**
	 * Run the TrayKeyHandler(EditPartViewer) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testTrayKeyHandler_1()
		throws Exception {
		EditPartViewer viewer = new GraphicalViewerImpl();

		TrayKeyHandler result = new TrayKeyHandler(viewer);

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
	 * Run the boolean activateDirectEdit(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testActivateDirectEdit_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());

		boolean result = fixture.activateDirectEdit(event);

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
		assertTrue(result);
	}

	/**
	 * Run the void buildFlatList(List,EditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testBuildFlatList_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		List result = new ArrayList();
		EditPart container = new MainTrayEditPart();

		fixture.buildFlatList(result, container);

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
	}

	/**
	 * Run the void buildFlatList(List,EditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testBuildFlatList_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		List result = new ArrayList();
		EditPart container = new MainTrayEditPart();

		fixture.buildFlatList(result, container);

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
	}

	/**
	 * Run the MainTrayEditPart getMainTrayEditPart(EditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetMainTrayEditPart_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		EditPart part = new MainTrayEditPart();

		MainTrayEditPart result = fixture.getMainTrayEditPart(part);

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
	 * Run the MainTrayEditPart getMainTrayEditPart(EditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetMainTrayEditPart_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		EditPart part = new MainTrayEditPart();

		MainTrayEditPart result = fixture.getMainTrayEditPart(part);

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
	 * Run the int getScrollStep(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetScrollStep_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		int result = fixture.getScrollStep(part);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int getScrollStep(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetScrollStep_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = null;

		int result = fixture.getScrollStep(part);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int getScrollStep(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetScrollStep_3()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		int result = fixture.getScrollStep(part);

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
		assertEquals(0, result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777217;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777217;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_3()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777218;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_4()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777218;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_5()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777223;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_6()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777223;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_7()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777224;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_8()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777224;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_9()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777222;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_10()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777222;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_11()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777221;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_12()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777221;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_13()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777227;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean keyPressed(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testKeyPressed_14()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		event.keyCode = 16777227;

		boolean result = fixture.keyPressed(event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
		assertTrue(result);
	}

	/**
	 * Run the boolean navigateJump(KeyEvent,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateJump_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		int direction = 1;

		boolean result = fixture.navigateJump(event, direction);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean navigateNext(KeyEvent,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateNext_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		int direction = 4;

		boolean result = fixture.navigateNext(event, direction);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean navigateNext(KeyEvent,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateNext_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		int direction = 1;

		boolean result = fixture.navigateNext(event, direction);

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
		assertTrue(result);
	}

	/**
	 * Run the boolean navigateNext(KeyEvent,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateNext_3()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		KeyEvent event = new KeyEvent(new Event());
		int direction = 1;

		boolean result = fixture.navigateNext(event, direction);

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
		assertTrue(result);
	}

	/**
	 * Run the void navigateTo(GraphicalEditPart,KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateTo_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = null;
		KeyEvent event = new KeyEvent(new Event());

		fixture.navigateTo(part, event);

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
	}

	/**
	 * Run the void navigateTo(GraphicalEditPart,KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateTo_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();
		KeyEvent event = new KeyEvent(new Event());
		event.stateMask = 1;

		fixture.navigateTo(part, event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
	}

	/**
	 * Run the void navigateTo(GraphicalEditPart,KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateTo_3()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();
		KeyEvent event = new KeyEvent(new Event());
		event.stateMask = 1;

		fixture.navigateTo(part, event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
	}

	/**
	 * Run the void navigateTo(GraphicalEditPart,KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNavigateTo_4()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();
		KeyEvent event = new KeyEvent(new Event());
		event.stateMask = 1;

		fixture.navigateTo(part, event);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: null source
		//       at java.util.EventObject.<init>(Unknown Source)
		//       at org.eclipse.swt.events.TypedEvent.<init>(TypedEvent.java:72)
		//       at org.eclipse.swt.events.KeyEvent.<init>(KeyEvent.java:110)
	}

	/**
	 * Run the void reveal(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testReveal_1()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		fixture.reveal(part);

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
	}

	/**
	 * Run the void reveal(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testReveal_2()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		fixture.reveal(part);

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
	}

	/**
	 * Run the void reveal(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testReveal_3()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		fixture.reveal(part);

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
	}

	/**
	 * Run the void reveal(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testReveal_4()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		fixture.reveal(part);

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
	}

	/**
	 * Run the void reveal(GraphicalEditPart) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testReveal_5()
		throws Exception {
		TrayKeyHandler fixture = new TrayKeyHandler(new GraphicalViewerImpl());
		GraphicalEditPart part = new MainTrayEditPart();

		fixture.reveal(part);

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
		new org.junit.runner.JUnitCore().run(TrayKeyHandlerTest.class);
	}
}