package org.eclipse.bpel.common.ui;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ColorUtilsTest</code> contains tests for the class <code>{@link ColorUtils}</code>.
 *
 * @generatedBy CodePro at 14/10/19 22:28
 * @author mateu
 * @version $Revision: 1.0 $
 */
public class ColorUtilsTest {
	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_1()
		throws Exception {
		float hue = 1.0f;
		float saturation = 0;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_2()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_3()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_4()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_5()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_6()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_7()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the int HSBtoRGB(float,float,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testHSBtoRGB_8()
		throws Exception {
		float hue = 1.0f;
		float saturation = 1.0f;
		float brightness = 1.0f;

		int result = ColorUtils.HSBtoRGB(hue, saturation, brightness);

		// add additional test code here
		assertEquals(-65536, result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testRGBtoHSB_1()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ArrayIndexOutOfBoundsException: 0
		//       at org.eclipse.bpel.common.ui.ColorUtils.RGBtoHSB(ColorUtils.java:212)
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testRGBtoHSB_2()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {0.0f, 0};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Float
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayInitializationExpression.execute(ArrayInitializationExpression.java:325)
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayCreationExpression.execute(ArrayCreationExpression.java:299)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testRGBtoHSB_3()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {1.0f, 0};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Float
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayInitializationExpression.execute(ArrayInitializationExpression.java:325)
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayCreationExpression.execute(ArrayCreationExpression.java:299)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testRGBtoHSB_4()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {1.0f, 0};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Float
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayInitializationExpression.execute(ArrayInitializationExpression.java:325)
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayCreationExpression.execute(ArrayCreationExpression.java:299)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testRGBtoHSB_5()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {0, 0, 0};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Float
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayInitializationExpression.execute(ArrayInitializationExpression.java:325)
		//       at com.instantiations.eclipse.analysis.expression.model.ArrayCreationExpression.execute(ArrayCreationExpression.java:299)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:568)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRGBtoHSB_6()
		throws Exception {
		int red = -1;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRGBtoHSB_7()
		throws Exception {
		int red = 256;
		int green = 1;
		int blue = 1;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRGBtoHSB_8()
		throws Exception {
		int red = 1;
		int green = -1;
		int blue = 1;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRGBtoHSB_9()
		throws Exception {
		int red = 1;
		int green = 256;
		int blue = 1;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRGBtoHSB_10()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = -1;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the float[] RGBtoHSB(int,int,int,float[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testRGBtoHSB_11()
		throws Exception {
		int red = 1;
		int green = 1;
		int blue = 256;
		float[] hsb = new float[] {};

		float[] result = ColorUtils.RGBtoHSB(red, green, blue, hsb);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the float getBrightnessInterval(RGB,RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetBrightnessInterval_1()
		throws Exception {
		RGB source = new RGB(1, 1, 1);
		source.blue = 1;
		source.red = 1;
		source.green = 1;
		RGB destination = new RGB(1, 1, 1);
		destination.blue = 1;
		destination.red = 1;
		destination.green = 1;

		float result = ColorUtils.getBrightnessInterval(source, destination);

		// add additional test code here
		assertEquals(0.0f, result, 0.1f);
	}

	/**
	 * Run the RGB[] getColorShades(RGB,RGB[],RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorShades_1()
		throws Exception {
		RGB source = new RGB(1, 1, 1);
		RGB[] shades = new RGB[] {new RGB(1, 1, 1)};
		RGB destination = new RGB(1, 1, 1);

		RGB[] result = ColorUtils.getColorShades(source, shades, destination);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.isInvertedColorScheme(ColorUtils.java:340)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getShadeRGB(ColorUtils.java:40)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getColorShades(ColorUtils.java:99)
		assertNotNull(result);
	}

	/**
	 * Run the RGB[] getColorShades(RGB,RGB[],RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorShades_2()
		throws Exception {
		RGB source = new RGB(1, 1, 1);
		RGB[] shades = new RGB[] {};
		RGB destination = new RGB(1, 1, 1);

		RGB[] result = ColorUtils.getColorShades(source, shades, destination);

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.length);
	}

	/**
	 * Run the Color[] getColorShades(Color,Color,int,Display) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorShades_3()
		throws Exception {
		Color source = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		Color destination = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		int n = 1;
		Display display = new Display();

		Color[] result = ColorUtils.getColorShades(source, destination, n, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals("Color {1, 0, 0, 255}", result[0].toString());
		assertEquals(false, result[0].isDisposed());
		assertEquals(0, result[0].getGreen());
		assertEquals(1, result[0].getRed());
		assertEquals(0, result[0].getBlue());
		assertEquals(255, result[0].getAlpha());
	}

	/**
	 * Run the Color[] getColorShades(Color,Color,int,Display) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorShades_4()
		throws Exception {
		Color source = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		Color destination = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		int n = 1;
		Display display = new Display();

		Color[] result = ColorUtils.getColorShades(source, destination, n, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertNotNull(result[0]);
		assertEquals("Color {1, 0, 0, 255}", result[0].toString());
		assertEquals(false, result[0].isDisposed());
		assertEquals(0, result[0].getGreen());
		assertEquals(1, result[0].getRed());
		assertEquals(0, result[0].getBlue());
		assertEquals(255, result[0].getAlpha());
	}

	/**
	 * Run the Color[] getColorShades(Color,Color,Color,int,Display) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetColorShades_5()
		throws Exception {
		Color source = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		Color middle = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		Color destination = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		int n = 1;
		Display display = new Display();

		Color[] result = ColorUtils.getColorShades(source, middle, destination, n, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertNotNull(result[0]);
		assertEquals("Color {1, 0, 0, 255}", result[0].toString());
		assertEquals(false, result[0].isDisposed());
		assertEquals(0, result[0].getGreen());
		assertEquals(1, result[0].getRed());
		assertEquals(0, result[0].getBlue());
		assertEquals(255, result[0].getAlpha());
		assertNotNull(result[1]);
		assertEquals("Color {1, 0, 0, 255}", result[1].toString());
		assertEquals(false, result[1].isDisposed());
		assertEquals(0, result[1].getGreen());
		assertEquals(1, result[1].getRed());
		assertEquals(0, result[1].getBlue());
		assertEquals(255, result[1].getAlpha());
	}

	/**
	 * Run the RGB getLightShade(RGB,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetLightShade_1()
		throws Exception {
		RGB rgb = new RGB(1, 1, 1);
		rgb.blue = 1;
		rgb.red = 1;
		rgb.green = 1;
		int numerator = 1;
		int denominator = 1;

		RGB result = ColorUtils.getLightShade(rgb, numerator, denominator);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument not valid
		//       at org.eclipse.swt.SWT.error(SWT.java:4514)
		//       at org.eclipse.swt.SWT.error(SWT.java:4448)
		//       at org.eclipse.swt.SWT.error(SWT.java:4419)
		//       at org.eclipse.swt.graphics.RGB.<init>(RGB.java:77)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getLightShade(ColorUtils.java:356)
		assertNotNull(result);
	}

	/**
	 * Run the Color getRelativeColor(Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetRelativeColor_1()
		throws Exception {
		Color c = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);

		Color result = ColorUtils.getRelativeColor(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.getRelativeColor(ColorUtils.java:278)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getRelativeColor(ColorUtils.java:330)
		assertNotNull(result);
	}

	/**
	 * Run the Color getRelativeColor(Device,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetRelativeColor_2()
		throws Exception {
		Device device = Display.findDisplay(Thread.currentThread());
		int r = 1;
		int g = 1;
		int b = 1;

		Color result = ColorUtils.getRelativeColor(device, r, g, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.getRelativeColor(ColorUtils.java:278)
		assertNotNull(result);
	}

	/**
	 * Run the Color getRelativeColorFromSystem(Color) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetRelativeColorFromSystem_1()
		throws Exception {
		Color c = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);

		Color result = ColorUtils.getRelativeColorFromSystem(c);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.getRelativeColor(ColorUtils.java:278)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getRelativeColorFromSystem(ColorUtils.java:336)
		assertNotNull(result);
	}

	/**
	 * Run the RGB getRelativeRGB(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetRelativeRGB_1()
		throws Exception {
		int r = 1;
		int g = 1;
		int b = 1;

		RGB result = ColorUtils.getRelativeRGB(r, g, b);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.getRelativeRGB(ColorUtils.java:306)
		assertNotNull(result);
	}

	/**
	 * Run the Color getShade(Color,float,Display) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetShade_1()
		throws Exception {
		Color original = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		float brightnessVariation = 1.0f;
		Display display = new Display();

		Color result = ColorUtils.getShade(original, brightnessVariation, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Color {0, 0, 0, 255}", result.toString());
		assertEquals(false, result.isDisposed());
		assertEquals(0, result.getGreen());
		assertEquals(0, result.getRed());
		assertEquals(0, result.getBlue());
		assertEquals(255, result.getAlpha());
	}

	/**
	 * Run the Color getShade(Color,float,Display) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetShade_2()
		throws Exception {
		Color original = Color.win32_new(Display.findDisplay(Thread.currentThread()), 1);
		float brightnessVariation = 1.0f;
		Display display = new Display();

		Color result = ColorUtils.getShade(original, brightnessVariation, display);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Color {0, 0, 0, 255}", result.toString());
		assertEquals(false, result.isDisposed());
		assertEquals(0, result.getGreen());
		assertEquals(0, result.getRed());
		assertEquals(0, result.getBlue());
		assertEquals(255, result.getAlpha());
	}

	/**
	 * Run the RGB getShadeRGB(RGB,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetShadeRGB_1()
		throws Exception {
		RGB original = new RGB(1, 1, 1);
		original.blue = 1;
		original.red = 1;
		original.green = 1;
		float brightnessVariation = 1.0f;

		RGB result = ColorUtils.getShadeRGB(original, brightnessVariation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.isInvertedColorScheme(ColorUtils.java:340)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getShadeRGB(ColorUtils.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the RGB getShadeRGB(RGB,float) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testGetShadeRGB_2()
		throws Exception {
		RGB original = new RGB(1, 1, 1);
		original.blue = 1;
		original.red = 1;
		original.green = 1;
		float brightnessVariation = 1.0f;

		RGB result = ColorUtils.getShadeRGB(original, brightnessVariation);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.isInvertedColorScheme(ColorUtils.java:340)
		//       at org.eclipse.bpel.common.ui.ColorUtils.getShadeRGB(ColorUtils.java:40)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isInvertedColorScheme() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testIsInvertedColorScheme_1()
		throws Exception {

		boolean result = ColorUtils.isInvertedColorScheme();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.isInvertedColorScheme(ColorUtils.java:340)
		assertTrue(result);
	}

	/**
	 * Run the boolean isInvertedColorScheme() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testIsInvertedColorScheme_2()
		throws Exception {

		boolean result = ColorUtils.isInvertedColorScheme();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at org.eclipse.bpel.common.ui.ColorUtils.isInvertedColorScheme(ColorUtils.java:340)
		assertTrue(result);
	}

	/**
	 * Run the void replaceColor(ImageData,RGB,RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testReplaceColor_1()
		throws Exception {
		ImageData data = new ImageData(new ByteArrayInputStream("".getBytes()));
		data.height = 1;
		data.palette = new PaletteData(1, 1, 1);
		data.width = 1;
		RGB from = new RGB(1, 1, 1);
		RGB to = new RGB(1, 1, 1);

		ColorUtils.replaceColor(data, from, to);

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
	}

	/**
	 * Run the void replaceColor(ImageData,RGB,RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testReplaceColor_2()
		throws Exception {
		ImageData data = new ImageData(new ByteArrayInputStream("".getBytes()));
		data.height = 1;
		data.palette = new PaletteData(1, 1, 1);
		data.width = 1;
		RGB from = new RGB(1, 1, 1);
		RGB to = new RGB(1, 1, 1);

		ColorUtils.replaceColor(data, from, to);

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
	}

	/**
	 * Run the void replaceColor(ImageData,RGB,RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testReplaceColor_3()
		throws Exception {
		ImageData data = new ImageData(new ByteArrayInputStream("".getBytes()));
		data.height = 0;
		data.width = 1;
		RGB from = new RGB(1, 1, 1);
		RGB to = new RGB(1, 1, 1);

		ColorUtils.replaceColor(data, from, to);

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
	}

	/**
	 * Run the void replaceColor(ImageData,RGB,RGB) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	@Test
	public void testReplaceColor_4()
		throws Exception {
		ImageData data = new ImageData(new ByteArrayInputStream("".getBytes()));
		data.width = 0;
		RGB from = new RGB(1, 1, 1);
		RGB to = new RGB(1, 1, 1);

		ColorUtils.replaceColor(data, from, to);

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
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/10/19 22:28
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
	 * @generatedBy CodePro at 14/10/19 22:28
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
	 * @generatedBy CodePro at 14/10/19 22:28
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ColorUtilsTest.class);
	}
}