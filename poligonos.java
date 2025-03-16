package poligonos;
import java.util.Scanner;
/**
 *
 * @author Giovanna Jesus Borba
 * Data de alteração: 16/03/2025
 * Objetivo do projeto: Identificar polígonos e apresentar valor de sua área
 */
public class Poligonos {

    public static void main(String[] args) {
         //Criando o objeto leitor do tipo Scanner para receber dados que serão digitados pelo usuário
        Scanner leitor = new Scanner (System.in);
        
        //Declaração de variáveis de entrada
        int NumLados_int;
        double MedLado1_dbl,MedLado2_dbl,MedLado3_dbl,apotema_dbl;
        //Declaração de variáveis de processamento
        double area_dbl, semip_dbl, perimetro_dbl;
        
        System.out.println("Digite quantos lados tem o seu poligono: ");//Solicitação para que o usuário informe a quantidade de lados que seu polígono possui
        NumLados_int = leitor.nextInt();//A variável irá armazenar o dado que o usuário forneceu
        
            //Estruturas de decisão
           
            //Se o número de lados for igual a três 
            if(NumLados_int == 3){
                //Será ser solicitado que o usuário informe o tamanho dos três lados do polígono
                System.out.println("Digite o valor do primeiro lado: ");
                MedLado1_dbl = leitor.nextDouble();
                System.out.println("Digite o valor do Segundo lado: ");
                MedLado2_dbl = leitor.nextDouble();
                System.out.println("Digite o valor do terceiro lado: ");
                MedLado3_dbl = leitor.nextDouble();
          
                perimetro_dbl = MedLado1_dbl + MedLado2_dbl + MedLado3_dbl;//Sabendo os lados do polígono, será cálculado o perímetro
                semip_dbl = perimetro_dbl/2;//Depois será calculado o semiperímetro
                area_dbl = Math.sqrt(semip_dbl*(semip_dbl-MedLado1_dbl)* (semip_dbl-MedLado2_dbl) * (semip_dbl-MedLado3_dbl));//Por ultimo será calculado a área do triângulo com a fórmula de HERON
                
                //Após ser realizado todos os cálculos, será apresentado ao usuário qual é seu polígono e sua área
                System.out.println("O seu poligono e um triangulo, o valor de sua area e de: " + area_dbl);
            }
            //Se o número de lados for igual a quatro
            else if(NumLados_int == 4){
                //Será solicitado o tamanho de dois dos lados do polígono 
                System.out.println("Digite o valor do primeiro lado: ");
                MedLado1_dbl = leitor.nextDouble();
                System.out.println("Digite o valor do Segundo lado: ");
                MedLado2_dbl = leitor.nextDouble();
                //Com os dados fornecidos, será calculado a área do quadrado
                area_dbl = MedLado1_dbl * MedLado2_dbl;
                //Após ser realizado todo o cálculo, será apresentado ao usuário qual é seu polígono e sua área
                System.out.println("O seu poligono e um quadrado, o valor de sua area e de: " + area_dbl);
            }
            //Se o polígono possuir 5 lados
            else if(NumLados_int == 5){
                System.out.println("Digite o valor de um dos lados: ");//Será solicitado o valor de um dos lados 
                MedLado1_dbl = leitor.nextDouble();
                System.out.println("Digite o valor da apotema: ");//E o valor da apótema
                apotema_dbl = leitor.nextDouble();
                //Será calculado o perimetro
                perimetro_dbl = MedLado1_dbl * 5;   
                area_dbl = 0.5 * perimetro_dbl * apotema_dbl;
                //Depois a área
                System.out.println("O seu poligono e um pentagono, o valor de sua area e de: " + area_dbl);
            }
            //Se o número de lados for menor que três
            else if(NumLados_int < 3){
                System.out.println("Nao e um Poligono");//O usuário será informado que isso não é um polígono
            }
            //Caso as informações não tenham se encaixado em nenhuma dessas estruturas de decisões, ou seja, o número de lados é maior que 5
            else{
                System.out.println("Poligono nao encontrado");//O usuário será informado que o polígono não foi indentificado
            }
    }
    
}
