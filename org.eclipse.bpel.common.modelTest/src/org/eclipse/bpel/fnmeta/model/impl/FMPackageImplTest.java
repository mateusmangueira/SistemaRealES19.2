package org.eclipse.bpel.fnmeta.model.impl;

import org.eclipse.bpel.fnmeta.model.FMFactory;
import org.eclipse.bpel.fnmeta.model.FMPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FMPackageImplTest</code> contains tests for the class <code>{@link FMPackageImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FMPackageImplTest {
	/**
	 * Run the FMPackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_1()
		throws Exception {

		FMPackage result = FMPackageImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals("fnmeta", result.getNsPrefix());
		assertEquals("http://eclipse.org/bpel/ns/function-meta", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("model", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the FMPackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_2()
		throws Exception {

		FMPackage result = FMPackageImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals("fnmeta", result.getNsPrefix());
		assertEquals("http://eclipse.org/bpel/ns/function-meta", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("model", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the FMPackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_3()
		throws Exception {

		FMPackage result = FMPackageImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals("fnmeta", result.getNsPrefix());
		assertEquals("http://eclipse.org/bpel/ns/function-meta", result.getNsURI());
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
		new org.junit.runner.JUnitCore().run(FMPackageImplTest.class);
	}
}