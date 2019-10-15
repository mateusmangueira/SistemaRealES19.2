package org.eclipse.bpel.common.ui.markers;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IMarker;
import org.eclipse.swt.graphics.Image;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ModelMarkerUtilTest</code> contains tests for the class <code>{@link ModelMarkerUtil}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ModelMarkerUtilTest {
	/**
	 * Run the IMarker getDisplayMarker(List) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetDisplayMarker_1()
		throws Exception {
		List markers = new ArrayList();

		IMarker result = ModelMarkerUtil.getDisplayMarker(markers);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMarker getDisplayMarker(List,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetDisplayMarker_2()
		throws Exception {
		List markers = new ArrayList();
		String anchorPoint = "";

		IMarker result = ModelMarkerUtil.getDisplayMarker(markers, anchorPoint);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IMarker getDisplayMarker(List,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testGetDisplayMarker_3()
		throws Exception {
		List markers = new ArrayList();
		String anchorPoint = null;

		IMarker result = ModelMarkerUtil.getDisplayMarker(markers, anchorPoint);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetImage_1()
		throws Exception {
		IMarker marker = null;

		Image result = ModelMarkerUtil.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getImage(ModelMarkerUtil.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetImage_2()
		throws Exception {
		IMarker marker = null;

		Image result = ModelMarkerUtil.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getImage(ModelMarkerUtil.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetImage_3()
		throws Exception {
		IMarker marker = null;

		Image result = ModelMarkerUtil.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getImage(ModelMarkerUtil.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetImage_4()
		throws Exception {
		IMarker marker = null;

		Image result = ModelMarkerUtil.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getImage(ModelMarkerUtil.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetImage_5()
		throws Exception {
		IMarker marker = null;

		Image result = ModelMarkerUtil.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getImage(ModelMarkerUtil.java:124)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_1()
		throws Exception {
		String markerType = "";

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(markerType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_2()
		throws Exception {
		String markerType = "";

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(markerType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_3()
		throws Exception {
		String markerType = "";

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(markerType);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_4()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_5()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_6()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_7()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_8()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_9()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_10()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = true;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the IModelMarkerContentProvider getModelMarkerContentProvider(IMarker,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetModelMarkerContentProvider_11()
		throws Exception {
		IMarker marker = null;
		boolean checkSupertypes = false;

		IModelMarkerContentProvider result = ModelMarkerUtil.getModelMarkerContentProvider(marker, checkSupertypes);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getModelMarkerContentProvider(ModelMarkerUtil.java:201)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		IMarker marker = null;

		String result = ModelMarkerUtil.getText(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getText(ModelMarkerUtil.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetText_2()
		throws Exception {
		IMarker marker = null;

		String result = ModelMarkerUtil.getText(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getText(ModelMarkerUtil.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetText_3()
		throws Exception {
		IMarker marker = null;

		String result = ModelMarkerUtil.getText(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getText(ModelMarkerUtil.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetText_4()
		throws Exception {
		IMarker marker = null;

		String result = ModelMarkerUtil.getText(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getText(ModelMarkerUtil.java:160)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(IMarker) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testGetText_5()
		throws Exception {
		IMarker marker = null;

		String result = ModelMarkerUtil.getText(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.markers.ModelMarkerUtil.getText(ModelMarkerUtil.java:160)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
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
	 * @generatedBy CodePro at 14/10/19 22:31
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
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ModelMarkerUtilTest.class);
	}
}