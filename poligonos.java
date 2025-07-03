package poligonos;
import java.util.Scanner;

public class Poligonos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int NumLados_int;
        double MedLado1_dbl,MedLado2_dbl,MedLado3_dbl,apotema_dbl;
        double area_dbl, semip_dbl, perimetro_dbl;
        
        System.out.println("Digite quantos lados tem o seu poligono: ");
        NumLados_int = leitor.nextInt();
                   
            if(NumLados_int == 3){
                System.out.println("Digite o valor do primeiro lado: ");
                MedLado1_dbl = leitor.nextDouble();
                System.out.println("Digite o valor do Segundo lado: ");
                MedLado2_dbl = leitor.nextDouble();
                System.out.println("Digite o valor do terceiro lado: ");
                MedLado3_dbl = leitor.nextDouble();
          
                perimetro_dbl = MedLado1_dbl + MedLado2_dbl + MedLado3_dbl;
                semip_dbl = perimetro_dbl/2;
                area_dbl = Math.sqrt(semip_dbl*(semip_dbl-MedLado1_dbl)* (semip_dbl-MedLado2_dbl) * (semip_dbl-MedLado3_dbl));
                System.out.println("O seu poligono e um triangulo, o valor de sua area e de: " + area_dbl);
            }
            else if(NumLados_int == 4){
                System.out.println("Digite o valor do primeiro lado: ");
                MedLado1_dbl = leitor.nextDouble();
                System.out.println("Digite o valor do Segundo lado: ");
                MedLado2_dbl = leitor.nextDouble();
                area_dbl = MedLado1_dbl * MedLado2_dbl;
                System.out.println("O seu poligono e um quadrado, o valor de sua area e de: " + area_dbl);
            }
            else if(NumLados_int == 5){
                System.out.println("Digite o valor de um dos lados: "); 
                MedLado1_dbl = leitor.nextDouble();
                System.out.println("Digite o valor da apotema: ");
                apotema_dbl = leitor.nextDouble();
                perimetro_dbl = MedLado1_dbl * 5;   
                area_dbl = 0.5 * perimetro_dbl * apotema_dbl;
                System.out.println("O seu poligono e um pentagono, o valor de sua area e de: " + area_dbl);
            }
            else if(NumLados_int < 3){
                System.out.println("Nao e um Poligono");
            }
            else{
                System.out.println("Poligono nao encontrado");
            }
    }
    
}
