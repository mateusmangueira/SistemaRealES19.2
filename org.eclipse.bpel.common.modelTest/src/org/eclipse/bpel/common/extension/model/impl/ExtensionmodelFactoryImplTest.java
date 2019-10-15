package org.eclipse.bpel.common.extension.model.impl;

import org.eclipse.bpel.common.extension.model.Extension;
import org.eclipse.bpel.common.extension.model.ExtensionMap;
import org.eclipse.bpel.common.extension.model.ExtensionmodelPackage;
import org.eclipse.bpel.common.extension.model.adapters.impl.ExtendedObjectAdapterImpl;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtensionmodelFactoryImplTest</code> contains tests for the class <code>{@link ExtensionmodelFactoryImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:12
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtensionmodelFactoryImplTest {
	/**
	 * Run the ExtensionmodelFactoryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testExtensionmodelFactoryImpl_1()
		throws Exception {

		ExtensionmodelFactoryImpl result = new ExtensionmodelFactoryImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtensionmodelPackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eInternalContainer());
		assertEquals(0, result.eContainerFeatureID());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		assertEquals(null, result.eDirectResource());
		assertEquals(null, result.eProxyURI());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(null, result.eInternalResource());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eStore());
		assertEquals(false, result.eNotificationRequired());
	}

	/**
	 * Run the void adaptEObject(EObject,Adapter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testAdaptEObject_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject target = new ExtensionmodelFactoryImpl();
		Adapter adapter = new ExtendedObjectAdapterImpl();

		fixture.adaptEObject(target, adapter);

		// add additional test code here
	}

	/**
	 * Run the void adaptEObject(EObject,Adapter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testAdaptEObject_2()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject target = new ExtensionmodelFactoryImpl();
		Adapter adapter = new ExtendedObjectAdapterImpl();

		fixture.adaptEObject(target, adapter);

		// add additional test code here
	}

	/**
	 * Run the void adaptEObject(EObject,Adapter) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testAdaptEObject_3()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject target = new ExtensionmodelFactoryImpl();
		Adapter adapter = new ExtendedObjectAdapterImpl();

		fixture.adaptEObject(target, adapter);

		// add additional test code here
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.create(ExtensionmodelFactoryImpl.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.create(ExtensionmodelFactoryImpl.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreate_3()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.create(ExtensionmodelFactoryImpl.java:54)
		assertNotNull(result);
	}

	/**
	 * Run the Extension createExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreateExtension_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();

		Extension result = fixture.createExtension();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtensionObject());
		assertEquals(null, result.getExtendedObject());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the ExtensionMap createExtensionMap() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreateExtensionMap_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();

		ExtensionMap result = fixture.createExtensionMap();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ExtensionMap createExtensionMap(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreateExtensionMap_2()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";

		ExtensionMap result = fixture.createExtensionMap(namespace);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ExtensionMap createExtensionMapGen() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testCreateExtensionMapGen_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();

		ExtensionMap result = fixture.createExtensionMapGen();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the ExtensionMap findExtensionMap(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMap_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		ExtensionMap result = fixture.findExtensionMap(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMap(ExtensionmodelFactoryImpl.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the ExtensionMap findExtensionMap(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMap_2()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		ExtensionMap result = fixture.findExtensionMap(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMap(ExtensionmodelFactoryImpl.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the ExtensionMap findExtensionMap(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMap_3()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		ExtensionMap result = fixture.findExtensionMap(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMap(ExtensionmodelFactoryImpl.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the ExtensionMap findExtensionMap(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMap_4()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		ExtensionMap result = fixture.findExtensionMap(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMap(ExtensionmodelFactoryImpl.java:116)
		assertNotNull(result);
	}

	/**
	 * Run the EList findExtensionMaps(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMaps_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		EList result = fixture.findExtensionMaps(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMaps(ExtensionmodelFactoryImpl.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the EList findExtensionMaps(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMaps_2()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		EList result = fixture.findExtensionMaps(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMaps(ExtensionmodelFactoryImpl.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the EList findExtensionMaps(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMaps_3()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		EList result = fixture.findExtensionMaps(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMaps(ExtensionmodelFactoryImpl.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the EList findExtensionMaps(String,EList) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testFindExtensionMaps_4()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		String namespace = "";
		EList contents = null;

		EList result = fixture.findExtensionMaps(namespace, contents);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionmodelFactoryImpl.findExtensionMaps(ExtensionmodelFactoryImpl.java:191)
		assertNotNull(result);
	}

	/**
	 * Run the Adapter getExtensionAdapter(EObject,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtensionAdapter_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject extendedObject = new ExtensionmodelFactoryImpl();
		String namespace = "";

		Adapter result = fixture.getExtensionAdapter(extendedObject, namespace);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter getExtensionAdapter(EObject,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtensionAdapter_2()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject extendedObject = new ExtensionmodelFactoryImpl();
		String namespace = "";

		Adapter result = fixture.getExtensionAdapter(extendedObject, namespace);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter getExtensionAdapter(EObject,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtensionAdapter_3()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject extendedObject = new ExtensionmodelFactoryImpl();
		String namespace = "";

		Adapter result = fixture.getExtensionAdapter(extendedObject, namespace);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter getExtensionAdapter(EObject,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtensionAdapter_4()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();
		EObject extendedObject = new ExtensionmodelFactoryImpl();
		String namespace = "";

		Adapter result = fixture.getExtensionAdapter(extendedObject, namespace);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ExtensionmodelPackage getExtensionmodelPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtensionmodelPackage_1()
		throws Exception {
		ExtensionmodelFactoryImpl fixture = new ExtensionmodelFactoryImpl();

		ExtensionmodelPackage result = fixture.getExtensionmodelPackage();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the ExtensionmodelPackage getPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetPackage_1()
		throws Exception {

		ExtensionmodelPackage result = ExtensionmodelFactoryImpl.getPackage();

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
		new org.junit.runner.JUnitCore().run(ExtensionmodelFactoryImplTest.class);
	}
}