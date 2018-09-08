package outerinner;

public class OuterDemo1 {
	int num;

    public static class InnerDemo{
        public void showmessage(){
            System.out.println("Show me the live score");
        }
    }
    public static class InnerDemo2{
        public void print(){
            System.out.println("Show me the statics");
        }
    }
    public static calss InnerDemo3{
        public void showInformation(){
            System.out.println("Show me the information")
        }
    }

    public static void main(String[] args) {
        OuterDemo.InnerDemo id = new OuterDemo.InnerDemo();
        id.showmessage();
    }

}

//farzad
//shahrukh
