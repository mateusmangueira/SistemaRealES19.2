package org.eclipse.bpel.common.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.core.resources.IMarker;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.widgets.Display;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ImageUtilsTest</code> contains tests for the class <code>{@link ImageUtils}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:31
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ImageUtilsTest {
	/**
	 * Run the Image createTransparentImage(int,int,Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCreateTransparentImage_1()
		throws Exception {
		int width = 1;
		int height = 1;
		Color transparent = Color.win32_new(Display.getCurrent(), 1);

		Image result = ImageUtils.createTransparentImage(width, height, transparent);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Image {-1174074278}", result.toString());
		assertEquals(false, result.isDisposed());
	}

	/**
	 * Run the Image createTransparentImage(int,int,Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCreateTransparentImage_2()
		throws Exception {
		int width = 1;
		int height = 1;
		Color transparent = Color.win32_new(Display.getCurrent(), 1);

		Image result = ImageUtils.createTransparentImage(width, height, transparent);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Image {-33223735}", result.toString());
		assertEquals(false, result.isDisposed());
	}

	/**
	 * Run the Image createTransparentImage(int,int,Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testCreateTransparentImage_3()
		throws Exception {
		int width = 1;
		int height = 1;
		Color transparent = Color.win32_new(Display.getCurrent(), 1);

		Image result = ImageUtils.createTransparentImage(width, height, transparent);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Image {-402324544}", result.toString());
		assertEquals(false, result.isDisposed());
	}

	/**
	 * Run the ImageData flip(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFlip_1()
		throws Exception {
		ImageData source = new ImageData(new ByteArrayInputStream("".getBytes()));
		source.transparentPixel = 1;
		source.height = 1;
		source.width = 1;

		ImageData result = ImageUtils.flip(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Unsupported or unrecognized format
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.internal.image.FileFormat.load(FileFormat.java:84)
		//       at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:146)
		//       at org.eclipse.swt.graphics.ImageDataLoader.load(ImageDataLoader.java:22)
		//       at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the ImageData flip(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFlip_2()
		throws Exception {
		ImageData source = new ImageData(new ByteArrayInputStream("".getBytes()));
		source.transparentPixel = 1;
		source.height = 1;
		source.width = 0;

		ImageData result = ImageUtils.flip(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Unsupported or unrecognized format
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.internal.image.FileFormat.load(FileFormat.java:84)
		//       at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:146)
		//       at org.eclipse.swt.graphics.ImageDataLoader.load(ImageDataLoader.java:22)
		//       at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the ImageData flip(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testFlip_3()
		throws Exception {
		ImageData source = new ImageData(new ByteArrayInputStream("".getBytes()));
		source.transparentPixel = 1;
		source.height = 0;

		ImageData result = ImageUtils.flip(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Unsupported or unrecognized format
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.internal.image.FileFormat.load(FileFormat.java:84)
		//       at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:146)
		//       at org.eclipse.swt.graphics.ImageDataLoader.load(ImageDataLoader.java:22)
		//       at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:332)
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

		Image result = ImageUtils.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ImageUtils.getImage(ImageUtils.java:77)
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

		Image result = ImageUtils.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ImageUtils.getImage(ImageUtils.java:77)
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

		Image result = ImageUtils.getImage(marker);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ImageUtils.getImage(ImageUtils.java:77)
		assertNotNull(result);
	}

	/**
	 * Run the ImageData rotateLeft(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRotateLeft_1()
		throws Exception {
		ImageData source = new ImageData(new ByteArrayInputStream("".getBytes()));
		source.transparentPixel = 1;
		source.height = 1;
		source.width = 1;
		source.depth = 1;
		source.palette = new PaletteData(1, 1, 1);

		ImageData result = ImageUtils.rotateLeft(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Unsupported or unrecognized format
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.internal.image.FileFormat.load(FileFormat.java:84)
		//       at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:146)
		//       at org.eclipse.swt.graphics.ImageDataLoader.load(ImageDataLoader.java:22)
		//       at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the ImageData rotateLeft(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRotateLeft_2()
		throws Exception {
		ImageData source = new ImageData(new ByteArrayInputStream("".getBytes()));
		source.transparentPixel = 1;
		source.height = 0;
		source.width = 1;
		source.depth = 1;
		source.palette = new PaletteData(1, 1, 1);

		ImageData result = ImageUtils.rotateLeft(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Unsupported or unrecognized format
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.internal.image.FileFormat.load(FileFormat.java:84)
		//       at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:146)
		//       at org.eclipse.swt.graphics.ImageDataLoader.load(ImageDataLoader.java:22)
		//       at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:332)
		assertNotNull(result);
	}

	/**
	 * Run the ImageData rotateLeft(ImageData) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:31
	 */
	@Test
	public void testRotateLeft_3()
		throws Exception {
		ImageData source = new ImageData(new ByteArrayInputStream("".getBytes()));
		source.transparentPixel = 1;
		source.height = 1;
		source.width = 0;
		source.depth = 1;
		source.palette = new PaletteData(1, 1, 1);

		ImageData result = ImageUtils.rotateLeft(source);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTException: Unsupported or unrecognized format
		//       at org.eclipse.swt.SWT.error(SWT.java:4533)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.internal.image.FileFormat.load(FileFormat.java:84)
		//       at org.eclipse.swt.graphics.ImageLoader.load(ImageLoader.java:146)
		//       at org.eclipse.swt.graphics.ImageDataLoader.load(ImageDataLoader.java:22)
		//       at org.eclipse.swt.graphics.ImageData.<init>(ImageData.java:332)
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
		new org.junit.runner.JUnitCore().run(ImageUtilsTest.class);
	}
}