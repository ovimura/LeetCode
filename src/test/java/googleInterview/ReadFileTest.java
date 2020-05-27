package googleInterview;

import GoogleInterview.ReadFile;
import org.junit.Test;

public class ReadFileTest {
    @Test
    public void test1() throws Exception {
        ReadFile rf = new ReadFile();
        rf.read("c:\\Users\\omura\\Desktop\\Solution.java");
    }

    @Test
    public void test2() throws Exception {
        ReadFile rf = new ReadFile();
        rf.write("c:\\Users\\omura\\Desktop\\test.txt");
    }
}
