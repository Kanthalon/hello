package hello;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class HelloTest
{
    @Test
    public void test()
    {
        ByteArrayOutputStream  os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        Hello.main(null);
        assertEquals("Hello World!", os.toString());
    }
}
