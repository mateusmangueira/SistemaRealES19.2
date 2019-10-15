package org.eclipse.bpel.common.ui.flatui;

import org.eclipse.bpel.common.ui.calendar.DatePicker;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FlatFormDataTest</code> contains tests for the class <code>{@link FlatFormData}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FlatFormDataTest {
	/**
	 * Run the FlatFormData() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testFlatFormData_1()
		throws Exception {

		FlatFormData result = new FlatFormData();

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormData {w=-1 h=-1}", result.toString());
	}

	/**
	 * Run the FlatFormData(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testFlatFormData_2()
		throws Exception {
		int width = 1;
		int height = 1;

		FlatFormData result = new FlatFormData(width, height);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormData {w=1 h=1}", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_1()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = true;

		FlatFormAttachment result = fixture.getBottomAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_2()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = null;
		fixture.top = null;
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getBottomAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_3()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = null;
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getBottomAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (1/100)x + 2", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_4()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment((Control) null, 1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getBottomAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_5()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1024);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getBottomAttachment();

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
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_6()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 16777216);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getBottomAttachment();

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
	 * Run the FlatFormAttachment getBottomAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetBottomAttachment_7()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getBottomAttachment();

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
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_1()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = true;

		FlatFormAttachment result = fixture.getLeftAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_2()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = null;
		fixture.cacheWidth = 1;
		fixture.right = null;
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getLeftAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_3()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = null;
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getLeftAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (1/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_4()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment((Control) null, 1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getLeftAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_5()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 16384);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getLeftAttachment();

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
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_6()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 16777216);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getLeftAttachment();

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
	 * Run the FlatFormAttachment getLeftAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLeftAttachment_7()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getLeftAttachment();

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
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_1()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = true;

		FlatFormAttachment result = fixture.getRightAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_2()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = null;
		fixture.cacheWidth = 1;
		fixture.right = null;
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getRightAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_3()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = null;
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getRightAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (1/100)x + 2", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_4()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment((Control) null, 1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getRightAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_5()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 131072);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getRightAttachment();

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
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_6()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 16777216);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getRightAttachment();

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
	 * Run the FlatFormAttachment getRightAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetRightAttachment_7()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getRightAttachment();

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
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_1()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = true;

		FlatFormAttachment result = fixture.getTopAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_2()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = null;
		fixture.top = null;
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getTopAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_3()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = null;
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getTopAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (1/100)x + 0", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_4()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment((Control) null, 1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getTopAttachment();

		// add additional test code here
		assertNotNull(result);
		assertEquals("y = (0/100)x + 1", result.toString());
	}

	/**
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_5()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 128);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getTopAttachment();

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
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_6()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 16777216);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getTopAttachment();

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
	 * Run the FlatFormAttachment getTopAttachment() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetTopAttachment_7()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), 1, 1);
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = false;

		FlatFormAttachment result = fixture.getTopAttachment();

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
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testToString_1()
		throws Exception {
		FlatFormData fixture = new FlatFormData(0, 0);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = new FlatFormAttachment(1, 1);
		fixture.top = new FlatFormAttachment(1, 1);
		fixture.left = null;
		fixture.cacheWidth = 1;
		fixture.right = new FlatFormAttachment(1, 1);
		fixture.isVisited = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormData {R=(y = (1/100)x + 1) T=(y = (1/100)x + 1) B=(y = (1/100)x + 1)}", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testToString_2()
		throws Exception {
		FlatFormData fixture = new FlatFormData(1, 1);
		fixture.cacheHeight = 1;
		fixture.borderType = 1;
		fixture.bottom = null;
		fixture.top = null;
		fixture.left = new FlatFormAttachment(1, 1);
		fixture.cacheWidth = 1;
		fixture.right = null;
		fixture.isVisited = true;

		String result = fixture.toString();

		// add additional test code here
		assertEquals("org.eclipse.bpel.common.ui.flatui.FlatFormData {w=1 h=1 L=(y = (1/100)x + 1)}", result);
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
		new org.junit.runner.JUnitCore().run(FlatFormDataTest.class);
	}
}