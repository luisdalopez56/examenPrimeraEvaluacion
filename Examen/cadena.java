import java.util.Scanner;
public class cadena{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      char l;
      int i=0;
      
      System.out.println("Escribe una palabra");
      String palabra = sc.nextLine();
     
      l = palabra.charAt(i);
      
     for(i=0;i < 1; i++){
         
        if(l == 'a'){
             System.out.println("Comienza por vocal");
            }
         
        if(l == 'e'){
         
        System.out.println("Comienza por vocal");
        }
         
        if(l == 'i'){
             System.out.println("Comienza por vocal");
            }
            
        if(l == 'o'){
        System.out.println("Comienza por vocal");
        }
         
            if(l == 'u'){
         System.out.println("Comienza por vocal");
        }
        
        }
     System.out.println("No comienza por vocal");
        int contador=0;
        
     for(i=0;i < palabra.length(); i++){
          
         l = palabra.charAt(i);
         
        if(l == 'á'){
            contador++;
            }
         
        if(l == 'é'){
            contador++;
            }    
            
        if(l == 'í'){
             contador++;
            }
            
        if(l == 'ó'){
         contador++;
        }
         
            if(l == 'ú'){
          contador++;
        }
        
        }
      System.out.println("Tiene " + contador + " vocales acentuadas");
      
      int nacentuadas = 0;
      for(i=0;i < palabra.length(); i++){
          
         l = palabra.charAt(i);
         
        if(l == 'a'){
            nacentuadas++;
            }
         
        if(l == 'e'){
            nacentuadas++;
            }    
            
        if(l == 'i'){
             nacentuadas++;
            }
            
        if(l == 'o'){
         nacentuadas++;
        }
         
            if(l == 'u'){
          nacentuadas++;
        }
        
        }
        System.out.println("Tiene " + nacentuadas + " vocales no acentuadas");
        
        int ndem = 0,nden = 0,ndep = 0;
        for(i=0;i < palabra.length(); i++){
          
         l = palabra.charAt(i);
         
        if(l == 'm'){
            ndem++;
            }    
            
        if(l == 'n'){
             nden++;
            }
            
        if(l == 'p'){
            ndep++;
        }
    
        if(l == 'M'){
            ndem++;
            }    
            
        if(l == 'N'){
             nden++;
            }
            
        if(l == 'P'){
            ndep++;
        }
        }
        
        System.out.println("Tiene " + ndem + " consonantes que son m");
        System.out.println("Tiene " + nden + " consonantes que son n");
        System.out.println("Tiene " + ndep + " consonantes que son p");
   }
}