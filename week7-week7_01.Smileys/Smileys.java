public class main {

    public static void main(String[] args) {
        printWithSmileys("test");
    }



    private static void printWithSmileys(String x) {

            if(x.length()%2 == 1){
                x+=" ";
            }

            for(int i = 0;i<3;i++)
            {

                for(int j = 0;j<x.length()/2+2;j++) {


                    if(i != 1 ){
                        System.out.print(":)");
                    }
                    else {

                        System.out.print(":)" + x + ":)");
                        break;
                    }
                }
                System.out.println("");

            }

    }

}
