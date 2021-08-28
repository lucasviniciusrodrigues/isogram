class IsogramChecker {

    boolean isIsogram(String phrase) {

        int count = 0;
        char[] charsPhrase = phrase.toLowerCase().toCharArray();

        for(char letter : charsPhrase){

            if(letter == ' ' || letter == '-') continue;

            for(int i = 0; i < phrase.length(); i++)
                if(letter == charsPhrase[i])
                    count++;

            if(count != 1)
                return false;

            count = 0;
        }

        return true;
    }

}
