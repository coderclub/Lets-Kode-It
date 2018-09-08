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

    public static class InnerDemo3{
         public void display(){
            System.out.println("display the method");
        }

    }

    public static void main(String[] args) {
        OuterDemo.InnerDemo id = new OuterDemo.InnerDemo();
        OuterDemo.InnerDemo2 id2 = new OuterDemo.InnerDemo2();
        OuterDemo.InnerDemo3 id3 = new OuterDemo.InnerDemo3();
        id.showmessage();
        id.display();
        id.print();

    }

}
@author asif
//shahrukh, farzad, asif
