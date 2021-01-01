import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class classes {

}

class vvod  {

    String str;
    String a;
    String b;
    String znak;

    BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
    void vvod () throws IOException {
        str = reader1.readLine();


        String[] simvols = str.split(" ");
        a = simvols[0];
        b = simvols[2];
        znak = simvols[1];
    }
}

class getint {

    String a;
    String b;
    int ai;
    int bi;
    int getint (String x, String y) {
        a = x;
        b = y;
        try {
            ai = Integer.parseInt(a);
            bi = Integer.parseInt(b);
            return 1;
        }
        catch (NumberFormatException nfe) {
            return 0;
        }
    }
}

class schet {

    static int a;
    static int b;
    static double otvet;
    static String znak;

    void schet(){

        otvet = switch (znak) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> a / b;
        };
    }

    int proverka (int a1, String zn, int b1){
        znak = zn;
        a = a1;
        b = b1;
        if (!znak.equals("+") && !znak.equals("-")  && !znak.equals("*")  && !znak.equals("/") ) {

            return 1;
        }
        else if (a > 10 || a < 1){
            return 2;
        }
        else {
            return 3;
        }

    }

    void error (int error){
        if (error == 1){
            System.out.println("Неправильно введен арифметический знак");
            System.exit(0);
        }
        if (error == 2){
            System.out.println("Калькулятор принимает числа от 1 до 10");
            System.exit(0);
        }
    }

    void vivod(){
        System.out.println(otvet);
    }
}

class converter {






    static public String Rim (int z) {

        String buffer = "";

        int c = z / 100;
        int x1 = z / 10;
        int l = z / 50;
        int ost2 = z % 50;
        int x2 = ost2 / 10;
        int ost3 = ost2 % 10;
        int v = ost3 / 5;
        int i = ost3 % 5;

        if (x1 != 0) {
            if (c == 1) {
                buffer += "C";
            } else {
                if (x1 == 9) {
                    buffer += "XC";
                } else {
                    if (l != 0) {
                        buffer += "L";
                        for (int m = 0; m < x2; m++)
                            buffer += "X";
                    } else {
                        if (ost2 == 4) {
                            buffer += "XL";
                        } else {
                            for (int m = 0; m < x2; m++)
                                buffer += "X";
                        }

                    }
                }
            }
        }
        if (ost3 == 9){
            buffer += "IX";
        }
        else {
            if (v != 0){
                buffer += "V";
                for (int m = 0; m < i; m++)
                    buffer += "I";
            }
            else
            if (i == 4){
                buffer += "IV";
            }
            else
                for (int m = 0; m < i; m++)
                    buffer += "I";
        }
        if (buffer.equals("")){
            buffer = "NULL";
        }
        return buffer;
    }

    public int Arab (String R){
        int ar = 232332;
        for (int i = 1; i <= 10; i++){

            String arab = converter.Rim(i);
            if (arab.equals(R)) {
                ar = i;
                break;
            }
        }
        return ar;
    }
}
