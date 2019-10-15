package org.eclipse.bpel.common.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.osgi.internal.framework.BundleContextImpl;
import org.eclipse.osgi.internal.framework.EquinoxBundle;
import org.eclipse.osgi.internal.framework.EquinoxContainer;
import org.junit.*;
import static org.junit.Assert.*;
import org.osgi.framework.BundleContext;

/**
 * The class <code>CommonUIPluginTest</code> contains tests for the class <code>{@link CommonUIPlugin}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:28
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class CommonUIPluginTest {
	/**
	 * Run the CommonUIPlugin() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testCommonUIPlugin_1()
		throws Exception {

		CommonUIPlugin result = new CommonUIPlugin();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals(null, result.getDescriptor());
		assertEquals(null, result.getBundle());
		assertEquals(false, result.isDebugging());
	}

	/**
	 * Run the IStatus createErrorStatus(String,Exception,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testCreateErrorStatus_1()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();
		String message = "";
		Exception e = new Exception();
		boolean writeToLog = true;

		IStatus result = fixture.createErrorStatus(message, e, writeToLog);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.createErrorStatus(CommonUIPlugin.java:222)
		assertNotNull(result);
	}

	/**
	 * Run the IStatus createErrorStatus(String,Exception,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testCreateErrorStatus_2()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();
		String message = "";
		Exception e = new Exception();
		boolean writeToLog = false;

		IStatus result = fixture.createErrorStatus(message, e, writeToLog);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMessage());
		assertEquals(4, result.getSeverity());
		assertEquals(0, result.getCode());
		assertEquals("org.eclipse.bpel.common.ui", result.getPlugin());
		assertEquals(false, result.isOK());
		assertEquals(false, result.isMultiStatus());
	}

	/**
	 * Run the ColorRegistry getColorRegistry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorRegistry_1()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();

		ColorRegistry result = fixture.getColorRegistry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.core.runtime.AssertionFailedException: null argument:
		//       at org.eclipse.core.runtime.Assert.isNotNull(Assert.java:85)
		//       at org.eclipse.core.runtime.Assert.isNotNull(Assert.java:73)
		//       at org.eclipse.jface.resource.ColorRegistry.<init>(ColorRegistry.java:115)
		//       at org.eclipse.jface.resource.ColorRegistry.<init>(ColorRegistry.java:93)
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.getColorRegistry(CommonUIPlugin.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the ColorRegistry getColorRegistry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorRegistry_2()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();

		ColorRegistry result = fixture.getColorRegistry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.core.runtime.AssertionFailedException: null argument:
		//       at org.eclipse.core.runtime.Assert.isNotNull(Assert.java:85)
		//       at org.eclipse.core.runtime.Assert.isNotNull(Assert.java:73)
		//       at org.eclipse.jface.resource.ColorRegistry.<init>(ColorRegistry.java:115)
		//       at org.eclipse.jface.resource.ColorRegistry.<init>(ColorRegistry.java:93)
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.getColorRegistry(CommonUIPlugin.java:117)
		assertNotNull(result);
	}

	/**
	 * Run the IConfigurationElement[] getConfigurationElements(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetConfigurationElements_1()
		throws Exception {
		String extensionPointId = "";

		IConfigurationElement[] result = CommonUIPlugin.getConfigurationElements(extensionPointId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the IConfigurationElement[] getConfigurationElements(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetConfigurationElements_2()
		throws Exception {
		String extensionPointId = "";

		IConfigurationElement[] result = CommonUIPlugin.getConfigurationElements(extensionPointId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the IConfigurationElement[] getConfigurationElements(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetConfigurationElements_3()
		throws Exception {
		String extensionPointId = "";

		IConfigurationElement[] result = CommonUIPlugin.getConfigurationElements(extensionPointId);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the CommonUIPlugin getDefault() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetDefault_1()
		throws Exception {

		CommonUIPlugin result = CommonUIPlugin.getDefault();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ImageDescriptor getImageDescriptor(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetImageDescriptor_1()
		throws Exception {
		String path = "";

		ImageDescriptor result = CommonUIPlugin.getImageDescriptor(path);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ImageRegistry getImageRegistry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetImageRegistry_1()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();

		ImageRegistry result = fixture.getImageRegistry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.initializeImages(CommonUIPlugin.java:140)
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.getImageRegistry(CommonUIPlugin.java:106)
		assertNotNull(result);
	}

	/**
	 * Run the ImageRegistry getImageRegistry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetImageRegistry_2()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();

		ImageRegistry result = fixture.getImageRegistry();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.initializeImages(CommonUIPlugin.java:140)
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.getImageRegistry(CommonUIPlugin.java:106)
		assertNotNull(result);
	}

	/**
	 * Run the void log(Exception) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLog_1()
		throws Exception {
		Exception e = new Exception();

		CommonUIPlugin.log(e);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.log(CommonUIPlugin.java:240)
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.log(CommonUIPlugin.java:250)
	}

	/**
	 * Run the void log(Exception,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLog_2()
		throws Exception {
		Exception e = new Exception();
		int severity = 1;

		CommonUIPlugin.log(e, severity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.log(CommonUIPlugin.java:240)
	}

	/**
	 * Run the void log(Exception,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLog_3()
		throws Exception {
		Exception e = new Exception();
		int severity = 1;

		CommonUIPlugin.log(e, severity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.log(CommonUIPlugin.java:240)
	}

	/**
	 * Run the void log(Exception,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testLog_4()
		throws Exception {
		Exception e = new CoreException(Status.OK_STATUS);
		int severity = 1;

		CommonUIPlugin.log(e, severity);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.CommonUIPlugin.log(CommonUIPlugin.java:240)
	}

	/**
	 * Run the void start(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testStart_1()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();
		BundleContext context = new BundleContextImpl((EquinoxBundle) null, (EquinoxContainer) null);

		fixture.start(context);

		// add additional test code here
	}

	/**
	 * Run the void start(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testStart_2()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();
		BundleContext context = new BundleContextImpl((EquinoxBundle) null, (EquinoxContainer) null);

		fixture.start(context);

		// add additional test code here
	}

	/**
	 * Run the void stop(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testStop_1()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();
		BundleContext context = new BundleContextImpl((EquinoxBundle) null, (EquinoxContainer) null);

		fixture.stop(context);

		// add additional test code here
	}

	/**
	 * Run the void stop(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testStop_2()
		throws Exception {
		CommonUIPlugin fixture = new CommonUIPlugin();
		BundleContext context = new BundleContextImpl((EquinoxBundle) null, (EquinoxContainer) null);

		fixture.stop(context);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(CommonUIPluginTest.class);
	}
}