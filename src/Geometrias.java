import java.util.Arrays;


public class Geometrias {
    public static void main(String args[]){


        Figura[] rects= new Figura[4];

        rects[0]= new Rectangulo(2.5, 3.0);
        rects[1]= new Circulo(1.7);
        rects[2]= new Triangulo(2.8, 3.1);
        rects[3]= new Rectangulo(3.5, 1.2);

        Arrays.sort(rects);

        for (int i = 0 ; i<rects.length ; i++){
            System.out.println(rects[i].calcularArea());
        }
        
    }
}
