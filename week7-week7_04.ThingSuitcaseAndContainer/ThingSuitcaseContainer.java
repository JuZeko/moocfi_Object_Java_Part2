import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class ThingSuitcaseContainer {


    public static void main(String[] args) {

            Container container = new Container(1000);
            addSuitcasesFullOfBricks(container);
            System.out.println(container);
        }

        public static void addSuitcasesFullOfBricks (Container container){

            int sum = 1; // brick weight in the beginning

            ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();


            int i=0;
            while (sum<100){

                Thing brick = new Thing("Brick",sum);

                suitcases.add(new Suitcase(1000)); // 100 suitcases

                suitcases.get(i).addThing(brick);  // one suitcase one brick


                container.addSuitcase(suitcases.get(i));
                if(container.MaximumWeight<container.getSuma() + suitcases.get(i).getSum()){
                    break;
                }
                i ++;  // help us to put a brick to new suitcase
                sum++; // increase weight of brick
            }




        }
    }




