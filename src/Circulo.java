public class Circulo extends Figura implements Comparable <
Figura >{
    private double radio;

    private int lados;


    public Circulo(double cradio){
        radio = cradio;
        lados =0;
    }
    

    //AREA DEL CIRCULO 
    public double calcularArea() {
        return Math.PI*(radio *radio);
    }


    
    public int numerodelados() {
        
        return lados;
    }


    public int compareTo(Figura circPorComparar) {

        double areaPorComparar = circPorComparar.calcularArea();
        double miArea = this.calcularArea();


        if(miArea==areaPorComparar){


            int ladosporcomparar =  circPorComparar.numerodelados();


            if (lados == ladosporcomparar){

                return 0;

            }
            else if (lados > ladosporcomparar){

                return 1;

                
            }

            else {
                return -1;
            }


        }
        else if (miArea > areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
        
        
    }


    
}