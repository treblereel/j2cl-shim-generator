package org.treblereel.j2cl.shim;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 1/27/21
 */
@J2clTestInput(ES6ModuleTest.class)
public class ES6ModuleTest {

    private ES6Test tested = new ES6Test();
    private ES6Test2 testedWithJsName = new ES6Test2();

    @Test
    public void testBooleanMethod() {
        assertEquals(true, tested.isTest());
        assertEquals(true, testedWithJsName.isTestZZ());
    }

    @Test
    public void testClassStringProperty() {
        assertEquals("#id", tested.id);
        assertEquals("#id2", testedWithJsName.id);
    }
}
