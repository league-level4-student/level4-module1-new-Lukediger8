package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Timer;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub

		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		x+=5;
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

}
