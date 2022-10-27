public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
        String[] words = str.split(" ");
        for(String word: words) {
            if(word.contains("2") || word.contains("4") || word.contains("6") || word.contains("8") || word.contains("0")) count ++;
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] words = str.split(" ");
        for(int i = 0; i< words.length; i++) {
            if(isPalindrom(words[i])) {
                words[i] = "YY";
                break;
            }
        }
        return String.join(" ", words);
    }
    private boolean isPalindrom(String str) {
        if(str.length() == 1) return true;
        int n = str.length();
        for(int i = 0; i< n; i++) {
            if(Character.compare(str.charAt(i), str.charAt(n - 1 - i)) != 0) return false;
        }
        return true;
    }
    
}
