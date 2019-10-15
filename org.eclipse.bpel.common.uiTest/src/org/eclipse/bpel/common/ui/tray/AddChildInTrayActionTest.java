package org.eclipse.bpel.common.ui.tray;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.internal.ide.dialogs.WelcomeEditor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AddChildInTrayActionTest</code> contains tests for the class <code>{@link AddChildInTrayAction}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class AddChildInTrayActionTest {
	/**
	 * Run the AddChildInTrayAction(IWorkbenchPart,Class,String,ImageDescriptor) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testAddChildInTrayAction_1()
		throws Exception {
		IWorkbenchPart part = new WelcomeEditor();
		Class clazz = Object.class;
		String label = "";
		ImageDescriptor icon = ImageDescriptor.getMissingImageDescriptor();

		AddChildInTrayAction result = new AddChildInTrayAction(part, clazz, label, icon);

		// add additional test code here
		assertNotNull(result);
		assertEquals("org.eclipse.bpel.common.ui.tray.AddChildInTrayAction.class java.lang.Object", result.getId());
		assertEquals(false, result.isEnabled());
		assertEquals("", result.getText());
		assertEquals("", result.getDescription());
		assertEquals(false, result.isChecked());
		assertEquals(0, result.getAccelerator());
		assertEquals(null, result.getHelpListener());
		assertEquals(null, result.getMenuCreator());
		assertEquals(null, result.getHoverImageDescriptor());
		assertEquals(1, result.getStyle());
		assertEquals("", result.getToolTipText());
		assertEquals(true, result.isHandled());
		assertEquals(null, result.getActionDefinitionId());
		assertEquals(null, result.getDisabledImageDescriptor());
	}

	/**
	 * Run the boolean calculateEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateEnabled_1()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		boolean result = fixture.calculateEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean calculateEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateEnabled_2()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		boolean result = fixture.calculateEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean calculateEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateEnabled_3()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		boolean result = fixture.calculateEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean calculateEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateEnabled_4()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		boolean result = fixture.calculateEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean calculateEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateEnabled_5()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		boolean result = fixture.calculateEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean calculateEnabled() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateEnabled_6()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		boolean result = fixture.calculateEnabled();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String calculateId(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCalculateId_1()
		throws Exception {
		Class clazz = Object.class;

		String result = AddChildInTrayAction.calculateId(clazz);

		// add additional test code here
		assertEquals("org.eclipse.bpel.common.ui.tray.AddChildInTrayAction.class java.lang.Object", result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		String result = fixture.getId();

		// add additional test code here
		assertEquals("org.eclipse.bpel.common.ui.tray.AddChildInTrayAction.class java.lang.Object", result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRun_1()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		fixture.run();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRun_2()
		throws Exception {
		AddChildInTrayAction fixture = new AddChildInTrayAction(new WelcomeEditor(), Object.class, "", ImageDescriptor.getMissingImageDescriptor());
		fixture.target = null;

		fixture.run();

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
		new org.junit.runner.JUnitCore().run(AddChildInTrayActionTest.class);
	}
}