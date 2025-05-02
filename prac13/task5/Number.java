package prac13.task5;

public class Number {
    private String phoneNum;

    public Number(String phoneNumber) {
        this.phoneNum = phoneNumber;
    }

    private String resNum(String locNum) {
        return locNum.substring(0, 3) + "-" + locNum.substring(3, 6) + "-" + locNum.substring(6);
    }

    private String euNum(String number) {
        String locNum = number.substring(1);
        String countryCode = locNum.substring(0, locNum.length() - 10);
        locNum = locNum.substring(locNum.length() - 10);
        if (locNum.length() != 10) {
            return("Wrong ww format.");
        }

        return "+" + countryCode + " " + resNum(locNum);
    }

    private String rusNum(String number) {
        String localNumber = number.substring(1);
        if (localNumber.length() != 10) {
            return("Wrong rus format.");
        }

        return "+7 " + resNum(localNumber);
    }

    public String format() {
        String endNum;
        if (phoneNum.startsWith("+")) {
            endNum = euNum(phoneNum);
        } else if (phoneNum.startsWith("8")) {
            endNum = rusNum(phoneNum);
        } else {
            return ("Wrong format.");
        }
        return endNum;
    }

    public static void main(String[] args) {
        Number num1 = new Number("+79175655655");
        System.out.println(num1.format());
        Number num2 = new Number("89175655655");
        System.out.println(num2.format());
        Number num3 = new Number("+104289652211");
        System.out.println(num3.format());
    }
}
