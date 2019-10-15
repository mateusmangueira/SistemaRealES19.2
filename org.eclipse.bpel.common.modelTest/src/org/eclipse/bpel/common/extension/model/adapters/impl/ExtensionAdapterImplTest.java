package org.eclipse.bpel.common.extension.model.adapters.impl;

import org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl;
import org.eclipse.bpel.common.extension.model.notify.impl.ExtensionModelNotificationImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtensionAdapterImplTest</code> contains tests for the class <code>{@link ExtensionAdapterImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:12
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtensionAdapterImplTest {
	/**
	 * Run the ExtensionAdapterImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testExtensionAdapterImpl_1()
		throws Exception {

		ExtensionAdapterImpl result = new ExtensionAdapterImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getTarget());
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
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
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
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
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
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_2()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_3()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_4()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_5()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_6()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_7()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_8()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_9()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_10()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_11()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_12()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_13()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_14()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_15()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
	}

	/**
	 * Run the void notifyChanged(Notification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testNotifyChanged_16()
		throws Exception {
		ExtensionAdapterImpl fixture = new ExtensionAdapterImpl();
		Notification notification = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		fixture.notifyChanged(notification);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl cannot be cast to org.eclipse.bpel.common.extension.model.Extension
		//       at org.eclipse.bpel.common.extension.model.adapters.impl.ExtensionAdapterImpl.notifyChanged(ExtensionAdapterImpl.java:46)
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
		new org.junit.runner.JUnitCore().run(ExtensionAdapterImplTest.class);
	}
}