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
