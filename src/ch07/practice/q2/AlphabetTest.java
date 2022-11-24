package src.ch07.practice.q2;

public class AlphabetTest {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';
        
        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }

        for (char alphabet : alphabets) {
            System.out.println(alphabet);
        }
    }
}
