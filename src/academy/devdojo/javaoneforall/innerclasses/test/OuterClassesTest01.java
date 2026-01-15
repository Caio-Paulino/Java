package academy.devdojo.javaoneforall.innerclasses.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printerOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerclass = new OuterClassesTest01();
        Inner inner = outerclass.new Inner();
        Inner inner2 = outerclass.new Inner();
        inner.printerOuterClassAttribute();
        inner2.printerOuterClassAttribute();
    }
}
