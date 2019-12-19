import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    int calculations;
    Reader reader;

    public Calculator(){

       this.reader = new Reader();

}


    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                System.out.print("Calculations done "+ calculations);
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }

        }
    }

    private void sum(){
       System.out.println("sum of the values " +  reader.readInt("sum"));
       statistics();
    };
    private void difference(){
        statistics();
        System.out.println("difference of the values " +  reader.readInt("differece"));
    };
    private void product(){
        statistics();
        System.out.println("product of the values " + reader.readInt("product"));
    };


       private void statistics(){
           calculations++;
       }


}
