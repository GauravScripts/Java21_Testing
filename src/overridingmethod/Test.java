package overridingmethod;

class ShallowCopyExample implements Cloneable {
    int[] data;

    // Makes a shallow copy of values
    public ShallowCopyExample(int[] values) {
        data = values;
    }

    @Override
    public ShallowCopyExample clone() {
        try {
            return (ShallowCopyExample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class DeepCopyExample implements Cloneable {
    int[] data;

    // Makes a deep copy of values
    public DeepCopyExample(int[] values) {
        data = new int[values.length];
        System.arraycopy(values, 0, data, 0, values.length);
    }

    @Override
    public DeepCopyExample clone() {
        return new DeepCopyExample(data);
    }

    public static void main(String[] args) {
        int[] vals = {3, 7, 9};
        ShallowCopyExample e1 = new ShallowCopyExample(vals);
        DeepCopyExample e2 = new DeepCopyExample(vals);
        vals[0] = 13;
        System.out.println(e1.data[0]); // 13 for ShadowCopyExample
        System.out.println(e2.data[0]); // 3 for DeepCopyExample
    }
}