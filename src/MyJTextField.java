import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Character.Subset;
import java.util.Stack;

import javax.swing.JTextField;


public class MyJTextField extends JTextField implements ActionListener
{
	Integer op1,op2;
	Character oprt;
	private static final long serialVersionUID = 1L;

	public MyJTextField(int i) 
	{
		super(i);
		op1=null;
		op2=null;
		oprt=null;
	}

	public void actionPerformed(ActionEvent ae)
	{
		String exp=this.getText();
		Integer result=null;
		
			try
			{
				if (ae.getActionCommand().equals("="))
				{
					if(Character.isDigit(this.getText().charAt(0)))
						op2=Integer.parseInt(exp);
					if(op1==null||op2==null||oprt==null)
						throw new IllegalExpressionException();
					switch (oprt) 
					{
					case '+':result=op1+op2; break;
					case '-':result=op1-op2; break;
					case '*':result=op1*op2; break;
					case '/':result=(op2==0?null:(op1/op2)); break;
					default:throw new IllegalExpressionException();
					}
					if(result==null)
						throw new IllegalExpressionException();
					this.setText(result.toString());
					op1=null;
					oprt=null;
					op2=null;
					return;
				}
			}
			catch (Exception e) 
			{
				this.setText(e.getMessage());
				return;
			}
		
		
		if(ae.getActionCommand().equals("C"))
		{
			this.setText("");
			this.oprt=null;
			this.op1=null;
			this.op2=null;
			return;
		}
		if(!Character.isDigit(ae.getActionCommand().charAt(0)))
		{
			oprt=ae.getActionCommand().charAt(0);
			if(op1==null)
				op1=Integer.parseInt(exp);
			this.setText(ae.getActionCommand());
			return;
		}
		if(Character.isDigit(ae.getActionCommand().charAt(0)))
		{
			if(op1!=null&&!Character.isDigit(this.getText().charAt(0)))
				this.setText(ae.getActionCommand());
			else
				this.setText(this.getText()+ae.getActionCommand());
		}
		/*if(ae.getActionCommand().equals("D"))
		{
			if(!Character.isDigit(this.getText().charAt(this.getText().length()-1)))
				this.oprt=null;
			this.setText(this.getText().substring(0,this.getText().length()-1));
			return;
		}*/		
	}
}
