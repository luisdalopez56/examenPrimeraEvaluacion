import java.util.Scanner;
public class numero{
public static void main (String[]args) {
   Scanner numero = new Scanner (System.in);
    
   System.out.println("Introduce el numero:");
   int n1 = numero.nextInt();
  
    if (n1 > 4 & n1 < 1000){
   	
       if(n1 % 2 == 0){
        System.out.printf("El numero %d es par %n",n1);
           }else
           System.out.printf("El numero %d es impar %n", n1);
       
       if(n1 % 3 == 0 & n1 % 5 == 0){
        System.out.printf("El numero %d es multiplo de 3 y 5 %n",n1);
        }else
        System.out.printf("El numero %d no es multiplo de 3 y 5 %n",n1);           
       
       
       
     
        
        }else 
   		System.out.println("Datos incorrectos");
   
   		//He intentado contar digitos pero no me sale bien
   //System.out.println("Vuelve a introducir el numero que quieras y te dire el numero de digitos:");
       //String n1String = numero.nextLine();		
   	
         //System.out.println(n1String.length());
   	}
   }
