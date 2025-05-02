package prac13;

public class task1 {
    public static void main(String[] args){
        String str = "I like Java!!!";
        System.out.println("Last symbol: "+ str.charAt(str.length()-1));
        System.out.println("If ends with \"!!!\": " + str.endsWith("!!!"));
        System.out.println("If starts with \"I like\": " + str.startsWith("I like"));
        System.out.println("If substring \"Java\" in string:" + str.contains("Java"));
        int x = str.indexOf("Java");
        System.out.println("Position of \"Java\" in string: " + x);
        System.out.println("Replace 'a' with 'o': " + str.replace('a','o'));
        System.out.println("Upper case string:"+ str.toUpperCase());
        System.out.println("Lower case string:"+ str.toLowerCase());
        System.out.println("Substring:" + str.substring(x,x+"Java".length()));
    }
}
