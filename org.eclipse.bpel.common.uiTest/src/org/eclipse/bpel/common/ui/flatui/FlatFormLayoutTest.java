package org.eclipse.bpel.common.ui.flatui;

import org.eclipse.bpel.common.ui.calendar.DatePicker;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FlatFormLayoutTest</code> contains tests for the class <code>{@link FlatFormLayout}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:28
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FlatFormLayoutTest {
	/**
	 * Run the FlatFormLayout() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testFlatFormLayout_1()
		throws Exception {

		FlatFormLayout result = new FlatFormLayout();

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormLayout {}", result.toString());
	}

	/**
	 * Run the int computeHeight(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeHeight_1()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeHeight(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeHeight(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeHeight_2()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeHeight(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeHeight(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeHeight_3()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeHeight(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeHeight(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeHeight_4()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeHeight(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeHeight(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeHeight_5()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();
		data.cacheHeight = 1;

		int result = fixture.computeHeight(data);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Point computeSize(Composite,int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeSize_1()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Composite composite = new Composite(new Composite((Composite) null, 0), 1);
		int wHint = 1;
		int hHint = 1;
		boolean flushCache = true;

		Point result = fixture.computeSize(composite, wHint, hHint, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the int computeWidth(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeWidth_1()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeWidth(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeWidth(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeWidth_2()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeWidth(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeWidth(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeWidth_3()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeWidth(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeWidth(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeWidth_4()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();

		int result = fixture.computeWidth(data);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int computeWidth(FlatFormData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testComputeWidth_5()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		FlatFormData data = new FlatFormData();
		data.cacheWidth = 1;

		int result = fixture.computeWidth(data);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Point getSize(Control,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetSize_1()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		boolean flushCache = true;

		Point result = fixture.getSize(control, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Point getSize(Control,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetSize_2()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		boolean flushCache = true;

		Point result = fixture.getSize(control, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the void layout(Composite,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLayout_1()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Composite composite = new Composite(new Composite((Composite) null, 0), 1);
		boolean flushCache = true;

		fixture.layout(composite, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
	}

	/**
	 * Run the Point layout(Composite,boolean,int,int,int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLayout_2()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Composite composite = new Composite(new Composite((Composite) null, 0), 1);
		boolean move = false;
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;
		boolean flushCache = true;

		Point result = fixture.layout(composite, move, x, y, width, height, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Point layout(Composite,boolean,int,int,int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLayout_3()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Composite composite = new Composite(new Composite((Composite) null, 0), 1);
		boolean move = true;
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;
		boolean flushCache = true;

		Point result = fixture.layout(composite, move, x, y, width, height, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Point layout(Composite,boolean,int,int,int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLayout_4()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Composite composite = new Composite(new Composite((Composite) null, 0), 1);
		boolean move = true;
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;
		boolean flushCache = true;

		Point result = fixture.layout(composite, move, x, y, width, height, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the Point layout(Composite,boolean,int,int,int,int,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLayout_5()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 1;
		Composite composite = new Composite(new Composite((Composite) null, 0), 1);
		boolean move = true;
		int x = 1;
		int y = 1;
		int width = 1;
		int height = 1;
		boolean flushCache = true;

		Point result = fixture.layout(composite, move, x, y, width, height, flushCache);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:482)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:291)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:158)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:110)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:82)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:96)
		assertNotNull(result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 0;
		fixture.marginHeight = 1;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormLayout {marginHeight=1}", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testToString_2()
		throws Exception {
		FlatFormLayout fixture = new FlatFormLayout();
		fixture.marginWidth = 1;
		fixture.marginHeight = 0;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormLayout {marginWidth=1}", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
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
	 * @generatedBy CodePro at 14/10/19 22:28
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
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FlatFormLayoutTest.class);
	}
}