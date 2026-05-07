public class WarpperBoolean {

    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;


        boolean primBoolean = num1 > num2; // false
        Boolean objBoolena = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolena = " + objBoolena);
        System.out.println("objBoolean2 = " + objBoolean2);


        System.out.println("comparando dos objetos boolean = " + (objBoolena == objBoolean2));
        System.out.println("comparando dos objetos boolean = " + (objBoolena.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolean = " + (objBoolean2 == objBoolean3));
        System.out.println("comparando dos objetos boolean = " + (objBoolena == objBoolean3));

        boolean primBoolen2 = objBoolean2.booleanValue();
        System.out.println("primBoolen2 = " + primBoolen2);

    }



}
