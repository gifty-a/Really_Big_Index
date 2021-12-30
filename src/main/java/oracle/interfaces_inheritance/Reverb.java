package main.java.oracle.interfaces_inheritance;

public class Reverb implements CharSequence{
    private String sentence;

    public Reverb(String sentence){
        this.sentence = sentence;
    }
//"Your implementation should return the string backwards"


    @Override
    public int length() {
        return sentence.length();
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= sentence.length())) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return sentence.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0) throw new StringIndexOutOfBoundsException(start);
        if (end > sentence.length()) throw new StringIndexOutOfBoundsException(end);
        if (start > end) throw new StringIndexOutOfBoundsException(start - end);
        StringBuilder stringBuilder = new StringBuilder(sentence.subSequence(start,end));
        return stringBuilder.reverse();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.sentence);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Reverb("generates values between 0 and 0.9999").subSequence(4,20));
    }

}
