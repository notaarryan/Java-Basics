//boxed primitives is a class of java.lang package
//each box primitive wraps / boxes a primitive value

public class BoxedPrimitives {
    {
        Integer boxedInt = Integer.valueOf(8);
        Boolean boxedBoolean = Boolean.valueOf(true);
        Character boxedChar = Character.valueOf('1');
        Double boxedDouble = Double.valueOf(25.9);


        //this is unboxing or boxing
        int primitiveInt = boxedInt.intValue();
        boolean primitiveBoolean = boxedBoolean.booleanValue();
        char primitiveChar = boxedChar.charValue();
        double primitiveDouble = boxedDouble.doubleValue();
    }
    //except Character all boxed primitives can be initialized with a string
    {
        Integer boxedInt = Integer.valueOf("8");
        Boolean boxedBoolean = Boolean.valueOf("true");
        Double boxedDouble = Double.valueOf("25.9");


        int primitiveInt = boxedInt.intValue();
        boolean primitiveBoolean = boxedBoolean.booleanValue();
        double primitiveDouble = boxedDouble.doubleValue();
    }

    static void parsing() {
        //1.Extracting data from string or parsing

        String data = "401,92.5";
        String[] items = data.split(",");

        int id = Integer.parseInt(items[0]);
        double marks = Double.parseDouble(items[1]);

        System.out.println(id);
        System.out.println(marks);
    }


}
