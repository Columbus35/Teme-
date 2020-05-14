public class TreeLetters {
    private String addAllLetters(){
        EntryData word = new EntryData();
        String a = word.enterTheRestOfLetters();
        return a;
    }

    public String createdWord() {
        String a = addAllLetters();
        String[] line = a.split(" ");
        String word = "";
        for (int i = 0; i < line.length; i++) {

            for (int y = 0; y < line.length; y++) {

                for (int z = 0; z < line.length; z++) {
                    if (z != i && z != y && i != y) {
                        word += line[i];
                        word += line[y];
                        word += line[z] + " ";
                    }
                }
            }
        }
        return word;

    }

}

