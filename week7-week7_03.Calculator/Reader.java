import java.util.Scanner;

public class Reader {

    Scanner read;

    public Reader(){

        this.read = new Scanner(System.in);
    }



    public String readString() {

       String command=  read.nextLine();

        return command;
    }

    public int readInt(String operation) {

        System.out.print("value 1 ");
        int FirstNumber = read.nextInt();


        System.out.print("value 2 ");
        int SecondNumber = read.nextInt();


        return  count(operation,FirstNumber,SecondNumber);
    }

    private Integer count(String operation, int firstNumber, int secondNumber) {

        int answer = 0;
        if(operation == "sum"){

            answer = firstNumber + secondNumber;
        }
        if (operation == "differece"){
            answer = firstNumber - secondNumber;
        }
        if (operation == "product"){
            answer = firstNumber * secondNumber;
        }

            return answer;
    }



}
