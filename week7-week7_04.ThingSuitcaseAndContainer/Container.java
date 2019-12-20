import java.util.ArrayList;

public class Container {
    
    int MaximumWeight;
    int suma = 0;
    ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    
    public Container(int maximumWeight){
        
        this.MaximumWeight = maximumWeight;
        
    }

    public void addSuitcase(Suitcase suitcase) {

                if(suma +suitcase.getSum()<MaximumWeight)
                {
                    this.container.add(suitcase);
                    suma+= suitcase.getSum();
                }
                else{

                }

    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public void printThings() {
        int sum = 0;

        for (Suitcase x : container) {

            sum += x.getSum();
            x.printThings();


        }
    }


    @Override
    public String toString() {
        return    container.size() +   " suitcases " +
                "(" + suma + " kg)";
    }
}




// suitcaso limitas neuzdetas

