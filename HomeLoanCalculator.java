import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

class HomeLoanCalculator extends JFrame  implements ActionListener
{
	//Declaring Objects
	
	JLabel l1=new JLabel("Home Loan Amount");
	JLabel l2=new JLabel("Interest Rate");
	JLabel l3=new JLabel("Loan Tenure(in yrs)");
    JLabel l4=new JLabel("Loan EMI");
    JLabel l5=new JLabel("Total Interest Payable");
	JLabel l6=new JLabel("Total Amount(Principal+Interest)");
	JLabel l7=new JLabel("No.of months to complete Loan");
	JLabel l8=new JLabel("Interest Paid");
	JLabel l9=new JLabel("Total Amount(Principal+Interest)");
	JLabel l10=new JLabel("Bonus Amount(Enter value first)");
	JLabel l11=new JLabel("No.of months to complete Loan");
	JLabel l12=new JLabel("Interest Paid");
	JLabel l13=new JLabel("Total Amount(Principal+Interest)");
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
    JTextField t4=new JTextField();
    JTextField t5=new JTextField();
	JTextField t6=new JTextField();
	JTextField t7=new JTextField();
	JTextField t8=new JTextField();
	JTextField t9=new JTextField();
	JTextField t10=new JTextField();
	JTextField t11=new JTextField();
	JTextField t12=new JTextField();
	JTextField t13=new JTextField();
	JButton b1=new JButton("Output");
    JButton b2=new JButton("Exit");
	JButton b3=new JButton("One Month Additional emi per year");
	JButton b4=new JButton("Yearly Bonus Repayment");
	JButton b5=new JButton("10% yearly Increment");

	
	HomeLoanCalculator()
	{
		//Giving Coordinates
	  Font g = new Font("name",Font.PLAIN, 12);
	   JFrame f=new JFrame();
      
		l1.setBounds(20,30,120,20);
		l1.setFont(g);
		
		l2.setBounds(20,70,100,20);
		l2.setFont(g);
		l3.setBounds(20,110,120,20);
		l3.setFont(g);
        l4.setBounds(20,150,100,20);
		l4.setFont(g);
        l5.setBounds(20,190,130,20);
		l5.setFont(g);
		l6.setBounds(20,230,200,20);
		l6.setFont(g);
		l7.setBounds(20,350,200,20);
		l7.setFont(g);
		l8.setBounds(20,390,200,20);
		l8.setFont(g);
		l9.setBounds(20,430,200,20);
		l9.setFont(g);
		l10.setBounds(20,470,200,20);
		l10.setFont(g);
		l11.setBounds(20,540,200,20);
		l11.setFont(g);	
		l12.setBounds(20,580,200,20);
		l12.setFont(g);	
		l13.setBounds(20,620,200,20);
		l13.setFont(g);		
		t1.setBounds(300,30,100,20);
		t2.setBounds(300,70,100,20);
		t3.setBounds(300,110,100,20);
        t4.setBounds(300,150,100,20);
		t5.setBounds(300,190,100,20);
		t6.setBounds(300,230,100,20);
		t7.setBounds(300,350,100,20);
		t8.setBounds(300,390,100,20);
		t9.setBounds(300,430,100,20);
		t10.setBounds(300,470,100,20);
		t11.setBounds(300,540,100,20);
		t12.setBounds(300,580,100,20);
		t13.setBounds(300,620,100,20);
		b1.setBounds(150,270,90,20);
        b2.setBounds(290,270,70,20);
		b3.setBounds(20,310,250,20);
		b4.setBounds(20,510,200,20);
		
		b1.setBackground(Color.GRAY);
		b2.setBackground(Color.GRAY);
		b3.setBackground(Color.GRAY);
		b4.setBackground(Color.GRAY);
		
		
		//Adding components to the frame
		f.add(l1);
		f.add(l2);
		f.add(l3);
        f.add(l4);
        f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(t1);
		f.add(t2);
		f.add(t3);
        f.add(t4);
        f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(t9);
		f.add(t10);
		f.add(t11);
		f.add(t12);
		f.add(t13);
		f.add(b1);
        f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(this);
        b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		       addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                f.dispose();  
            }  
        });
		JScrollBar s=new JScrollBar();  
		s.setBounds(470,0,30,1000);  
        f.add(s);  
		
		f.setLayout(null);
		
        f.setTitle("HOME LOAN CALCULATOR USING 3 STRATEGIES");
		f.setVisible(true);
		f.setSize(500,1000);

	}


	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t1.getText());//Loan amount
		float n2=Float.parseFloat(t2.getText());//interest
        int n3=Integer.parseInt(t3.getText());//period
		
		if(e.getSource()==b1)
		{
            float emi=0,ip=0,tp=0;
			
			float p2=(float)n2/(12*100);
			float p3=(float)n3*12;
            emi=(n1*p2*(float)Math.pow(1+p2,p3))/(float)(Math.pow(1+p2,p3)-1);
			
			t4.setText(String.valueOf(emi));
            ip=(emi*n3*12)-n1;
			t5.setText(String.valueOf(ip));
			tp=ip+n1;
			t6.setText(String.valueOf(tp));
		}

		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		if(e.getSource()==b3)
		{
			float ipnew=0,newemi=0;
			  
			float nm=n3*12-n3+1;
			float c2=(float)n2/(12*100);
			newemi=(n1*c2*(float)Math.pow(1+c2,nm))/(float)(Math.pow(1+c2,nm)-1);
			ipnew=(newemi*nm)-n1;
			t7.setText(String.valueOf(nm));
			t8.setText(String.valueOf(ipnew));
			float tp21=ipnew+n1;
			t9.setText(String.valueOf(tp21));
		}
		float bonuspay=Float.parseFloat(t10.getText());//Bonuspay
		if(e.getSource()==b4)
		{
			float emi21=0;
			float tamountp=0;
			float ipaid=0;
			float nmonthsp=0;
			float p5=(float)n2/(12*100);
			float p6=(float)n3*12;
			int h=(int)p6;
			emi21=(n1*p5*(float)Math.pow(1+p5,p6))/(float)(Math.pow(1+p5,p6)-1);
			float emi221[]=new float[h+1];
			float prin_outstan_beg[]=new float[h+1];
			float outstan_prin_end[]=new float[h+1];
			float prin_rep[]=new float[h+1];
			float int_pai_tm[]=new float[h+1];
			
			for(int i=1;i<=h;i++)
			{
				emi221[i]=emi21;
				if(i==1)
				{
					prin_outstan_beg[i]=n1;
				}
				else
				{
					prin_outstan_beg[i]=outstan_prin_end[i-1];
				}
				int_pai_tm[i]=prin_outstan_beg[i]*p5;
				prin_rep[i]=emi221[i]-int_pai_tm[i];
				if(i%12==0)
				{
				outstan_prin_end[i]=prin_outstan_beg[i]-prin_rep[i]-bonuspay;
				}
				else
				{
				outstan_prin_end[i]=prin_outstan_beg[i]-prin_rep[i];
				}
			}
			for(int i=1;i<=h;i++)
			{
			if(int_pai_tm[i]>0)
				{
					ipaid+=int_pai_tm[i];
				    nmonthsp++;
				}
			}
			tamountp=n1+ipaid;
			t11.setText(String.valueOf(nmonthsp));
			t12.setText(String.valueOf(ipaid));
			t13.setText(String.valueOf(tamountp));
		}

	}

	
	public static void main(String args[])
	{
		new HomeLoanCalculator();
		System.out.println("Home Loan Calculator Has Started");
	}
}
