package outerinner;

public class OuterDemo {
	
	int num;

    public static class InnerDemo{
        public void showmessage(){
            System.out.println("Let me show the Cricinfo");
        }
    }

    public static void main(String[] args) {
        OuterDemo.InnerDemo id = new OuterDemo.InnerDemo();
        id.showmessage();
    }

}
