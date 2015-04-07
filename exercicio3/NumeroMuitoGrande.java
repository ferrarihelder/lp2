import java.util.Scanner;
public class NumeroMuitoGrande{

int A[] = new int[30];
int B[] = new int[30];
int R[] = new int[30];
      
int i;

public void ler (){
      Scanner input=new Scanner(System.in);
      
      
System.out.println("Digite o primeiro número: ");
      
String nmg1 = input.next();


      int tamanho1 = nmg1.length();
      
System.out.println ("Digite o segundo número: ");
      
String nmg2 = input.next();
      int 

tamanho2 = nmg2.length();
      
      for (i= tamanho1-1; i>=0; i--){
       
   A[i] = Character.getNumericValue(nmg1.charAt(i));
      
}


      
for (i= tamanho2-1; i>=0; i--){

          B[i] = Character.getNumericValue(nmg2.charAt(i));


      }
}
public void soma (){
       
       int aux=0;
       for (i = 29; i >= 0; i--) {
           R[i]=A[i]+B[i];
           if (resul[i]<9){
                R[i]=+ A[i]+B[i];
           }else{
              aux=resul[i];
              R[i]= ((A[i]+B[i])%10);
              R[i-1]= 1;
           }
        }
         
}
public void imprimir() {
        System.out.print("Soma:   ");
        for(i = 0; i < 29; i++){
            System.out.print(R[i]);
        }
        System.out.println(" ");
}

public static void main(String[] args){
     NumeroMuitoGrande bb = new NumeroMuitoGrande();
     bb.ler();
     bb.soma();
     bb.imprimir();
        
}
}
