package imageJ;

import ij.ImagePlus;
import ij.plugin.PlugIn;
import ij.process.ByteProcessor;
import ij.process.ImageProcessor;

public class CreateImage implements PlugIn {
	String title = "Example of Plugin";

	@Override
	public void run(String arg) {
		int width = 256;
		int height = 256;

		ImageProcessor hisIp = new ByteProcessor(width, height);
		hisIp.setValue(255);
		hisIp.fill();

		for (int i = 0; i < 50; i++)
			for (int j = 0; j < 50; j++)
				hisIp.putPixel(i, j, 0);

		for (int i = 0; i < 50; i++)
			for (int j = 100; j < 150; j++)
				hisIp.putPixel(i, j, 0);

		for (int i = 0; i < 50; i++)
			for (int j = 200; j < 250; j++)
				hisIp.putPixel(i, j, 0);

//		Display
		ImagePlus ipl = new ImagePlus(title, hisIp);
		ipl.show();
	}

	public static void main(String[] args) {
		new CreateImage().run("123");
	}
}
