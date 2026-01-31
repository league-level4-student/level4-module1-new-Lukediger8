package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Timer;

public class MovingMorph extends Polymorph{
	int speed;

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub

		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		if(x>=900) {
			speed = -1;
		}
		if(x<=0) {
			speed=1;
		}
		x+=speed;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(x, y, width, height);
	}

}
