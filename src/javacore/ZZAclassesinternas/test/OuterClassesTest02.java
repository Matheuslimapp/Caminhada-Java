package javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Izuku";
    void print(final String param){
        final String lastName = "Midoriya";
        name = "";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " "+ lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("bakugo");
    }
}
