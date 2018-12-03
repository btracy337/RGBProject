package guiview;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import guicontroller.Controller;

public class FirstPanel extends JPanel
{
	private Controller appController;
	private JButton myButton;
	private JLabel myLabel;
	private JLabel redLabel;
	private JLabel blueLabel;
	private JLabel greenLabel;
	private SpringLayout appLayout;
	private JSlider redSlider;
	private JSlider greenSlider;
	private JSlider blueSlider;

	public FirstPanel(Controller appController)
	{
		super();
		this.appController = appController;

		myButton = new JButton("Change Color");
		myLabel = new JLabel("RGB Slider Application");
		redLabel = new JLabel("Red: ");
		greenLabel = new JLabel("Green: " );
		blueLabel = new JLabel("Blue: " );
		
		redSlider = new JSlider(1,255);
		greenSlider = new JSlider(1,255);
		blueSlider = new JSlider(1,255);
		appLayout = new SpringLayout();




	


		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void setupPanel()
	{
		this.add(myButton);
		this.add(myLabel);
		this.add(redLabel);
		this.add(greenLabel);
		this.add(blueLabel);
		this.add(redSlider);
		this.add(blueSlider);
		this.add(greenSlider);
		this.setLayout(appLayout);
		

	}
	
	private void changeColor()
	{
		int red = (int)(redSlider.getValue());
		int blue = (int)(blueSlider.getValue());
		int green = (int)(greenSlider.getValue());
		
		this.setBackground(new Color(red, green, blue));
		
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, myLabel, -338, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, myButton, 76, SpringLayout.SOUTH, myLabel);
		appLayout.putConstraint(SpringLayout.WEST, myButton, 0, SpringLayout.WEST, myLabel);
		appLayout.putConstraint(SpringLayout.NORTH, myLabel, 65, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, blueLabel, 22, SpringLayout.SOUTH, greenSlider);
		appLayout.putConstraint(SpringLayout.WEST, blueLabel, 0, SpringLayout.WEST, redLabel);
		appLayout.putConstraint(SpringLayout.WEST, greenSlider, 0, SpringLayout.WEST, redSlider);
		appLayout.putConstraint(SpringLayout.NORTH, greenSlider, 415, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, greenLabel, 0, SpringLayout.WEST, redLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, greenLabel, -31, SpringLayout.NORTH, greenSlider);
		appLayout.putConstraint(SpringLayout.NORTH, blueSlider, 23, SpringLayout.SOUTH, blueLabel);
		appLayout.putConstraint(SpringLayout.EAST, blueSlider, 0, SpringLayout.EAST, redSlider);
		appLayout.putConstraint(SpringLayout.NORTH, redSlider, 304, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, redLabel, 365, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, redLabel, -26, SpringLayout.NORTH, redSlider);
		appLayout.putConstraint(SpringLayout.WEST, redSlider, 290, SpringLayout.WEST, this);

	}

	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
	
		});
}
}
