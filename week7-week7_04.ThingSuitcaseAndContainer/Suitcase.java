import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class Suitcase implements Comparator<Thing>{

    private int MaximumWeight;
    ArrayList<Thing> things;
    private int sum = 0;

    public Suitcase(int MaximumWeight) {
        this.MaximumWeight = MaximumWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing obj) {


        if(sum + obj.getWeight() < MaximumWeight){
            sum += obj.getWeight();
            things.add(obj);
        }



    }

    @Override
    public String toString() {
        return  check() +  sum + " kg ";

    }

    private String check() {

        String emty;
        if(things.size() == 0){
          emty = " emty ";
        }
        else if (things.size() ==1){
            emty =  String.valueOf( things.size()) + " thing weigth ";
        }
        else{
            emty =  String.valueOf( things.size()) + " things weigth ";
        }

        return emty;
    }

    public void printThings() {

        for(Thing x:things){

            System.out.println(x.getName() + " " + x.getWeight() + " kg");
        }




    }

    public String totalWeight() {

        int suma = 0;
        for(Thing x:things){

            suma += x.getWeight();
        }
        return String.valueOf(suma);
    }

    public Thing heaviestThing() {


        // AS TURIU ARRAYLISTA PILNA THING OBJECTU KURIE TURI FUNKCIJA GETWEIGHT
        // galiu prasukti for cikla per visus objektus ir paliginti getweigt?


        int dummy = 0;
        Thing arrow = new Thing("", 0);
        for (Thing x : things) {

            if (x.getWeight() > dummy) {

                dummy = x.getWeight();
                arrow = x;

            }
        }
        return arrow;
    }





    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }




    @Override
    public int compare(Thing thing, Thing t1) {
        return thing.getWeight() - t1.getWeight();
    }
}

