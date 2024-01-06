package ExcelSheetColumnTitle;

public class Solution {
    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while(n > 0){
            n--;
            char ch = (char) (n % 26 + 'A');
            n /= 26;
            sb.append(ch);
        }

        sb.reverse();
        return sb.toString();

//        StringBuilder sb = new StringBuilder();
//        int max_pow = 0;
//        while(Math.pow(26, max_pow)<columnNumber) {
//            max_pow++;
//        }
//        long sum = 0;
//        for(int i=max_pow-1; i>=0; i--) {
//            System.out.println("sum: " + sum);
//            int l = 0;
//            boolean found = false;
//            while(l<26) {
//                System.out.println("i: " + i + ", l: " + l + "; columnNumber: " + ((int)(sum+l*Math.pow(26,i))));
//                if(((long)(sum+l*Math.pow(26,i)))<=columnNumber)
//                {
//                    l++;
//                    System.out.println(((int)(sum+l*Math.pow(26,i))));
//                    sum += ((int)(l-1)*Math.pow(26,i));
//                    found = true;
//                    break;
//                } else break;
//                l++;
//            }
//
//            if(!found)
//            sum += ((long)(l-1)*Math.pow(26,i));
//            System.out.println(l);
//            System.out.println(max_pow);
//            sb.append(alphabet[l-2]);
//        }
//        if(max_pow == 0)
//            sb.append(alphabet[columnNumber-1]);
//        return sb.toString();
    }


    public String convertToTitle1(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0) {
            columnNumber--;
            char c = (char)((columnNumber % 26) + 'A');
            columnNumber /= 26;
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}
