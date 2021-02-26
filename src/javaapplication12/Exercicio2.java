package javaapplication12;
import javax.swing.JOptionPane;


    public class Exercicio2{
        public static void main(String[] args){
            float temp[] = new float[7];
            float media = 0f;
            int quant = 0;
            String num;
            try{
                for(int i = 0; i < temp.length; i++){
                    num = JOptionPane.showInputDialog(
                            "Digite o valor " + i + ":");
                    temp[i] = Float.parseFloat(num);
                }
                for(int i = 0; i < temp.length; i++)
                    media = media + temp[i];
                media = media / temp.length;
                System.out.print("Media das temperaturas na semana: \n");
                System.out.print("Media das temperaturas acima da media ");
                System.out.printf("%s%.1f%s\n", "(", media, "):");
                for (int i = 0; i < temp.length; i++){
                    if(temp[i] > media){
                        System.out.printf("%s%d%s%.1f\n",
                                "temperatura [", i, "]= ", temp[i]);
                        quant = quant + 1;
                    }
                }
                System.out.printf("%s%d",
                        "Quantos dias a temperatura ficou acima da media: ", quant);
            }catch(Exception e){
                JOptionPane.showMessageDialog(
                        null, "Digite apenas temperatras, não são aceitos caracteres nem numeros com virgura, somente com pontos exp 29.1!");
            }
        } 
    }