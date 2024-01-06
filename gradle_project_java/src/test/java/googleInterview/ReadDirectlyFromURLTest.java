package googleInterview;

import GoogleInterview.ReadDirectlyFromURL;
import org.junit.Test;

public class ReadDirectlyFromURLTest {
    @Test
    public void test1() throws Exception {
        ReadDirectlyFromURL readDirectlyFromURL = new ReadDirectlyFromURL();
        readDirectlyFromURL.readFromURL("https://www.google.com");
    }
}
