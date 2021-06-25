using System;


namespace P9
{
	public class Solution
	{
        public bool IsPalindrome(int x)
        {
            String s = x.ToString();
            for (int i = 0; i < s.Length / 2; i++) {
                if (s[i] != s[s.Length - i - 1])
                    return false;
            }
            return true;
        }
    }
}


namespace P1603
{
    public class ParkingSystem
    {
        private int big, medium, small;

        public ParkingSystem(int big, int medium, int small)
        {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public bool AddCar(int carType)
        {
            if (carType == 1 && big > 0)
            {
                big--;
                return true;
            }
            else if (carType == 2 && medium > 0)
            {
                medium--;
                return true;
            }
            else if (carType == 3 && small > 0)
            {
                small--;
                return true;
            }
            else return false;
        }
    }
}

namespace P1720
{
    public class Solution
    {
        public int[] Decode(int[] encoded, int first)
        {
            int[] rs = new int[encoded.Length + 1];
            rs[0] = first;
            for (int i = 0; i < encoded.Length; i++)
            {
                rs[i + 1] = encoded[i] ^ rs[i];
            }
            return rs;
        }
    }
}

namespace P7
{
    public class Solution
    {
        public int Reverse(int x)
        {
            bool negativeFlag = false;
            if (x < 0)
            {
                negativeFlag = true;
                x = -x;
            }

            int prev_rev_num = 0, rev_num = 0;
            while (x != 0)
            {
                int curr_digit = x % 10;

                rev_num = (rev_num * 10) +
                           curr_digit;
                if ((rev_num - curr_digit) / 10 != prev_rev_num)
                {
                    return 0;
                }

                prev_rev_num = rev_num;
                x = x / 10;
            }

            return (negativeFlag == true) ?
                                 -rev_num : rev_num;
        }

        public int Reverse1(int x)
        {
            String temp = "";
            if (x < -Math.Pow(2, 31) || x > Math.Pow(2, 31))
                return 0;
            else
            {
                String s = x.ToString();
                if (s.StartsWith('-'))
                {
                    temp += '-';
                    s = s.Substring(1);

                    for (int i = s.Length - 1; i >= 0; i--)
                        temp += s[i];
                }
                else
                {
                    //s = s.Substring(1);

                    for (int i = s.Length - 1; i >= 0; i--)
                        temp += s[i];
                }
                String min = Math.Pow(2, 31).ToString();
                int m = (int)Math.Pow(2, 31) - 1;
                String max = m.ToString();
                try
                {
                    int val = int.Parse(temp);
                    if (val < -Math.Pow(2, 31) || val > Math.Pow(2, 31))
                        return 0;
                    else
                        return val;
                }
                catch (Exception e)
                {
                    return 0;
                }
            }
        }
    }
}

