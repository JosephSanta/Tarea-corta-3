public class Triangulo extends Figura implements Comparable <
Figura >{



    private double base;
    private double altura;
    private int lados;


    public Triangulo(double tbase ,double taltura ){
        base = tbase;
        altura = taltura;
        lados=3;

    }

    
    public double calcularArea() {

        return (base *altura)/2;
    }

    public int numerodelados() {

        return lados;
    }


    public int compareTo( Figura triporcomparar) {


        double areaPorComparar = triporcomparar.calcularArea();
        double miArea = this.calcularArea();

        if(miArea==areaPorComparar){


            int ladosporcomparar =  triporcomparar.numerodelados();


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