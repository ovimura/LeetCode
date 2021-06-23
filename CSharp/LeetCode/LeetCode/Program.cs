using System;

namespace P1603 {
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
            else if (carType == 3 && small > 0) {
                small--;
                return true;
            } else return false;
        }
    }
}

namespace P1720 {
    public class Solution
    {
        public int[] Decode(int[] encoded, int first)
        {
            int[] rs = new int[encoded.Length+1];
            rs[0] = first;
            for (int i = 0; i < encoded.Length; i++) {
                rs[i + 1] = encoded[i] ^ rs[i];
            }
            return rs;
        }
    }
}


namespace LeetCode
{
    class Program
    {
        static void testP1603() {
            P1603.ParkingSystem p = new P1603.ParkingSystem(1, 1, 0);
            Console.WriteLine(p.AddCar(1));
            Console.WriteLine(p.AddCar(2));
            Console.WriteLine(p.AddCar(3));
            Console.WriteLine(p.AddCar(1));
        }
        static void Main(string[] args)
        {
            testP1603();
            int[] temp = new P1720.Solution().Decode(new int[] { 1, 2, 3 }, 1);
            foreach(var t in temp)
                Console.WriteLine(t);
        }
    }
}
