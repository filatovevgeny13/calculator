import java.io.IOException;

public class calculator {
    public static void main(String[] args) throws IOException {
        vvod vv1 = new vvod();
        getint gi1 = new getint();
        schet sch1 = new schet();
        converter conv1 = new converter();

        vv1.vvod();
        gi1.getint(vv1.a, vv1.b);
        if (gi1.getint(vv1.a, vv1.b) == 1) {
            sch1.error(sch1.proverka(gi1.ai, vv1.znak, gi1.bi));
            sch1.schet();
            sch1.vivod();
        }
        else{
            conv1.Arab(vv1.a);
            conv1.Arab(vv1.b);
            if (conv1.Arab(vv1.a) == 232332 || conv1.Arab(vv1.b) == 232332){
                System.out.println("Неправильно введены числа");
                System.exit(0);
            }
            else {
                sch1.error(sch1.proverka(conv1.Arab(vv1.a), vv1.znak, conv1.Arab(vv1.b)));
                sch1.schet();

                System.out.println(conv1.Rim((int)sch1.otvet));
            }
        }
    }
}
