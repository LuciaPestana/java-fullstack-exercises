package seccion06_clasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int enteroPrimitivo = 10;
        Integer enteroWrapper = Integer.valueOf(enteroPrimitivo);

        System.out.println("enteroPrimitivo = " + enteroPrimitivo);
        System.out.println("enteroWrapper = " + enteroWrapper);

        int otroEnteroPrimitivo = enteroWrapper.intValue();
        System.out.println("otroEnteroPrimitivo = " + otroEnteroPrimitivo);

        // Autoboxing
        Integer autoboxingInteger = enteroPrimitivo; // Se convierte automáticamente a Integer
        System.out.println("autoboxingInteger = " + autoboxingInteger);

        // Unboxing
        int unboxingInt = autoboxingInteger; // Se convierte automáticamente a int
        System.out.println("unboxingInt = " + unboxingInt);
    }
}
