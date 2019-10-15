package org.eclipse.bpel.common.extension.model.adapters.impl;

import org.eclipse.bpel.common.extension.model.Extension;
import org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl;
import org.eclipse.bpel.common.extension.model.notify.impl.ExtensionModelNotificationImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtendedObjectAdapterImplTest</code> contains tests for the class <code>{@link ExtendedObjectAdapterImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtendedObjectAdapterImplTest {
	/**
	 * Run the ExtendedObjectAdapterImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testExtendedObjectAdapterImpl_1()
		throws Exception {

		ExtendedObjectAdapterImpl result = new ExtendedObjectAdapterImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtension());
		assertEquals(null, result.getNamespace());
		assertEquals(null, result.getExtensionObject());
		assertEquals(null, result.getTarget());
	}

	/**
	 * Run the Extension getExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetExtension_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);

		Extension result = fixture.getExtension();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EObject getExtensionObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetExtensionObject_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);

		EObject result = fixture.getExtensionObject();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EObject getExtensionObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetExtensionObject_2()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);

		EObject result = fixture.getExtensionObject();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String getNamespace() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetNamespace_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);

		String result = fixture.getNamespace();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the boolean isAdapterForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testIsAdapterForType_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testIsAdapterForType_2()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testNotifyChanged_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
	}

	/**
	 * Run the void setExtension(Extension) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetExtension_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);
		Extension extension = null;

		fixture.setExtension(extension);

		// add additional test code here
	}

	/**
	 * Run the void setNamespace(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testSetNamespace_1()
		throws Exception {
		ExtendedObjectAdapterImpl fixture = new ExtendedObjectAdapterImpl();
		fixture.setNamespace("");
		fixture.setExtension((Extension) null);
		String namespace = "";

		fixture.setNamespace(namespace);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
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
	 * @generatedBy CodePro at 14/10/19 22:13
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
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ExtendedObjectAdapterImplTest.class);
	}
}