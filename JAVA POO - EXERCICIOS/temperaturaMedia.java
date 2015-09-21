import javax.swing.JOptionPane;

public class temperaturaMedia {

	public static void main(String[] args){
		float f1,f2,f3;

	 f1 = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "Digite a primeira temperatura em Fahrenheit: ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE) );

	 f2 = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "Digite a segunda temperatura em Fahrenheit: ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE) );

	 f3 = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "Digite a terceira temperatura em Fahrenheit: ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE) );


     double  conversaoC = (f1 - 32) / 1.8;

     double  conversaoK = conversaoC + 273;


     double  conversaoC1 = (f2 - 32) / 1.8;

     double  conversaoK1 = conversaoC1 + 273;



     double  conversaoC2 = (f3 - 32) / 1.8;

     double  conversaoK2 = conversaoC2 + 273;




     double  mediaK = (conversaoK+conversaoK1+conversaoK2) / 3;




   JOptionPane.showMessageDialog (null,
                 "a temperaturatura em Kelvin é: " + conversaoK + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);




   JOptionPane.showMessageDialog (null,
                 "a temperaturatura em Kelvin é: " + conversaoK1 + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);





   JOptionPane.showMessageDialog (null,
                 "a temperaturatura em Kelvin é: " + conversaoK2 + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);



  JOptionPane.showMessageDialog (null,
                 "a media de Kelvin : " + mediaK + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);






	}








public static void mediaDois(String[] args){
		float f1,f2,f3;

	 f1 = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "Digite a primeira temperatura em Fahrenheit: ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE) );

	 f2 = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "Digite a segunda temperatura em Fahrenheit: ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE) );

	 f3 = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "Digite a terceira temperatura em Fahrenheit: ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE) );


     double  conversaoC = (f1 - 32) / 1.8;

     double  conversaoK = conversaoC + 273;


     double  conversaoC1 = (f2 - 32) / 1.8;

     double  conversaoK1 = conversaoC1 + 273;



     double  conversaoC2 = (f3 - 32) / 1.8;

     double  conversaoK2 = conversaoC2 + 273;


     double  mediaC = (conversaoC=conversaoC1+conversaoC2) / 3;

     double  mediaK = (conversaoK+conversaoK1+conversaoK2) / 3;

   JOptionPane.showMessageDialog (null,
                 "a temperatura em celsius é: " + conversaoC + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);




  JOptionPane.showMessageDialog (null,
                 "a temperaturatura emm celsius é: " + conversaoC1 + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);



  JOptionPane.showMessageDialog (null,
                 "a temperaturatura emm celsius é: " + conversaoC2 + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);




  JOptionPane.showMessageDialog (null,
                 "a media de celsius : " + mediaC + " ",
                 "temperaturaMedia", JOptionPane.INFORMATION_MESSAGE);








	}





























}