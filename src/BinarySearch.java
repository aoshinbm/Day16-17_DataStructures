import java.util.Scanner;

public class BinarySearch {
    static String[] sentence = {"hello","folks","nice","meeting","you"};
    static String word;
    static int start=0,mid;
    static int end=sentence.length-1;
    public static int findWord(){
        while (start<=end) {
            mid = start + (end - start) / 2;
            if (sentence[mid].compareTo(word)<0){
                start=mid+1;
            } else if (sentence[mid].compareTo(word)>0) {
                end=mid-1;
            }else {
                return mid;
//                System.out.println(mid);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word you want to search:");
        word= sc.next();
        System.out.println(word+" Word found at "+ findWord()+ " position");
    }
}
