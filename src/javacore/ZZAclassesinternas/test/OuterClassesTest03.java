package javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Matheus";
    static class Nested {
        void print(){
            String lastName = "Lima";
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
