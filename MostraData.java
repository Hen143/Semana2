import javax.swing.JOptionPane;

public class MostraData
{
   public static void main (String [] args)
   {
      int numero1;
      int numero2;
      int numero3;
            
      numero1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um dia:"));  
      numero2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um mês (em número):"));
      numero3 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um ano:"));
      
      String resultado = numero1 + "/" + numero2 + "/" + numero3;
      
      JOptionPane.showMessageDialog (null, resultado);
      
      System.exit(0);
   }
}