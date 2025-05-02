package prac13.task3;


public class Test {
    public static void main(String[] args) {
        String address1 = "Russia, MSC, Moscow, Arbat, 12, 1, 101";
        String address2 = "USA, CS , California, Los-Angeles, Hollywood, 100, 2";
        String address3 = "France, Il-De-France, Paris, Shans-Elize, 45.1., 2";
        String address4 = "Germany, MXG, Berlin; Brandenburg, 9, 1, 12";

        Address addr1 = new Address(address1);
        Address addr2 = new Address(address2);
        Address addr3 = new Address(address3);
        Address addr4 = new Address(address4);

        System.out.println(addr1);
        System.out.println(addr2);
        System.out.println(addr3);
        System.out.println(addr4);
    }
}
