package org.eclipse.bpel.common.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PolicyTest</code> contains tests for the class <code>{@link Policy}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:30
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class PolicyTest {
	/**
	 * Run the Policy() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testPolicy_1()
		throws Exception {

		Policy result = new Policy();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the IProgressMonitor monitorFor(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testMonitorFor_1()
		throws Exception {
		IProgressMonitor monitor = null;

		IProgressMonitor result = Policy.monitorFor(monitor);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor monitorFor(IProgressMonitor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testMonitorFor_2()
		throws Exception {
		IProgressMonitor monitor = new NullProgressMonitor();

		IProgressMonitor result = Policy.monitorFor(monitor);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor subMonitorFor(IProgressMonitor,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSubMonitorFor_1()
		throws Exception {
		IProgressMonitor monitor = null;
		int ticks = 1;

		IProgressMonitor result = Policy.subMonitorFor(monitor, ticks);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor subMonitorFor(IProgressMonitor,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSubMonitorFor_2()
		throws Exception {
		IProgressMonitor monitor = new NullProgressMonitor();
		int ticks = 1;

		IProgressMonitor result = Policy.subMonitorFor(monitor, ticks);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor subMonitorFor(IProgressMonitor,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSubMonitorFor_3()
		throws Exception {
		IProgressMonitor monitor = new NullProgressMonitor();
		int ticks = 1;

		IProgressMonitor result = Policy.subMonitorFor(monitor, ticks);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor subMonitorFor(IProgressMonitor,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSubMonitorFor_4()
		throws Exception {
		IProgressMonitor monitor = null;
		int ticks = 1;
		int style = 1;

		IProgressMonitor result = Policy.subMonitorFor(monitor, ticks, style);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor subMonitorFor(IProgressMonitor,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSubMonitorFor_5()
		throws Exception {
		IProgressMonitor monitor = new NullProgressMonitor();
		int ticks = 1;
		int style = 1;

		IProgressMonitor result = Policy.subMonitorFor(monitor, ticks, style);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Run the IProgressMonitor subMonitorFor(IProgressMonitor,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	@Test
	public void testSubMonitorFor_6()
		throws Exception {
		IProgressMonitor monitor = new NullProgressMonitor();
		int ticks = 1;
		int style = 1;

		IProgressMonitor result = Policy.subMonitorFor(monitor, ticks, style);

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isCanceled());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:30
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
	 * @generatedBy CodePro at 14/10/19 22:30
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
	 * @generatedBy CodePro at 14/10/19 22:30
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PolicyTest.class);
	}
}