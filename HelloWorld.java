public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        newMethod();
        newMethod1();
        newMethod2();
    }
    public static void newMethod(){
        System.out.println("Inside New Method");
    }
    public static void newMethod1(){
        System.out.println("Inside New Method1");
        String s = "1";
    }
    public static void newMethod2(){
        System.out.println("Inside New Method2");
        String s = "1";
    }
}
