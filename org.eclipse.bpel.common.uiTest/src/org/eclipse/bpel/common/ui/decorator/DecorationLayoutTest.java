package org.eclipse.bpel.common.ui.decorator;

import org.eclipse.bpel.common.ui.tray.TrayScrollBar;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>DecorationLayoutTest</code> contains tests for the class <code>{@link DecorationLayout}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:29
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class DecorationLayoutTest {
	/**
	 * Run the DecorationLayout() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testDecorationLayout_1()
		throws Exception {

		DecorationLayout result = new DecorationLayout();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isObservingVisibility());
	}

	/**
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_1()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 2;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;
		childDimension.height = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_2()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 8;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_3()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 32;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;
		childDimension.height = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_4()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 1;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_5()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 4;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;
		childDimension.height = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_6()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 9;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_7()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 12;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_8()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 33;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.height = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_9()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 36;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();
		childDimension.width = 1;
		childDimension.height = 1;

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Point calculateLocation(int,IFigure,Dimension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculateLocation_10()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		int locationHint = 3;
		IFigure container = new TrayScrollBar();
		Dimension childDimension = new Dimension();

		Point result = fixture.calculateLocation(locationHint, container, childDimension);

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
	 * Run the Dimension calculatePreferredSize(IFigure,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testCalculatePreferredSize_1()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure container = new TrayScrollBar();
		int wHint = 1;
		int hHint = 1;

		Dimension result = fixture.calculatePreferredSize(container, wHint, hHint);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_7()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_8()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_9()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void remove(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testRemove_10()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();

		fixture.remove(child);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_1()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = null;

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_2()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_3()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_4()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_5()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_6()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_7()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_8()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_9()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_10()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
	 * Run the void setConstraint(IFigure,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:29
	 */
	@Test
	public void testSetConstraint_11()
		throws Exception {
		DecorationLayout fixture = new DecorationLayout();
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		fixture.setConstraint(new TrayScrollBar(), new Object());
		IFigure child = new TrayScrollBar();
		Object constraint = new Integer(1);

		fixture.setConstraint(child, constraint);

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
		new org.junit.runner.JUnitCore().run(DecorationLayoutTest.class);
	}
}