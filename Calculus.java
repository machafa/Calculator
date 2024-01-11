package telas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculus {

	JFrame frame;
	JButton primos,pares,impares,soma,sub,multi, div, fib;
	JPanel panel,buttons,texts;
	JTextField calc;
	JTextArea result;
	JScrollPane scroll;
	public Calculus() {
		
		frame=new JFrame();
		frame.setTitle("Calculator");
		frame.setSize(400,220);
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
		Text2 text2=new Text2();
		
		Date date=new Date();
		text2.texto("\n"+date.toString());
		
		result=new JTextArea(3,20);
		result.setBackground(Color.BLACK);
		result.setForeground(Color.white);
		result.setEditable(false);
		
		scroll = new JScrollPane(result);
		scroll.setBounds(3, 3, 300, 200);
		
		calc=new JTextField(20);
		
		primos=new JButton("Primos");
		primos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				int i,m=0,flag=0;      
				  int n=Integer.parseInt(calc.getText());    
				  m=n/2;      
				  if(n==0||n==1){  
				   JOptionPane.showMessageDialog(frame, "Numero deve ser maior que 1","Ooops!!", JOptionPane.ERROR_MESSAGE);
				   
				  }else{  
				   for(i=2;i<=m;i++){      
				    if(n%i==0){   
				    	
				    	result.append(n+" NOT PRIME\n");
				    	calc.setText("NOT PRIME");
				    	text2.texto("\n"+n+" NOT PRIME");
				    	    
				     flag=1;      
				     break;      
				    }      
				   }      
				   if(flag==0){ 
					   result.append(n+" PRIME\n");
					   calc.setText(" PRIME");
					   
					   text2.texto("\n"+n+" PRIME");
				   }  
				  }//end of else 
				 
			}
			
		});
		
		pares=new JButton("Pares");
		pares.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n=Integer.parseInt(calc.getText());
				if(n%2==0) {
					result.append(n+" EVEN\n");
			    	calc.setText("EVEN");
			    	text2.texto("\n"+n+" EVEN");
				}else {
					result.append(n+" ODD\n");
			    	calc.setText("ODD");
			    	text2.texto("\n"+n+" ODD");
				}
				
			}
			
		});
		impares=new JButton("Impares");
		impares.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int n=Integer.parseInt(calc.getText());
				if(n%2!=0) {
					
			    	result.append(n+" ODD\n");
			    	calc.setText("ODD");
			    	text2.texto("\n"+n+" ODD");
				}else {
					result.append(n+" EVEN\n");
			    	calc.setText("EVEN");
			    	text2.texto("\n"+n+" EVEN");
				}
				
			}
			
		});
		soma=new JButton("Soma");
		soma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//int n=Integer.parseInt(calc.getText());
				String n=calc.getText();
				int soma=0;
				if(n.contains("+")) {
					String[] arrOfStr = n.split("\\+");
					 
			        for (String a : arrOfStr)
			        	soma=soma+Integer.parseInt(a);
			        	result.append(n+"="+soma+"\n");
			        	calc.setText(soma+"");
			        	text2.texto(n+"="+soma+"\n");
					
				}
		        
				
			}
			
		});
		sub=new JButton("Subtrair");
		sub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//int n=Integer.parseInt(calc.getText());
				String n=calc.getText();
				int soma=0;
				if(n.contains("-")) {
					String[] arrOfStr = n.split("\\-");
					 
			        for (String a : arrOfStr)
			        	soma=Integer.parseInt(a)-soma;
			        	result.append(n+"="+soma+"\n");
			        	calc.setText(soma+"");
			        	text2.texto(n+"="+soma+"\n");
				}
 		        
				
			}
			
		});
		fib=new JButton("Fibonacci");
		fib.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int aux=Integer.parseInt(calc.getText());
				int num1 = 0, num2 = 1; 
				String x="";
		         for(int i=0;i<aux;i++) {
		        	 x=num1+" "+x;
		        	 result.append(x+"\n"); 
		        	 text2.texto(aux+" sequencias de fibonacci: "+x);
			            // Swap 
			            int num3 = num2 + num1; 
			            num1 = num2; 
			            num2 = num3;
		         }    
			}
			
		});
		div=new JButton("Dividir");
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n=calc.getText();
				double soma=1;
				if(n.contains("/")) {
					String[] arrOfStr = n.split("\\/");
					 
			        for (String a : arrOfStr)
			        	soma=Double.parseDouble(a)/soma;
			        	result.append(n+"="+soma+"\n");
			        	calc.setText(soma+"");
			        	text2.texto(n+"="+soma+"\n");
				}
			}
			
		});
		multi=new JButton("Multi");
		multi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String n=calc.getText();
				double soma=1;
				if(n.contains("*")) {
					String[] arrOfStr = n.split("\\*");
					 
			        for (String a : arrOfStr)
			        	soma=Double.parseDouble(a)*soma;
			        	result.append(n+"="+soma+"\n");
			        	calc.setText(soma+"");
			        	text2.texto(n+"="+soma+"\n");
				}
			}
			
		});
		
		texts=new JPanel(new GridLayout(2,1));
		texts.add(scroll);
		texts.add(calc);
		
		buttons=new JPanel();
		buttons.setLayout(new GridLayout(2,4));
		buttons.add(soma);
		buttons.add(sub);
		buttons.add(div);
		buttons.add(multi);
		buttons.add(pares);
		buttons.add(impares);
		buttons.add(primos);
		buttons.add(fib);
		
		panel=new JPanel();
		panel.add(texts);
		panel.add(buttons);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculus();
	}

}
