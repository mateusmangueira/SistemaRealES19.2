package org.eclipse.bpel.common.extension.model.adapters.impl;

import org.eclipse.bpel.common.extension.model.ExtensionMap;
import org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl;
import org.eclipse.bpel.common.extension.model.notify.impl.ExtensionModelNotificationImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtendedObjectUserAdapterImplTest</code> contains tests for the class <code>{@link ExtendedObjectUserAdapterImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:12
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtendedObjectUserAdapterImplTest {
	/**
	 * Run the ExtendedObjectUserAdapterImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testExtendedObjectUserAdapterImpl_1()
		throws Exception {

		ExtendedObjectUserAdapterImpl result = new ExtendedObjectUserAdapterImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTarget());
	}

	/**
	 * Run the Object get(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGet_1()
		throws Exception {
		ExtendedObjectUserAdapterImpl fixture = new ExtendedObjectUserAdapterImpl();
		fixture.setExtensionMap((ExtensionMap) null);
		Object extendedObject = new Object();

		Object result = fixture.get(extendedObject);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNamespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetNamespace_1()
		throws Exception {
		ExtendedObjectUserAdapterImpl fixture = new ExtendedObjectUserAdapterImpl();
		fixture.setExtensionMap((ExtensionMap) null);

		String result = fixture.getNamespace();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtendedObjectUserAdapterImpl.getNamespace(ExtendedObjectUserAdapterImpl.java:62)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isAdapterForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testIsAdapterForType_1()
		throws Exception {
		ExtendedObjectUserAdapterImpl fixture = new ExtendedObjectUserAdapterImpl();
		fixture.setExtensionMap((ExtensionMap) null);
		Object type = Object.class;

		boolean result = fixture.isAdapterForType(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isAdapterForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testIsAdapterForType_2()
		throws Exception {
		ExtendedObjectUserAdapterImpl fixture = new ExtendedObjectUserAdapterImpl();
		fixture.setExtensionMap((ExtensionMap) null);
		Object type = new Object();

		boolean result = fixture.isAdapterForType(type);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_1()
		throws Exception {
		ExtendedObjectUserAdapterImpl fixture = new ExtendedObjectUserAdapterImpl();
		fixture.setExtensionMap((ExtensionMap) null);
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionMap(ExtensionMap) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionMap_1()
		throws Exception {
		ExtendedObjectUserAdapterImpl fixture = new ExtendedObjectUserAdapterImpl();
		fixture.setExtensionMap((ExtensionMap) null);
		ExtensionMap extensionMap = null;

		fixture.setExtensionMap(extensionMap);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
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
	 * @generatedBy CodePro at 14/10/19 22:12
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
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExtendedObjectUserAdapterImplTest.class);
	}
}