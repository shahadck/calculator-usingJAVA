import javax.swing.JFrame; //package-swing; class-JFrame
import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.awt.event.*;

public class Calculator implements ActionListener
{
	JFrame jf; //global declration-to get access in all functions
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton,clearButton,mulButton,divButton,subtButton,dotButton,zeroButton,addButton,equalButton;
	public Calculator()
	{	//JFrame
		jf=new JFrame("Calculator by Shahad");
		jf.setLayout(null);
		jf.setSize(500,700);	//width,height
		jf.setLocation(600,200);	//x,y
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//JLabel
		displayLabel=new JLabel();//instead of textfield JLabel is used for display
		displayLabel.setBounds(30,30,440,70);//x,y,width,height
		displayLabel.setBackground(Color.black);
		displayLabel.setOpaque(true);
		displayLabel.setForeground(Color.white);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); //align rightside
		jf.add(displayLabel);
		
		//JButton
		clearButton=new JButton("C");
		clearButton.setBounds(60,140,60,60);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(60,250,60,60);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(160,250,60,60);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(260,250,60,60);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		mulButton=new JButton("*");
		mulButton.setBounds(360,250,60,60);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(60,360,60,60);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(160,360,60,60);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		
		sixButton=new JButton("6");
		sixButton.setBounds(260,360,60,60);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		divButton=new JButton("/");
		divButton.setBounds(360,360,60,60);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(60,470,60,60);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(160,470,60,60);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(260,470,60,60);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		subtButton=new JButton("-");
		subtButton.setBounds(360,470,60,60);
		subtButton.setFont(new Font("Arial", Font.PLAIN, 30));
		subtButton.addActionListener(this);
		jf.add(subtButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(60,580,60,60);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(160,580,60,60);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		addButton=new JButton("+");
		addButton.setBounds(260,580,60,60);
		addButton.setFont(new Font("Arial", Font.PLAIN, 30));
		addButton.addActionListener(this);
		jf.add(addButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(360,580,60,60);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		
	}
	public static void main(String[] args)
	{
		Calculator cl=new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==sevenButton) {
		displayLabel.setText(displayLabel.getText()+"7");
	}else if(e.getSource()==eightButton) {
		displayLabel.setText(displayLabel.getText()+"8");
	}else if(e.getSource()==nineButton) {
		displayLabel.setText(displayLabel.getText()+"9");
	}else if(e.getSource()==fourButton) {
		displayLabel.setText(displayLabel.getText()+"4");
	}else if(e.getSource()==fiveButton) {
		displayLabel.setText(displayLabel.getText()+"5");
	}else if(e.getSource()==sixButton) {
		displayLabel.setText(displayLabel.getText()+"6");
	}else if(e.getSource()==oneButton) {
		displayLabel.setText(displayLabel.getText()+"1");
	}else if(e.getSource()==twoButton) {
		displayLabel.setText(displayLabel.getText()+"2");
	}else if(e.getSource()==threeButton) {
		displayLabel.setText(displayLabel.getText()+"3");
	}else if(e.getSource()==zeroButton) {
		displayLabel.setText(displayLabel.getText()+"0");
	}else if(e.getSource()==dotButton) {
		displayLabel.setText(displayLabel.getText()+".");
	}else if(e.getSource()==clearButton) {
		displayLabel.setText("");
	}else if(e.getSource()==mulButton) {
		displayLabel.setText(displayLabel.getText()+"*");
	}else if(e.getSource()==divButton) {
		displayLabel.setText(displayLabel.getText()+"/");
	}else if(e.getSource()==subtButton) {
		displayLabel.setText(displayLabel.getText()+"-");
	}else if(e.getSource()==addButton) {
		displayLabel.setText(displayLabel.getText()+"+");
	}else if(e.getSource()==equalButton) {
		  addOutput();
	}
    	}
     public void addOutput()
    {
        double output = 0;

        //converting string into expression
        try
        {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            displayLabel.setText(engine.eval(displayLabel.getText()).toString());
        }
        catch(ScriptException e)
        {
            displayLabel.setText("Syntax error");
        }
    }


	
}
