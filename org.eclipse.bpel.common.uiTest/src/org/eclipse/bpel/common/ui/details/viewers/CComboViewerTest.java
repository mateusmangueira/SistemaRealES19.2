package org.eclipse.bpel.common.ui.details.viewers;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.bpel.common.ui.ResourceMarkerDecorator;
import org.eclipse.bpel.common.ui.calendar.DatePicker;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Widget;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CComboViewerTest</code> contains tests for the class <code>{@link CComboViewer}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class CComboViewerTest {
	/**
	 * Run the CComboViewer(CCombo) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testCComboViewer_1()
		throws Exception {
		CCombo curCombo = new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1);

		CComboViewer result = new CComboViewer(curCombo);

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
	 * Run the CComboViewer(Composite) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testCComboViewer_2()
		throws Exception {
		Composite parent = new Composite(new Composite((Composite) null, 0), 1);

		CComboViewer result = new CComboViewer(parent);

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
	 * Run the CComboViewer(Composite,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testCComboViewer_3()
		throws Exception {
		Composite parent = new Composite(new Composite((Composite) null, 0), 1);
		int style = 1;

		CComboViewer result = new CComboViewer(parent, style);

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
	 * Run the void add(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.add(element);

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
	 * Run the void add(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object[] elements = new Object[] {};

		fixture.add(elements);

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
	 * Run the void add(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object[] elements = new Object[] {};

		fixture.add(elements);

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
	 * Run the Widget doFindInputItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoFindInputItem_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		Widget result = fixture.doFindInputItem(element);

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
	 * Run the Widget doFindInputItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoFindInputItem_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = null;

		Widget result = fixture.doFindInputItem(element);

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
	 * Run the Widget doFindInputItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoFindInputItem_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		Widget result = fixture.doFindInputItem(element);

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
	 * Run the Widget doFindItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoFindItem_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		Widget result = fixture.doFindItem(element);

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
	 * Run the Widget doFindItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoFindItem_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		Widget result = fixture.doFindItem(element);

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
	 * Run the Widget doFindItem(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoFindItem_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = null;

		Widget result = fixture.doFindItem(element);

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
	 * Run the void doUpdateItem(Widget,Object,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoUpdateItem_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Widget data = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		Object element = new Object();
		boolean fullMap = true;

		fixture.doUpdateItem(data, element, fullMap);

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
	 * Run the void doUpdateItem(Widget,Object,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoUpdateItem_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Widget data = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		Object element = new Object();
		boolean fullMap = true;

		fixture.doUpdateItem(data, element, fullMap);

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
	 * Run the void doUpdateItem(Widget,Object,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testDoUpdateItem_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Widget data = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		Object element = null;
		boolean fullMap = true;

		fixture.doUpdateItem(data, element, fullMap);

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
	 * Run the CCombo getCCombo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetCCombo_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));

		CCombo result = fixture.getCCombo();

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
	 * Run the Control getControl() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetControl_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));

		Control result = fixture.getControl();

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
	 * Run the Object getElementAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetElementAt_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		int index = 1;

		Object result = fixture.getElementAt(index);

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
	 * Run the Object getElementAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetElementAt_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		int index = -1;

		Object result = fixture.getElementAt(index);

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
	 * Run the Object getElementAt(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetElementAt_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		int index = 1;

		Object result = fixture.getElementAt(index);

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
	 * Run the IBaseLabelProvider getLabelProvider() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetLabelProvider_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));

		IBaseLabelProvider result = fixture.getLabelProvider();

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
	 * Run the List<Object> getSelectionFromWidget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetSelectionFromWidget_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));

		List<Object> result = fixture.getSelectionFromWidget();

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
	 * Run the List<Object> getSelectionFromWidget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetSelectionFromWidget_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));

		List<Object> result = fixture.getSelectionFromWidget();

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
	 * Run the List<Object> getSelectionFromWidget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetSelectionFromWidget_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));

		List<Object> result = fixture.getSelectionFromWidget();

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
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_4()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_5()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_6()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the int indexForElement(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testIndexForElement_7()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		int result = fixture.indexForElement(element);

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
		assertEquals(0, result);
	}

	/**
	 * Run the void inputChanged(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInputChanged_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object input = new Object();
		Object oldInput = new Object();

		fixture.inputChanged(input, oldInput);

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
	 * Run the void inputChanged(Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInputChanged_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object input = new Object();
		Object oldInput = new Object();

		fixture.inputChanged(input, oldInput);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.internalRefresh(element);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = null;

		fixture.internalRefresh(element);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.internalRefresh(element);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_4()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = null;

		fixture.internalRefresh(element);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_5()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.internalRefresh(element);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_6()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = null;

		fixture.internalRefresh(element);

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
	 * Run the void internalRefresh(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testInternalRefresh_7()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.internalRefresh(element);

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
	 * Run the void remove(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.remove(element);

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
	 * Run the void remove(Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object[] elements = new Object[] {};

		fixture.remove(elements);

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
	 * Run the void reveal(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testReveal_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		Object element = new Object();

		fixture.reveal(element);

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
	 * Run the void setLabelProvider(IBaseLabelProvider) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetLabelProvider_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		IBaseLabelProvider labelProvider = new ResourceMarkerDecorator();

		fixture.setLabelProvider(labelProvider);

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
	 * Run the void setSelectionNoNotify(ISelection,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionNoNotify_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		ISelection selection = TreeSelection.EMPTY;
		boolean reveal = true;

		fixture.setSelectionNoNotify(selection, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_1()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_2()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_3()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_4()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_5()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_6()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_7()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_8()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_9()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_10()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_11()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_12()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_13()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = null;
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
	 * Run the void setSelectionToWidget(List,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testSetSelectionToWidget_14()
		throws Exception {
		CComboViewer fixture = new CComboViewer(new CCombo(new Composite(new Composite((Composite) null, 0), 1), 1));
		List in = new ArrayList();
		boolean reveal = true;

		fixture.setSelectionToWidget(in, reveal);

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
		new org.junit.runner.JUnitCore().run(CComboViewerTest.class);
	}
}