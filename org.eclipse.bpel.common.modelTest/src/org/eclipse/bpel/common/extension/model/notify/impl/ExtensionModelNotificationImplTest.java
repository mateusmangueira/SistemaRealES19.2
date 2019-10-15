package org.eclipse.bpel.common.extension.model.notify.impl;

import org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtensionModelNotificationImplTest</code> contains tests for the class <code>{@link ExtensionModelNotificationImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtensionModelNotificationImplTest {
	/**
	 * Run the ExtensionModelNotificationImpl(EObject,int,int,Object,Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testExtensionModelNotificationImpl_1()
		throws Exception {
		EObject notifier = new ExtensionmodelFactoryImpl();
		int eventType = 1;
		int featureID = 1;
		Object arg1 = new Object();
		Object arg2 = new Object();

		ExtensionModelNotificationImpl result = new ExtensionModelNotificationImpl(notifier, eventType, featureID, arg1, arg2);

		// add additional test code here
		assertNotNull(result);
		assertEquals(new Object(), result.getArg1());
		assertEquals(new Object(), result.getArg2());
		assertEquals(-1, result.getPosition());
		assertEquals(1, result.getEventType());
		assertEquals(null, result.getFeature());
		assertEquals(null, result.getNewValue());
		assertEquals(null, result.getOldValue());
		assertEquals(null, result.getNewStringValue());
		assertEquals(null, result.getOldStringValue());
		assertEquals(true, result.isReset());
		assertEquals(true, result.isTouch());
		assertEquals(false, result.wasSet());
	}

	/**
	 * Run the Object getArg1() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetArg1_1()
		throws Exception {
		ExtensionModelNotificationImpl fixture = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		Object result = fixture.getArg1();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getArg2() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetArg2_1()
		throws Exception {
		ExtensionModelNotificationImpl fixture = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		Object result = fixture.getArg2();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getFeatureID(Class) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetFeatureID_1()
		throws Exception {
		ExtensionModelNotificationImpl fixture = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());
		Class expectedClass = Object.class;

		int result = fixture.getFeatureID(expectedClass);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Object getNotifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetNotifier_1()
		throws Exception {
		ExtensionModelNotificationImpl fixture = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		Object result = fixture.getNotifier();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(ExtensionModelNotificationImplTest.class);
	}
}