import javax.swing.JFrame; //package-swing; class-JFrame
import javax.swing.*;
import java.awt.*;

public class Calculator
{
	public Calculator()
	{
		JFrame jf=new JFrame("Calculator by Shahad");
		jf.setLayout(null);
		jf.setSize(500,600);	//width,height
		jf.setLocation(600,200);	//x,y
		
		
		JLabel displayLabel=new JLabel(" Hello Shahad");//instead of textfield JLabel is used for display
		displayLabel.setBounds(30,30,440,70);//x,y,width,height
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.white);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); //align rightside
		
		
		jf.add(displayLabel);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		Calculator cl=new Calculator();
	}
}
