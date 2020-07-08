import javax.swing.JFrame; //package-swing; class-JFrame
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class Calculator
{
	public Calculator()
	{	//JFrame
		JFrame jf=new JFrame("Calculator by Shahad");
		jf.setLayout(null);
		jf.setSize(500,600);	//width,height
		jf.setLocation(600,200);	//x,y
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//JLabel
		JLabel displayLabel=new JLabel(" Hello Shahad");//instead of textfield JLabel is used for display
		displayLabel.setBounds(30,30,440,70);//x,y,width,height
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.white);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); //align rightside
		jf.add(displayLabel);
		
		//JButton
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(60,140,60,60);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(160,140,60,60);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(eightButton);
		
		JButton nineButton=new JButton("9");
		nineButton.setBounds(260,140,60,60);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(nineButton);
		
		JButton divButton=new JButton("/");
		divButton.setBounds(360,140,60,60);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(divButton);
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(60,250,60,60);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(fourButton);
		
		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(160,250,60,60);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(fiveButton);
		
		
		JButton sixButton=new JButton("6");
		sixButton.setBounds(260,250,60,60);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(sixButton);
		
		JButton mulButton=new JButton("*");
		mulButton.setBounds(360,250,60,60);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(mulButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(60,360,60,60);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(oneButton);
		
		JButton twoButton=new JButton("2");
		twoButton.setBounds(160,360,60,60);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(twoButton);
		
		JButton threeButton=new JButton("3");
		threeButton.setBounds(260,360,60,60);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(threeButton);
		
		JButton subtButton=new JButton("-");
		subtButton.setBounds(360,360,60,60);
		subtButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(subtButton);
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(60,470,60,60);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(dotButton);
		
		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(160,470,60,60);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(zeroButton);
		
		JButton equalButton=new JButton("=");
		equalButton.setBounds(260,470,60,60);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(equalButton);
		
		JButton addButton=new JButton("+");
		addButton.setBounds(360,470,60,60);
		addButton.setFont(new Font("Arial", Font.PLAIN, 30));
		jf.add(addButton);
		
		
		
	}
	public static void main(String[] args)
	{
		Calculator cl=new Calculator();
	}
}
