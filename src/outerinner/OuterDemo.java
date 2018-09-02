package outerinner;

public class OuterDemo {
	
	int num;

    public static class InnerDemo{
        public void showmessage(){
            System.out.println("Show me the live score");
        }
    }
    public static class InnerDemo2{
        public void print(){
            System.out.println("Please print the page for me");
        }
    }

    public static void main(String[] args) {
        OuterDemo.InnerDemo id = new OuterDemo.InnerDemo();
        id.showmessage();
    }

}
