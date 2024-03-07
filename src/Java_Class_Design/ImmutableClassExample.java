package Java_Class_Design;

import java.lang.reflect.Field;

public class ImmutableClassExample {
    private final int immutableField;

    public ImmutableClassExample(int immutableField) {
        this.immutableField = immutableField;
    }

    public int getImmutableField() {
        return immutableField;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ImmutableClassExample obj = new ImmutableClassExample(10);
        System.out.println(STR."Before change: \{obj.getImmutableField()}");

        Field field = ImmutableClassExample.class.getDeclaredField("immutableField");
        field.setAccessible(true);
        field.set(obj, 20);

        System.out.println(STR."After change: \{obj.getImmutableField()}");
    }
}
