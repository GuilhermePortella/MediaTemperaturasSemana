/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
/**
 *
 * @author Guilherme
 */
import java.util.*;
public class temperaturaMediaSemana {
    public static void main(String[] args) {
        
        double temperaturas[] = new double[7];
        
        String diasSemana[]={"Segunda-feira","Terça-feira","Quarta feira","Quinta feira","Sexta-feira","sábado","domingo"};
        
        double soma = 0,max=0,min=0;
        
        int dia,posMax=0,posMin=0;
        
        boolean seguir = true;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        
        do {
        System.out.println("Digite a temperatura nos dias a seguir "+
                "\nSo é permitido numeros com separação por ponto ou numeros inteiros ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ":");
            temperaturas[i] = sc.nextDouble();
            soma = soma + temperaturas[i];
            
            
            
            if (i==0){
                min=temperaturas[0];posMin=0;
                max=temperaturas[0];posMax=0;
            }
            else{
                if (temperaturas[i]>=max){
                    max=temperaturas[i];
                    posMax=i;
                }
                if (temperaturas[i]<=min){
                    min=temperaturas[i];
                    posMin=i;
                }
            }
        }
        
        System.out.println("A temperatura média foi :" + soma / 7);
        System.out.println("<------------------------------------------------->");
        System.out.println("A temperatura maxima foi de "+max+" graus no dia de "+diasSemana[posMax]);
        System.out.println("<------------------------------------------------->");
        System.out.println("A temperatura minima foi de "+min+" graus no dia de "+diasSemana[posMin]);
        System.out.println("<------------------------------------------------->");
        
        do {
            System.out.println("Digite o indice do dia em que deseja rever a temperatura:\n"+       
                            "\"Para Segunda-feira digite 1\",\n" +
                            "\"Para Terça-feira digite 2\",\n" +
                            "\"Para Quarta feira digite 3\",\n" +
                            "\"Para Quinta feira digite 4\",\n" +
                            "\"Para Sexta-feira digite 5\",\n" +
                            "\"Para Sábado digite 6\",\n" +
                            "\"Para Domingo digite 7\" \n ");
            dia = sc.nextInt();
        } while (dia<1 || dia>7);
        
        System.out.println("A temperatura estava: "+ temperaturas[dia-1]+"\n" );
        System.out.println("Você quer repetir ? (true / false)");
        seguir = sc.nextBoolean();
        
        } while (seguir == true);
    }
}

   