
package Calculadora;


import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.WindowConstants;

public class Calcu {

	JFrame frame;
	JPanel panelSuperior, panelInferior;
	
	JButton boton[];
	double operando1=0,operando2=0;
	String operacion="";
	boolean nueva=true;
	
	
	JLabel Etiqueta;

	
	

	public Calcu() {
		construyePanelSuperior();
		construyePanelInferior();
		construyeVentana();
	}

	void construyePanelSuperior() {
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout());
		Etiqueta = new JLabel("0");
		panelSuperior.add(Etiqueta);
	}

	void construyePanelInferior() {
		panelInferior = new JPanel();
		panelInferior.setLayout(new GridLayout(4, 5));
		
	    
	        boton = new JButton[20];
	       
	        boton[0]=new JButton("CE");
	        boton[1]=new JButton("+/-");
	        boton[2]=new JButton("del");
	        boton[3]=new JButton("");
	        boton[4]=new JButton("7");
	        boton[5]=new JButton("8");
	        boton[6]=new JButton("9");
	        boton[7]=new JButton("/");
	        boton[8]=new JButton("4");
	        boton[9]=new JButton("5");
	        boton[10]=new JButton("6");
	        boton[11]=new JButton("*");
	        boton[12]=new JButton("1");
	        boton[13]=new JButton("2");
	        boton[14]=new JButton("3");
	        boton[15]=new JButton("-");
	        boton[16]=new JButton("0");
	        boton[17]=new JButton(".");
	        boton[18]=new JButton("=");
	        boton[19]=new JButton("+");
	        
	        
	        	panelInferior.add(boton[4]);
	        	panelInferior.add(boton[5]);
	        	panelInferior.add(boton[6]);
	        	panelInferior.add(boton[1]);
	        	panelInferior.add(boton[2]);
	        	panelInferior.add(boton[8]);
	        	panelInferior.add(boton[9]);
	        	panelInferior.add(boton[10]);
	        	panelInferior.add(boton[11]);
	        	panelInferior.add(boton[7]);
	        	panelInferior.add(boton[12]);
	        	panelInferior.add(boton[13]);
	        	panelInferior.add(boton[14]);
	        	panelInferior.add(boton[15]);
	        	panelInferior.add(boton[3]);
	        	panelInferior.add(boton[0]);
	        	panelInferior.add(boton[16]);
	        	panelInferior.add(boton[17]);
	        	panelInferior.add(boton[19]);
	        	panelInferior.add(boton[18]);
	        	
	        
	        boton[19].addActionListener(new ActionListener(){
	         
	            public void actionPerformed(ActionEvent e){
	                try{
	                    if(operando1!=0)
	                        operando1=operando1+Double.parseDouble(Etiqueta.getText());
	                    else
	                        operando1=Double.parseDouble(Etiqueta.getText());
	                    operacion="suma";
	                    Etiqueta.setText("");
	                }catch(Exception err){}
	            }
	        });
	        boton[15].addActionListener(new ActionListener(){
	     
	            public void actionPerformed(ActionEvent e){
	                try{
	                    if(operando1!=0)
	                        operando1=operando1-Double.parseDouble(Etiqueta.getText());
	                    else
	                        operando1=Double.parseDouble(Etiqueta.getText());
	                    operacion="resta";
	                    Etiqueta.setText("");
	                }catch(Exception err){}
	            }
	        });
	        boton[11].addActionListener(new ActionListener(){
	         
	            public void actionPerformed(ActionEvent evt){
	                try{
	                    if(operando1!=0)
	                        operando1=operando1*Double.parseDouble(Etiqueta.getText());
	                    else
	                        operando1=Double.parseDouble(Etiqueta.getText());
	                    operacion="multiplicacion";
	                    Etiqueta.setText("");
	                }catch(Exception err){}
	            }
	        });
	        boton[7].addActionListener(new ActionListener(){
	           
	            public void actionPerformed(ActionEvent evt){
	                try{
	                    if(operando1!=0)
	                        operando1=operando1/Double.parseDouble(Etiqueta.getText());
	                    else
	                        operando1=Double.parseDouble(Etiqueta.getText());
	                    operacion="division";
	                    Etiqueta.setText("");
	                }catch(Exception err){}
	            }
	        });
	        boton[1].addActionListener(new ActionListener(){
		           
	            public void actionPerformed(ActionEvent evt){
	                try{
	                    if(operando1!=0)
	                        operando1=operando1/Double.parseDouble(Etiqueta.getText());
	                    else
	                        operando1=Double.parseDouble(Etiqueta.getText());
	                    operacion="+/-";
	                    
	                }catch(Exception err){}
	            }
	        });
	        
	      
	        boton[4].addActionListener(new ActionListener(){
	           
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"7");
	            }
	        });
	        boton[5].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"8");
	            }
	        });
	        boton[6].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"9");
	            }
	        });
	        boton[8].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"4");
	            }
	        });
	        boton[9].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"5");
	            }
	        });
	        boton[10].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"6");
	            }
	        });
	        boton[12].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"1");
	            }
	        });
	        boton[13].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"2");
	            }
	        });
	        boton[14].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"3");
	            }
	        });
	        boton[16].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+"0");
	            }
	        });
	        boton[17].addActionListener(new ActionListener(){
	     
	            public void actionPerformed(ActionEvent evt){
	                if(nueva){Etiqueta.setText("");nueva=false;}
	                Etiqueta.setText(Etiqueta.getText()+".");
	            }
	        });
	  
	        boton[18].addActionListener(new ActionListener(){
	          
	            public void actionPerformed(ActionEvent evt){
	                try{
	                    operando2=Double.parseDouble(Etiqueta.getText());
	                }catch(Exception err){}
	                if(operacion.equals("suma")){
	                    double res=operando1+operando2;
	                    Etiqueta.setText(String.valueOf(res));
	                    operando1=operando2=0;
	                    operacion="";
	                }else if(operacion.equals("resta")){
	                    double res=operando1-operando2;
	                    Etiqueta.setText(String.valueOf(res));
	                    operando1=operando2=0;
	                    operacion="";
	                }else if(operacion.equals("multiplicacion")){
	                    double res=operando1*operando2;
	                    Etiqueta.setText(String.valueOf(res));
	                    operando1=operando2=0;
	                    operacion="";
	                }else if(operacion.equals("division")){
	                    double res=operando1/operando2;
	                    Etiqueta.setText(String.valueOf(res));
	                    operando1=operando2=0;
	                    operacion="";
	                }else if(operacion.equals("+/-")) {
	                	double res=(operando1*(-1));
	                	Etiqueta.setText(String.valueOf(res));
	                	operacion="";
	                }
	                nueva=true;
	            }
	        });
	        //CE
	        boton[0].addActionListener(new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent evt){
	                Etiqueta.setText("");
	                operando1=operando2=0;
	                operacion="";
	            }
	        });
	    }
		
	
	void construyeVentana() {
		frame = new JFrame("Calculadora ");
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(panelSuperior);
		frame.add(panelInferior);
		frame.pack();//hace que se autoajuste al tamaño de la ventana
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) {
		Calcu A = new Calcu();

	}
}
