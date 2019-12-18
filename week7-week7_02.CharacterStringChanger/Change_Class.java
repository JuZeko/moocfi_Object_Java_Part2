import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('a', 'i'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));



    }

    }

import java.util.ArrayList;

public class Changer {

    ArrayList<Change> changes;

    public Changer(){

        this.changes = new ArrayList<Change>();
    }


    public void addChange(Change change) {

        changes.add(change);
    }

    public String change(String oldWord) {

        String newWord = oldWord;

        for (Change iterator : changes) {

            newWord = iterator.change(newWord);
        }

        return newWord;
    }


}
public class Change {


    char fromCharacter;
    char toCharacter;



    public Change(char fromCharacter, char toCharacter){

        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;


    }



    public String change(String word) {

        String newWord = word.replace(fromCharacter, toCharacter);


        return newWord;
    }

    @Override
    public String toString() {
        return "Change{" +
                "fromCharacter=" + fromCharacter +
                ", toCharacter=" + toCharacter +
                '}';
    }
}


