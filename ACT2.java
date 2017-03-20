import java.util.*;
public class ACT2
{
   public static void main(String[] args){
   Scanner lector=new Scanner(System.in);
   
   double souBrut,resta1=0.05,total1,total2,total3,resta2=0.15,resta3=0.25;
   
   System.out.println("Disme el teu sou que guanyes al mes");
   souBrut=lector.nextDouble();

   if (souBrut<1000){
   resta1=resta1*souBrut;
   total1=souBrut-resta1;
   System.out.println("El sou es de: "+total1);
}
if(souBrut>1000 && souBrut<1500) {
   resta2=resta2*souBrut;
   total2=souBrut-resta2;
   System.out.println("El sou es de: "+total2);
}
if (souBrut>1500){
   resta3=resta3*souBrut;
   total3=souBrut-resta3;
   System.out.println("El sou es de: "+total3);
}
}
}
