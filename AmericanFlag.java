import java.awt.Color;
import java.awt.Graphics;

public class AmericanFlag {

	private double height;
	private double width;
	private double scale;
	private Rectangle[] stripes;
	// private Star[] stars;
	private Rectangle union;


	public AmericanFlag(double width, double heigth,  double scale) {
		this.stripes = new Rectangle[13];
		this.width = width;
		this.height = height;
		double scaleHeight = height * scale;
		double scaleWidth = width * scale;
		double stripeHeight = height / 13.0;
		int y = 0;
		

		for (int i=0; i<13; i++) {
			if (i % 2 == 0) {
				Color color = Color.WHITE;
				this.stripes[i] = new Rectangle(this.width, stripeHeight, Color.WHITE, new Point(0,y));

			}else{
				Color color = Color.RED;
				this.stripes[i] = new Rectangle(this.width, stripeHeight, Color.RED, new Point(0,y));
			}
			y += stripeHeight;
		}

		double unionWidth = width * 0.4;
		double unionHeight = (int)stripeHeight * 7;

		this.union = new Rectangle(unionWidth, unionHeight, Color.BLUE, new Point(0,0));
		


		
	}
	public void draw(Graphics g){
		
		for (int i = 0; i < stripes.length; i++) {
			stripes[i].paint(g);
		}
		this.union.paint(g);

	}

	
}