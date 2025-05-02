package prac11.task2;

import java.util.Calendar;

class main {
    public static void main(String[] args) {
        Data data = new Data();
        Calendar D = data.datFunc();
        SysData sis = new SysData();
        Calendar S = sis.sysFunc();
        if (D.before(S)) {
            System.out.println("That was before system date.");
        } else if (D.after(S)) {
            System.out.println("That will be after system date.");
        } else {
            System.out.println("This is the system date.");
        }
    }
}
