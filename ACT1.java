import java.util.*;
import java.text.DecimalFormat;
public class ACT1
{
    public static void main (String [] args) {
        Scanner lector=new Scanner(System.in);
        double nota1,nota2,nota3,nota4,suma,mitja;
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Dis-me nota assignatura 1: ");
        nota1=lector.nextDouble();
        if(nota1<3.5){
             System.out.println("Tens una nota molt baixa per a fer mitja");
            }
            else{
                System.out.println("Necessites un 4.5 per a aprovar l'assignatura ");
            }
        System.out.println("Dis-me nota assignatura 2: ");
        nota2=lector.nextDouble();
        if(nota2<3.5){
            System.out.println("Tens una nota molt baixa per a fer mitja");
        }else{
                System.out.println("Necessites un 3.5 per a aprovar l'assignatura ");
            }
        System.out.println("Dis-me nota assignatura 3: ");
        nota3=lector.nextDouble();
            if(nota3<3.5){
            System.out.println("Tens una nota molt baixa per a fer mitja");
        }else{
                System.out.println("Necessites un 4.5 per a aprovar l'assignatura ");
            }
        System.out.println("Dis-me nota assignatura 4: ");
        nota4=lector.nextDouble();
            if(nota4<3.5){
            System.out.println("Tens una nota molt baixa per a fer mitja");
        }else{
                System.out.println("Necessites un 3.75 per a aprovar l'assignatura ");
            }
        
       
        mitja=(nota1+nota2+nota3+nota4)/4;
        System.out.println("La nota mitjana de tot el curs es: "+mitja);
        }
    }
