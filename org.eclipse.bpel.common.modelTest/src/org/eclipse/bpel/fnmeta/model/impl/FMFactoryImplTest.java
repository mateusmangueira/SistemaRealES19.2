package org.eclipse.bpel.fnmeta.model.impl;

import javax.imageio.metadata.IIOMetadataNode;
import org.eclipse.bpel.fnmeta.model.Argument;
import org.eclipse.bpel.fnmeta.model.Assistant;
import org.eclipse.bpel.fnmeta.model.FMFactory;
import org.eclipse.bpel.fnmeta.model.FMPackage;
import org.eclipse.bpel.fnmeta.model.FacadeElement;
import org.eclipse.bpel.fnmeta.model.Function;
import org.eclipse.bpel.fnmeta.model.Option;
import org.eclipse.bpel.fnmeta.model.Optionality;
import org.eclipse.bpel.fnmeta.model.Registry;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;

/**
 * The class <code>FMFactoryImplTest</code> contains tests for the class <code>{@link FMFactoryImpl}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:13
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class FMFactoryImplTest {
	/**
	 * Run the FMFactoryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testFMFactoryImpl_1()
		throws Exception {

		FMFactoryImpl result = new FMFactoryImpl();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFMPackage());
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
	 * Run the String convertDOMElement(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertDOMElement_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		Element instanceValue = new IIOMetadataNode();

		String result = fixture.convertDOMElement(instanceValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: The datatype 'DOMElement' is not a valid classifier
		//       at org.eclipse.emf.ecore.impl.EFactoryImpl.convertToString(EFactoryImpl.java:480)
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.convertDOMElement(FMFactoryImpl.java:232)
		assertNotNull(result);
	}

	/**
	 * Run the String convertDOMElementToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertDOMElementToString_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		Object instanceValue = new Object();

		String result = fixture.convertDOMElementToString(eDataType, instanceValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.EFactoryImpl.convertToString(EFactoryImpl.java:478)
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.convertDOMElementToString(FMFactoryImpl.java:241)
		assertNotNull(result);
	}

	/**
	 * Run the String convertOptionality(Optionality) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertOptionality_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		Optionality instanceValue = Optionality.OPTIONAL;

		String result = fixture.convertOptionality(instanceValue);

		// add additional test code here
		assertEquals("?", result);
	}

	/**
	 * Run the String convertOptionality(Optionality) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertOptionality_2()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		Optionality instanceValue = null;

		String result = fixture.convertOptionality(instanceValue);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String convertOptionalityToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertOptionalityToString_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		Object instanceValue = new Object();

		String result = fixture.convertOptionalityToString(eDataType, instanceValue);

		// add additional test code here
		assertEquals("java.lang.Object@490a60a9", result);
	}

	/**
	 * Run the String convertOptionalityToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertOptionalityToString_2()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		Object instanceValue = null;

		String result = fixture.convertOptionalityToString(eDataType, instanceValue);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertToString_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		Object instanceValue = new Object();

		String result = fixture.convertToString(eDataType, instanceValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.convertToString(FMFactoryImpl.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertToString_2()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		Object instanceValue = new Object();

		String result = fixture.convertToString(eDataType, instanceValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.convertToString(FMFactoryImpl.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testConvertToString_3()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		Object instanceValue = new Object();

		String result = fixture.convertToString(eDataType, instanceValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.convertToString(FMFactoryImpl.java:100)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_3()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_4()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_5()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_6()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreate_7()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EClass eClass = null;

		EObject result = fixture.create(eClass);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.create(FMFactoryImpl.java:64)
		assertNotNull(result);
	}

	/**
	 * Run the Argument createArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateArgument_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		Argument result = fixture.createArgument();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getType());
		assertEquals("", result.getDefaultValue());
		assertEquals(null, result.getComment());
		assertEquals(false, result.isSetOptionality());
		assertEquals(null, result.getAssistant());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Assistant createAssistant() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateAssistant_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		Assistant result = fixture.createAssistant();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getType());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Element createDOMElement(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateDOMElement_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		String literal = "";

		Element result = fixture.createDOMElement(literal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: The datatype 'DOMElement' is not a valid classifier
		//       at org.eclipse.emf.ecore.impl.EFactoryImpl.createFromString(EFactoryImpl.java:299)
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createDOMElement(FMFactoryImpl.java:214)
		assertNotNull(result);
	}

	/**
	 * Run the Element createDOMElementFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateDOMElementFromString_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		String initialValue = "";

		Element result = fixture.createDOMElementFromString(eDataType, initialValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.emf.ecore.impl.EFactoryImpl.createFromString(EFactoryImpl.java:297)
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createDOMElementFromString(FMFactoryImpl.java:223)
		assertNotNull(result);
	}

	/**
	 * Run the FacadeElement createFacadeElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateFacadeElement_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		FacadeElement result = fixture.createFacadeElement();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateFromString_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		String initialValue = "";

		Object result = fixture.createFromString(eDataType, initialValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createFromString(FMFactoryImpl.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateFromString_2()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		String initialValue = "";

		Object result = fixture.createFromString(eDataType, initialValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createFromString(FMFactoryImpl.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateFromString_3()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		String initialValue = "";

		Object result = fixture.createFromString(eDataType, initialValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createFromString(FMFactoryImpl.java:83)
		assertNotNull(result);
	}

	/**
	 * Run the Function createFunction() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateFunction_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		Function result = fixture.createFunction();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getName());
		assertEquals(null, result.getReturnType());
		assertEquals("", result.getClassName());
		assertEquals(null, result.getComment());
		assertEquals(null, result.getPrefix());
		assertEquals(null, result.getHelp());
		assertEquals("urn:oasis:names:tc:wsbpel:2.0:sublang:xpath1.0", result.getNamespace());
		assertEquals(null, result.getDeprecateComment());
		assertEquals(Boolean.FALSE, result.getIsDeprecated());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Option createOption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateOption_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		Option result = fixture.createOption();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getDisplayValue());
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Optionality createOptionality(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateOptionality_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		String literal = "";

		Optionality result = fixture.createOptionality(literal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: The value '' is not a valid enumerator of 'Optionality'
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createOptionality(FMFactoryImpl.java:177)
		assertNotNull(result);
	}

	/**
	 * Run the Optionality createOptionality(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCreateOptionality_2()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		String literal = "";

		Optionality result = fixture.createOptionality(literal);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Optionality createOptionalityFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateOptionalityFromString_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();
		EDataType eDataType = null;
		String initialValue = "";

		Optionality result = fixture.createOptionalityFromString(eDataType, initialValue);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: The value '' is not a valid enumerator of 'Optionality'
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createOptionality(FMFactoryImpl.java:177)
		//       at org.eclipse.bpel.fnmeta.model.impl.FMFactoryImpl.createOptionalityFromString(FMFactoryImpl.java:187)
		assertNotNull(result);
	}

	/**
	 * Run the Registry createRegistry() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testCreateRegistry_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		Registry result = fixture.createRegistry();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getElement());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the FMPackage getFMPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetFMPackage_1()
		throws Exception {
		FMFactoryImpl fixture = new FMFactoryImpl();

		FMPackage result = fixture.getFMPackage();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the FMPackage getPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testGetPackage_1()
		throws Exception {

		FMPackage result = FMFactoryImpl.getPackage();

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
	 * Run the FMFactory init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_1()
		throws Exception {

		FMFactory result = FMFactoryImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFMPackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the FMFactory init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:13
	 */
	@Test
	public void testInit_2()
		throws Exception {

		FMFactory result = FMFactoryImpl.init();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getFMPackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(null, result.eResource());
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
		new org.junit.runner.JUnitCore().run(FMFactoryImplTest.class);
	}
}