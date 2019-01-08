import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcForm extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyJTextField txtres=new MyJTextField(15);
	JButton btnAdd=new JButton("+");
	JButton btnSub=new JButton("-");
	JButton btnMul=new JButton("*");
	JButton btnDiv=new JButton("/");
    JButton btnRes=new JButton("=");
    JButton btnC=new JButton("C");
    JButton btn0=new JButton("0");
    JButton btn1=new JButton("1");
    JButton btn2=new JButton("2");
    JButton btn3=new JButton("3");
    JButton btn4=new JButton("4");
    JButton btn5=new JButton("5");
    JButton btn6=new JButton("6");
    JButton btn7=new JButton("7");
    JButton btn8=new JButton("8");
    JButton btn9=new JButton("9");
   // JButton btnDel=new JButton("D");
    JPanel p=new JPanel(new GridLayout(4,4));
    
    public CalcForm()
    {
     this.setSize(250, 400);
     this.setLayout(new BorderLayout());
     this.add(txtres,BorderLayout.NORTH);
     this.add(p,BorderLayout.CENTER);
     this.setVisible(true);
     p.add(btn7);
     p.add(btn8);
     p.add(btn9);
     p.add(btnDiv);
     p.add(btn4);
     p.add(btn5);
     p.add(btn6);
     p.add(btnMul);
     p.add(btn1);
     p.add(btn2);
     p.add(btn3);
     p.add(btnSub);
     p.add(btn0);
     p.add(btnRes);
     p.add(btnC);
     p.add(btnAdd);
    // p.add(btnDel);
     btn0.addActionListener(txtres);
     btn1.addActionListener(txtres);
     btn2.addActionListener(txtres);
     btn3.addActionListener(txtres);
     btn4.addActionListener(txtres);
     btn5.addActionListener(txtres);
     btn6.addActionListener(txtres);
     btn7.addActionListener(txtres);
     btn8.addActionListener(txtres);
     btn9.addActionListener(txtres);
     btnDiv.addActionListener(txtres);
     btnMul.addActionListener(txtres);
     btnSub.addActionListener(txtres);
     btnAdd.addActionListener(txtres);
     btnRes.addActionListener(txtres);
     btnC.addActionListener(txtres);
    // btnDel.addActionListener(txtres);
    }
    
    
}
