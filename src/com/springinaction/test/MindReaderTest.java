package com.springinaction.test;

import com.springinaction.springidol.MindReader;
import com.springinaction.springidol.Thinker;
import org.junit.Test;

/**
 * Created by yiben on 2015/11/2.
 */
public class MindReaderTest {

    @Test
    public void test() {
        XmlUtils reader = XmlUtils.getInstance();
        Thinker volunteer = (Thinker) reader.getBean("volunteer");
        MindReader mindReader = (MindReader) reader.getBean("magician");

        volunteer.thinkOfSomething("12345679098765432");
        System.out.println(mindReader.getThoughts());

    }
}
