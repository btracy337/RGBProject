package guicontroller;

import guimodel.Human;
import guiview.FirstFrame;

public class Controller
{
	private Human myHuman;
	private FirstFrame appFrame;

	public void start()
	{

	}

	public Controller()
	{
		myHuman = new Human();
	    appFrame = new FirstFrame(this);
	}

}
