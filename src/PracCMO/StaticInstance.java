package PracCMO;

public class StaticInstance extends AbsC {

    private static int j;
    private static String p;

    public static StaticInstance instance(String p){
        StaticInstance ins = new StaticInstance();
        System.out.println(p);
        return ins;
    }
    @Override
    public void methodfromabs() {
        System.out.println("This is from abstract class");
    }
    @Override
    public void methodfromabs1() {
        System.out.println("This is 2nd method from abstract class");
    }
 }
