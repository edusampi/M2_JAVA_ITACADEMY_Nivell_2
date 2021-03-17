import javax.swing.JOptionPane;
import java.util.Scanner;
public class M2Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


// NIVELL 2:  ESCALA DE NOMBRES --------------------------------------------
		
	  String texto=JOptionPane.showInputDialog("Introdueix un nombre: ");
	      int altura=Integer.parseInt(texto);
	      escala(altura);
	}
	 
	    public static void escala (int altura){
	        for (int i=1;i<=altura;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(j);
	            }
	            System.out.println("");
	        }
	        System.out.println("");
	        
// NIVELL 2:  PIRAMIDE INVERTIDA *  ----------------------------------------
      
	
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Introdueix un nombre: ");
	    int numFilas = sc.nextInt();
	    sc.close();
	    System.out.println();
	        for(int numBlancos = 0, numAsteriscos = (numFilas*2)-1; numAsteriscos>0; numBlancos++, numAsteriscos -= 2){	       	
	                for(int i=0; i < numBlancos; i++){
	                    System.out.print(" ");
	                }	                 
	                	for(int j=numAsteriscos; j > 0; j--){
	                		System.out.print("*");
	                	}
	                System.out.println();
	       }
	        
	}

}
    
