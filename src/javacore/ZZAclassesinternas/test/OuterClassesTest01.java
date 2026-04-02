package javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. luffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
     OuterClassesTest01 outerClasss = new OuterClassesTest01();
        Inner inner = outerClasss.new Inner();
        inner.printOuterClassAttribute();
    }
}
