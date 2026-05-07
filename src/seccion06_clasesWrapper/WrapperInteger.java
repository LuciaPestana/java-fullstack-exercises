package seccion06_clasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

      int IntPrimitivo = 32767;
     Integer intObjeto = Integer.valueOf(IntPrimitivo);
     Integer intObjeto2 = IntPrimitivo;

        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;

        System.out.println("num = " + num);

        int num2 = intObjeto.intValue();

        System.out.println("num2 = " + num2);

        String valorTvLcd = "6700";

        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);


        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longBojeto = intObjeto.longValue();
        System.out.println("longBojeto = " + longBojeto);

    }
}
