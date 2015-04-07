import java.util.Scanner;

public class VerificadorCpf {
       
    public static void main(String[] args) {
       int j=2;
       int restodivisao;
       int soma=0;
       int i;
       int peso [] = new int[11];
       int numero [] = new int [11];
       int resul [] = new int [11];
       
       //Ler CPF
       Scanner input = new Scanner(System.in);
       System.out.println ("Digite os 9 primeiros dígitos do seu CPF: ");
       String cpfnro = input.next(); 
            for (i=8;i>=0;i--){
                numero [i] = Character.getNumericValue(cpfnro.charAt(i)); //converter para int
                
            } 
            for (i=8;i>=0;i--){
                peso[i] = j;
                j++;
                
            }
            for (i=8;i>=0;i--) {
                resul[i]= numero[i] * peso[i];
                
            } 
            for (i=0;i<9; i++) { 
                soma+=resul[i];
            }
        
        restodivisao = soma%11;
        
        
        if(restodivisao<2){
            i=9;
            numero[i]=0;
        }
        else{
            numero[i]= 11-restodivisao;
        
        }
        for (i=9;i>=0;i--){
        
        }

         j=2;
              for (i=9;i>=0;i--){
                peso[i] = j;
                j++;
                
            }
            
            for (i=9;i>=0;i--) {
                resul[i]= 0;
            }
      
             
            for (i=9;i>=0;i--) {
                resul[i]= numero[i] * peso[i];
               
            }
            soma=0;
            for (i=0;i<10; i++) { 
		soma+=resul[i];
            }
            //segunda
            
             restodivisao = soma%11;
        
            

            
          if(restodivisao<2){
            i=10;
            numero[i]=0;
        }
        else{
            numero[i]= 11-restodivisao;
        
        }
       
        System.out.println("Seu CPF completinho:");
        for (i=0;i<=10;i++){
        System.out.print(numero[i]);
        } 

        
          

            
       

}
}
