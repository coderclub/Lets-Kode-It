package PracCMO;

public class Happy {

    public static void main(String[] args) {
        Farzad farzad = new Farzad();
        farzad.getword("gongika");
        farzad.print();
        StaticC.setb("itring");
        Tstatic.setint(80);
        StaticInstance.instance("bab");
        //method from abstract class
        StaticInstance instance = new StaticInstance();
        instance.methodfromabs1();
        instance.methodfromabs();

        }
    }

