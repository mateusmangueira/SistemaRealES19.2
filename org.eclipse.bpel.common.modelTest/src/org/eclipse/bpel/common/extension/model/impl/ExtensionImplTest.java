package org.eclipse.bpel.common.extension.model.impl;

import org.eclipse.bpel.common.extension.model.notify.impl.ExtensionModelNotificationImpl;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ExtensionImplTest</code> contains tests for the class <code>{@link ExtensionImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:12
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ExtensionImplTest {
	/**
	 * Run the ExtensionImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testExtensionImpl_1()
		throws Exception {

		ExtensionImpl result = new ExtensionImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getExtensionObject());
		assertEquals(null, result.getExtendedObject());
		assertEquals(null, result.basicGetExtendedObject());
		assertEquals(0, result.eContainerFeatureID());
		assertEquals(null, result.eInternalContainer());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(null, result.eInternalResource());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eDirectResource());
		assertEquals(null, result.eProxyURI());
		assertEquals(null, result.eStore());
		assertEquals(false, result.eNotificationRequired());
	}

	/**
	 * Run the EObject basicGetExtendedObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testBasicGetExtendedObject_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.basicGetExtendedObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the NotificationChain basicSetExtensionObject(EObject,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testBasicSetExtensionObject_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();
		NotificationChain msgs = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		NotificationChain result = fixture.basicSetExtensionObject(newExtensionObject, msgs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NotificationChain basicSetExtensionObject(EObject,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testBasicSetExtensionObject_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();
		NotificationChain msgs = null;

		NotificationChain result = fixture.basicSetExtensionObject(newExtensionObject, msgs);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the NotificationChain basicSetExtensionObject(EObject,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testBasicSetExtensionObject_3()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();
		NotificationChain msgs = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		NotificationChain result = fixture.basicSetExtensionObject(newExtensionObject, msgs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(EStructuralFeature,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;
		boolean resolve = true;

		Object result = fixture.eGet(eFeature, resolve);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eGet(ExtensionImpl.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(EStructuralFeature,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;
		boolean resolve = false;

		Object result = fixture.eGet(eFeature, resolve);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eGet(ExtensionImpl.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(EStructuralFeature,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEGet_3()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;
		boolean resolve = true;

		Object result = fixture.eGet(eFeature, resolve);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eGet(ExtensionImpl.java:185)
		assertNotNull(result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,Class,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEInverseRemove_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		InternalEObject otherEnd = new ExtensionmodelFactoryImpl();
		int featureID = 1;
		Class baseClass = Object.class;
		NotificationChain msgs = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, baseClass, msgs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,Class,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEInverseRemove_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		InternalEObject otherEnd = new ExtensionmodelFactoryImpl();
		int featureID = 1;
		Class baseClass = Object.class;
		NotificationChain msgs = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, baseClass, msgs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,Class,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEInverseRemove_3()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		InternalEObject otherEnd = new ExtensionmodelFactoryImpl();
		int featureID = -1;
		Class baseClass = Object.class;
		NotificationChain msgs = new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object());

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, baseClass, msgs);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean eIsSet(EStructuralFeature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;

		boolean result = fixture.eIsSet(eFeature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eIsSet(ExtensionImpl.java:238)
		assertTrue(result);
	}

	/**
	 * Run the boolean eIsSet(EStructuralFeature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject((EObject) null);
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;

		boolean result = fixture.eIsSet(eFeature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eIsSet(ExtensionImpl.java:238)
		assertTrue(result);
	}

	/**
	 * Run the boolean eIsSet(EStructuralFeature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;

		boolean result = fixture.eIsSet(eFeature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eIsSet(ExtensionImpl.java:238)
		assertTrue(result);
	}

	/**
	 * Run the boolean eIsSet(EStructuralFeature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject((EObject) null, new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;

		boolean result = fixture.eIsSet(eFeature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eIsSet(ExtensionImpl.java:238)
		assertTrue(result);
	}

	/**
	 * Run the void eSet(EStructuralFeature,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testESet_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;
		Object newValue = new ExtensionmodelFactoryImpl();

		fixture.eSet(eFeature, newValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eSet(ExtensionImpl.java:202)
	}

	/**
	 * Run the void eSet(EStructuralFeature,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testESet_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;
		Object newValue = new ExtensionmodelFactoryImpl();

		fixture.eSet(eFeature, newValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eSet(ExtensionImpl.java:202)
	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EClass result = fixture.eStaticClass();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(2, result.getFeatureCount());
		assertEquals(null, result.getDefaultValue());
		assertEquals("org.eclipse.bpel.common.extension.model.Extension", result.getInstanceClassName());
		assertEquals("org.eclipse.bpel.common.extension.model.Extension", result.getInstanceTypeName());
		assertEquals(1, result.getClassifierID());
		assertEquals("Extension", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the void eUnset(EStructuralFeature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;

		fixture.eUnset(eFeature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eUnset(ExtensionImpl.java:220)
	}

	/**
	 * Run the void eUnset(EStructuralFeature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EStructuralFeature eFeature = null;

		fixture.eUnset(eFeature);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.BasicEObjectImpl.eDerivedStructuralFeatureID(BasicEObjectImpl.java:1497)
		//       at org.eclipse.bpel.common.extension.model.impl.ExtensionImpl.eUnset(ExtensionImpl.java:220)
	}

	/**
	 * Run the EObject getExtendedObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtendedObject_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.getExtendedObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject getExtendedObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtendedObject_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.getExtendedObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject getExtendedObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtendedObject_3()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.getExtendedObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject getExtendedObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtendedObject_4()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject((EObject) null);
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.getExtendedObject();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the EObject getExtendedObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtendedObject_5()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.getExtendedObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject getExtensionObject() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testGetExtensionObject_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));

		EObject result = fixture.getExtensionObject();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the void setExtendedObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtendedObject_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtendedObject = new ExtensionmodelFactoryImpl();

		fixture.setExtendedObject(newExtendedObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtendedObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtendedObject_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtendedObject = new ExtensionmodelFactoryImpl();

		fixture.setExtendedObject(newExtendedObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_1()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_2()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_3()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_4()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject((EObject) null, new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_5()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = null;

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_6()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject((EObject) null, new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = null;

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_7()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_8()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject((EObject) null, new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = new ExtensionmodelFactoryImpl();

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_9()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject(new ExtensionmodelFactoryImpl(), new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = null;

		fixture.setExtensionObject(newExtensionObject);

		// add additional test code here
	}

	/**
	 * Run the void setExtensionObject(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:12
	 */
	@Test
	public void testSetExtensionObject_10()
		throws Exception {
		ExtensionImpl fixture = new ExtensionImpl();
		fixture.setExtendedObject(new ExtensionmodelFactoryImpl());
		fixture.basicSetExtensionObject((EObject) null, new ExtensionModelNotificationImpl(new ExtensionmodelFactoryImpl(), 1, 1, new Object(), new Object()));
		EObject newExtensionObject = null;

		fixture.setExtensionObject(newExtensionObject);

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
		new org.junit.runner.JUnitCore().run(ExtensionImplTest.class);
	}
}