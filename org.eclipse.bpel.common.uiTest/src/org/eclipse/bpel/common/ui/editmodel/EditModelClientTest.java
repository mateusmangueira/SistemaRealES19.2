package org.eclipse.bpel.common.ui.editmodel;

import java.util.Map;
import org.eclipse.bpel.model.adapters.BasicEObjectaAdapter;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.internal.ide.dialogs.WelcomeEditor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>EditModelClientTest</code> contains tests for the class <code>{@link EditModelClient}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class EditModelClientTest {
	/**
	 * Run the EditModelClient(IEditorPart,IEditModelListener) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testEditModelClient_1()
		throws Exception {
		IEditorPart editor = new WelcomeEditor();
		IEditModelListener modelListener = null;

		EditModelClient result = new EditModelClient(editor, modelListener);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getEditModel());
		assertEquals(null, result.getPrimaryResourceInfo());
	}

	/**
	 * Run the void close() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testClose_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);

		fixture.close();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.close(EditModelClient.java:127)
	}

	/**
	 * Run the EditModelCommandStack createCommandStack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCreateCommandStack_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);

		EditModelCommandStack result = fixture.createCommandStack();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isDirty());
		assertEquals(false, result.canUndo());
		assertEquals(false, result.canRedo());
		assertEquals(null, result.getRedoCommand());
		assertEquals(null, result.getUndoCommand());
		assertEquals(0, result.getUndoLimit());
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.dispose(EditModelClient.java:109)
	}

	/**
	 * Run the EditModelCommandStack getCommandStack() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetCommandStack_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);

		EditModelCommandStack result = fixture.getCommandStack();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.getCommandStack(EditModelClient.java:87)
		assertNotNull(result);
	}

	/**
	 * Run the EditModel getEditModel() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetEditModel_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);

		EditModel result = fixture.getEditModel();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ResourceInfo getPrimaryResourceInfo() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetPrimaryResourceInfo_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);

		ResourceInfo result = fixture.getPrimaryResourceInfo();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EditModel getSharedResourceSet(IFile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetSharedResourceSet_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile file = null;

		EditModel result = fixture.getSharedResourceSet(file);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCommandStack());
		assertEquals(null, result.getPrimaryFile());
	}

	/**
	 * Run the void loadPrimaryResource(IFile,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testLoadPrimaryResource_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile file = null;
		Map loadOptions = new BasicEObjectaAdapter();

		fixture.loadPrimaryResource(file, loadOptions);

		// add additional test code here
	}

	/**
	 * Run the void loadPrimaryResource(IFile,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testLoadPrimaryResource_2()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile file = null;
		Map loadOptions = new BasicEObjectaAdapter();

		fixture.loadPrimaryResource(file, loadOptions);

		// add additional test code here
	}

	/**
	 * Run the void loadPrimaryResource(IFile,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testLoadPrimaryResource_3()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile file = null;
		Map loadOptions = null;

		fixture.loadPrimaryResource(file, loadOptions);

		// add additional test code here
	}

	/**
	 * Run the void loadPrimaryResource(IFile,Map) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testLoadPrimaryResource_4()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile file = null;
		Map loadOptions = null;

		fixture.loadPrimaryResource(file, loadOptions);

		// add additional test code here
	}

	/**
	 * Run the boolean saveAll(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSaveAll_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IProgressMonitor progressMonitor = new NullProgressMonitor();

		boolean result = fixture.saveAll(progressMonitor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.saveAll(EditModelClient.java:117)
		assertTrue(result);
	}

	/**
	 * Run the boolean saveAll(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSaveAll_2()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IProgressMonitor progressMonitor = new NullProgressMonitor();

		boolean result = fixture.saveAll(progressMonitor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.saveAll(EditModelClient.java:117)
		assertTrue(result);
	}

	/**
	 * Run the boolean savePrimaryResourceAs(IFile,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSavePrimaryResourceAs_1()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile savedFile = null;
		IProgressMonitor progressMonitor = new NullProgressMonitor();

		boolean result = fixture.savePrimaryResourceAs(savedFile, progressMonitor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.savePrimaryResourceAs(EditModelClient.java:124)
		assertTrue(result);
	}

	/**
	 * Run the boolean savePrimaryResourceAs(IFile,IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testSavePrimaryResourceAs_2()
		throws Exception {
		EditModelClient fixture = new EditModelClient(new WelcomeEditor(), (IEditModelListener) null);
		IFile savedFile = null;
		IProgressMonitor progressMonitor = new NullProgressMonitor();

		boolean result = fixture.savePrimaryResourceAs(savedFile, progressMonitor);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.editmodel.EditModelClient.savePrimaryResourceAs(EditModelClient.java:124)
		assertTrue(result);
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
		new org.junit.runner.JUnitCore().run(EditModelClientTest.class);
	}
}