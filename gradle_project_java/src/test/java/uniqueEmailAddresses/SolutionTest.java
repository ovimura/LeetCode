package uniqueEmailAddresses;

import UniqueEmailAddresses.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {

        String str = "Accounts Receivable Batch (A/R Batch)";
        if(str.contains("("))
            System.out.println("|"+str.substring(0,str.indexOf("(")-1)+"|");
        Solution s = new Solution();
        Assert.assertEquals(2, s.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
