import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> numbers = new HashMap<String, String>();;

        numbers.put("mage","matti");
        numbers.put("mixu","mikeal");
        numbers.put("arppa","arto");


        System.out.println(numbers.get("mage"));

       //matti's nickname is mage
       // mikael's nickname is mixu
        //arto's nickname is arppa


    }
}
