import javax.swing.JOptionPane;

public class MostraNumero
{
   public static void main (String [] args)
   {
      int numero;
            
      numero = Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero:"));  
      
      String resultado = "O valor do npumero digitado é: " + numero;
      
      JOptionPane.showMessageDialog (null, resultado);
      
      System.exit(0);
   }
}