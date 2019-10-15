package org.eclipse.bpel.common.ui.layouts;

import org.eclipse.bpel.common.ui.tray.TrayScrollBar;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AlignedFlowLayoutTest</code> contains tests for the class <code>{@link AlignedFlowLayout}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class AlignedFlowLayoutTest {
	/**
	 * Run the AlignedFlowLayout() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testAlignedFlowLayout_1()
		throws Exception {

		AlignedFlowLayout result = new AlignedFlowLayout();

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isHorizontal());
		assertEquals(1, result.getVerticalAlignment());
		assertEquals(5, result.getVerticalSpacing());
		assertEquals(1, result.getSecondaryAlignment());
		assertEquals(1, result.getHorizontalAlignment());
		assertEquals(5, result.getHorizontalSpacing());
		assertEquals(false, result.isObservingVisibility());
	}

	/**
	 * Run the AlignedFlowLayout(boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testAlignedFlowLayout_2()
		throws Exception {
		boolean isHorizontal = true;

		AlignedFlowLayout result = new AlignedFlowLayout(isHorizontal);

		// add additional test code here
		assertNotNull(result);
		assertEquals(true, result.isHorizontal());
		assertEquals(1, result.getVerticalAlignment());
		assertEquals(5, result.getVerticalSpacing());
		assertEquals(1, result.getSecondaryAlignment());
		assertEquals(1, result.getHorizontalAlignment());
		assertEquals(5, result.getHorizontalSpacing());
		assertEquals(false, result.isObservingVisibility());
	}

	/**
	 * Run the Dimension getChildSize(IFigure,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetChildSize_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure child = new TrayScrollBar();
		int wHint = 1;
		int hHint = 1;

		Dimension result = fixture.getChildSize(child, wHint, hHint);

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
	 * Run the int getHorizontalAlignment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetHorizontalAlignment_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		int result = fixture.getHorizontalAlignment();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getHorizontalSpacing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetHorizontalSpacing_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		int result = fixture.getHorizontalSpacing();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSecondaryAlignment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetSecondaryAlignment_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		int result = fixture.getSecondaryAlignment();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getVerticalAlignment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetVerticalAlignment_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		int result = fixture.getVerticalAlignment();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getVerticalSpacing() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetVerticalSpacing_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		int result = fixture.getVerticalSpacing();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the boolean isHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIsHorizontal_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		boolean result = fixture.isHorizontal();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isHorizontal() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIsHorizontal_2()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();

		boolean result = fixture.isHorizontal();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isSensitiveHorizontally(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIsSensitiveHorizontally_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		boolean result = fixture.isSensitiveHorizontally(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSensitiveHorizontally(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIsSensitiveHorizontally_2()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		boolean result = fixture.isSensitiveHorizontally(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSensitiveVertically(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIsSensitiveVertically_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		boolean result = fixture.isSensitiveVertically(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
		assertTrue(result);
	}

	/**
	 * Run the boolean isSensitiveVertically(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIsSensitiveVertically_2()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		boolean result = fixture.isSensitiveVertically(parent);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createButton(TrayScrollBar.java:93)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.createDefaultUpButton(TrayScrollBar.java:89)
		//       at org.eclipse.draw2d.ScrollBar.initialize(ScrollBar.java:295)
		//       at org.eclipse.draw2d.ScrollBar.<init>(ScrollBar.java:69)
		//       at org.eclipse.bpel.common.ui.tray.TrayScrollBar.<init>(TrayScrollBar.java:36)
		assertTrue(result);
	}

	/**
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_2()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_3()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(false);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_4()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(false);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_5()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_6()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_7()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_8()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_9()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(false);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_10()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(false);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_11()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layout(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayout_12()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layout(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(false);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_2()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(0);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(false);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_3()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(2);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(false);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_4()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(2);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(2);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_5()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_6()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_7()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(0);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_8()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(2);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_9()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(0);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_10()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(0);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_11()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(0);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(0);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_12()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(2);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(0);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_13()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(2);
		fixture.setHorizontal(false);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_14()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(2);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_15()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(0);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(2);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void layoutRow(IFigure) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testLayoutRow_16()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(2);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(2);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();

		fixture.layoutRow(parent);

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
	 * Run the void setBoundsOfChild(IFigure,IFigure,Rectangle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetBoundsOfChild_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		IFigure parent = new TrayScrollBar();
		IFigure child = new TrayScrollBar();
		Rectangle bounds = new Rectangle();

		fixture.setBoundsOfChild(parent, child, bounds);

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
	 * Run the void setHorizontal(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetHorizontal_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		boolean flag = true;

		fixture.setHorizontal(flag);

		// add additional test code here
	}

	/**
	 * Run the void setHorizontal(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetHorizontal_2()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		boolean flag = true;

		fixture.setHorizontal(flag);

		// add additional test code here
	}

	/**
	 * Run the void setHorizontalAlignment(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetHorizontalAlignment_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		int align = 1;

		fixture.setHorizontalAlignment(align);

		// add additional test code here
	}

	/**
	 * Run the void setHorizontalSpacing(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetHorizontalSpacing_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		int n = 1;

		fixture.setHorizontalSpacing(n);

		// add additional test code here
	}

	/**
	 * Run the void setSecondaryAlignment(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSecondaryAlignment_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		int i = 1;

		fixture.setSecondaryAlignment(i);

		// add additional test code here
	}

	/**
	 * Run the void setStretchMinorAxis(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetStretchMinorAxis_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		boolean value = true;

		fixture.setStretchMinorAxis(value);

		// add additional test code here
	}

	/**
	 * Run the void setStretchMinorAxisToParent(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetStretchMinorAxisToParent_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		boolean fillParent = true;

		fixture.setStretchMinorAxisToParent(fillParent);

		// add additional test code here
	}

	/**
	 * Run the void setVerticalAlignment(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetVerticalAlignment_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		int align = 1;

		fixture.setVerticalAlignment(align);

		// add additional test code here
	}

	/**
	 * Run the void setVerticalSpacing(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetVerticalSpacing_1()
		throws Exception {
		AlignedFlowLayout fixture = new AlignedFlowLayout();
		fixture.setSecondaryAlignment(1);
		fixture.setHorizontalAlignment(1);
		fixture.setHorizontal(true);
		fixture.setVerticalAlignment(1);
		fixture.setHorizontalSpacing(1);
		fixture.setVerticalSpacing(1);
		fixture.setStretchMinorAxisToParent(true);
		fixture.setStretchMinorAxis(true);
		fixture.transposer = new Transposer();
		int n = 1;

		fixture.setVerticalSpacing(n);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
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
	 * @generatedBy CodePro at 14/10/19 22:32
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
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AlignedFlowLayoutTest.class);
	}
}