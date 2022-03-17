public class Rectangulo extends Figura implements Comparable <
Figura >{
    private double base;
    private double altura;
    private int lados;

    public Rectangulo(double pBase , double pAltura){
        base = pBase;
        altura = pAltura;
        lados = 4;

    }

    public double calcularArea(){
        return base * altura;

    }

    public int numerodelados() {
        
        return lados;
    }


    //IMPLEMENTACION DEL METODO compareTo

    public int compareTo( Figura rectPorComparar){

        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea==areaPorComparar){

            int ladosporcomparar =  rectPorComparar.numerodelados();


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
