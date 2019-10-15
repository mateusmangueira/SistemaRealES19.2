package org.eclipse.bpel.common.extension.model.impl;

import org.eclipse.bpel.common.extension.model.ExtensionmodelFactory;
import org.eclipse.bpel.common.extension.model.ExtensionmodelPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtensionmodelPackageImplTest</code> contains tests for the class <code>{@link ExtensionmodelPackageImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtensionmodelPackageImplTest {
	/**
	 * Run the ExtensionmodelPackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_1()
		throws Exception {

		ExtensionmodelPackage result = ExtensionmodelPackageImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals("extensionmodel", result.getNsPrefix());
		assertEquals("http:///extensionmodel.ecore", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("model", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the ExtensionmodelPackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_2()
		throws Exception {

		ExtensionmodelPackage result = ExtensionmodelPackageImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals("extensionmodel", result.getNsPrefix());
		assertEquals("http:///extensionmodel.ecore", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("model", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the ExtensionmodelPackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_3()
		throws Exception {

		ExtensionmodelPackage result = ExtensionmodelPackageImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals("extensionmodel", result.getNsPrefix());
		assertEquals("http:///extensionmodel.ecore", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("model", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
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
		new org.junit.runner.JUnitCore().run(ExtensionmodelPackageImplTest.class);
	}
}