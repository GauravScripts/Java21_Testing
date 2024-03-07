package HashCode_And_Equals;

import java.util.Objects;

public class Test_HashCode_Equals {
    int age;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test_HashCode_Equals that)) return false;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
