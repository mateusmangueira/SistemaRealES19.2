package org.eclipse.bpel.common.ui.command;

import org.eclipse.bpel.common.ui.details.IOngoingChange;
import org.eclipse.bpel.common.ui.editmodel.EditModelCommandStack;
import org.eclipse.bpel.common.ui.editmodel.PlaceHolderCommand;
import org.eclipse.gef.commands.Command;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EditModelCommandFrameworkTest</code> contains tests for the class <code>{@link EditModelCommandFramework}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class EditModelCommandFrameworkTest {
	/**
	 * Run the EditModelCommandFramework(EditModelCommandStack) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testEditModelCommandFramework_1()
		throws Exception {
		EditModelCommandStack editModelCommandStack = new EditModelCommandStack();

		EditModelCommandFramework result = new EditModelCommandFramework(editModelCommandStack);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void abortCurrentChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testAbortCurrentChange_1()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;

		fixture.abortCurrentChange();

		// add additional test code here
	}

	/**
	 * Run the void applyCurrentChange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testApplyCurrentChange_1()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;

		fixture.applyCurrentChange();

		// add additional test code here
	}

	/**
	 * Run the void execute(Command) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		Command command = new PlaceHolderCommand("");

		fixture.execute(command);

		// add additional test code here
	}

	/**
	 * Run the void finishCurrentChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFinishCurrentChange_1()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		boolean changeUndone = true;

		fixture.finishCurrentChange(changeUndone);

		// add additional test code here
	}

	/**
	 * Run the void finishCurrentChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFinishCurrentChange_2()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		boolean changeUndone = true;

		fixture.finishCurrentChange(changeUndone);

		// add additional test code here
	}

	/**
	 * Run the void finishCurrentChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFinishCurrentChange_3()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = false;
		fixture.fCurrentChange = null;
		boolean changeUndone = true;

		fixture.finishCurrentChange(changeUndone);

		// add additional test code here
	}

	/**
	 * Run the void finishCurrentChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFinishCurrentChange_4()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = false;
		fixture.fCurrentChange = null;
		boolean changeUndone = true;

		fixture.finishCurrentChange(changeUndone);

		// add additional test code here
	}

	/**
	 * Run the void finishCurrentChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFinishCurrentChange_5()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = false;
		fixture.fCurrentChange = null;
		boolean changeUndone = false;

		fixture.finishCurrentChange(changeUndone);

		// add additional test code here
	}

	/**
	 * Run the void finishCurrentChange(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFinishCurrentChange_6()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = false;
		fixture.fCurrentChange = null;
		boolean changeUndone = true;

		fixture.finishCurrentChange(changeUndone);

		// add additional test code here
	}

	/**
	 * Run the void notifyChangeDone(IOngoingChange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNotifyChangeDone_1()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		IOngoingChange ongoingChange = null;

		fixture.notifyChangeDone(ongoingChange);

		// add additional test code here
	}

	/**
	 * Run the void notifyChangeDone(IOngoingChange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNotifyChangeDone_2()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		IOngoingChange ongoingChange = null;

		fixture.notifyChangeDone(ongoingChange);

		// add additional test code here
	}

	/**
	 * Run the void notifyChangeInProgress(IOngoingChange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNotifyChangeInProgress_1()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		IOngoingChange ongoingChange = null;

		fixture.notifyChangeInProgress(ongoingChange);

		// add additional test code here
	}

	/**
	 * Run the void notifyChangeInProgress(IOngoingChange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNotifyChangeInProgress_2()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		IOngoingChange ongoingChange = null;

		fixture.notifyChangeInProgress(ongoingChange);

		// add additional test code here
	}

	/**
	 * Run the void notifyChangeInProgress(IOngoingChange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testNotifyChangeInProgress_3()
		throws Exception {
		EditModelCommandFramework fixture = new EditModelCommandFramework(new EditModelCommandStack());
		fixture.fIgnoreEvents = true;
		fixture.fCurrentChange = null;
		IOngoingChange ongoingChange = null;

		fixture.notifyChangeInProgress(ongoingChange);

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
		new org.junit.runner.JUnitCore().run(EditModelCommandFrameworkTest.class);
	}
}