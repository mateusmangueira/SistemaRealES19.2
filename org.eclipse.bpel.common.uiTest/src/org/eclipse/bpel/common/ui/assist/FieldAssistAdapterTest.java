package org.eclipse.bpel.common.ui.assist;

import org.eclipse.bpel.common.ui.calendar.DatePicker;
import org.eclipse.jface.fieldassist.ComboContentAdapter;
import org.eclipse.jface.fieldassist.IContentProposalProvider;
import org.eclipse.jface.fieldassist.IControlContentAdapter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FieldAssistAdapterTest</code> contains tests for the class <code>{@link FieldAssistAdapter}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:32
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FieldAssistAdapterTest {
	/**
	 * Run the FieldAssistAdapter(Control,IControlContentAdapter,IContentProposalProvider,String,char[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testFieldAssistAdapter_1()
		throws Exception {
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		IControlContentAdapter controlContentAdapter = new ComboContentAdapter();
		IContentProposalProvider proposalProvider = null;
		String commandId = "";
		char[] autoActivationCharacters = new char[] {};

		FieldAssistAdapter result = new FieldAssistAdapter(control, controlContentAdapter, proposalProvider, commandId, autoActivationCharacters);

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
	 * Run the FieldAssistAdapter(Control,IControlContentAdapter,IContentProposalProvider,String,char[],boolean) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testFieldAssistAdapter_2()
		throws Exception {
		Control control = new DatePicker(new Composite(new Composite((Composite) null, 0), 1));
		IControlContentAdapter controlContentAdapter = new ComboContentAdapter();
		IContentProposalProvider proposalProvider = null;
		String commandId = "";
		char[] autoActivationCharacters = new char[] {};
		boolean installDecoration = true;

		FieldAssistAdapter result = new FieldAssistAdapter(control, controlContentAdapter, proposalProvider, commandId, autoActivationCharacters, installDecoration);

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
	 * Run the int getProposalWidth() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testGetProposalWidth_1()
		throws Exception {
		FieldAssistAdapter fixture = new FieldAssistAdapter(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), new ComboContentAdapter(), (IContentProposalProvider) null, "", new char[] {});

		int result = fixture.getProposalWidth();

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
	 * Run the void openProposalPopup() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenProposalPopup_1()
		throws Exception {
		FieldAssistAdapter fixture = new FieldAssistAdapter(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), new ComboContentAdapter(), (IContentProposalProvider) null, "", new char[] {});

		fixture.openProposalPopup();

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
	 * Run the void openProposals() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:32
	 */
	@Test
	public void testOpenProposals_1()
		throws Exception {
		FieldAssistAdapter fixture = new FieldAssistAdapter(new DatePicker(new Composite(new Composite((Composite) null, 0), 1)), new ComboContentAdapter(), (IContentProposalProvider) null, "", new char[] {});

		fixture.openProposals();

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
		new org.junit.runner.JUnitCore().run(FieldAssistAdapterTest.class);
	}
}