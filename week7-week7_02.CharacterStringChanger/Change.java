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

