package oo.step3;

import oo.Klass;
import oo.Klass.Klass;
import org.junit.jupiter.api.Test;

public class KlassTest {

    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_two_same_id_teacher() {
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(1);
        assertEqulas(klass.equals(klass2));
    }
    // when equals two different id klass then return true
    //@Test
    //public void should_return_
}
