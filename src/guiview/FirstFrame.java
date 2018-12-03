package guiview;

import javax.swing.*;
import guicontroller.Controller;



public class FirstFrame extends JFrame
{
	private Controller appController;
	private FirstPanel appPanel;
	
	public FirstFrame(Controller appController)
	{
		super();
		this.appController = appController;
		this.appPanel =  new FirstPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800,800);
		this.setTitle("An RGB Slider Application");
		this.setResizable(false);
		this.setVisible(true);
	}
}