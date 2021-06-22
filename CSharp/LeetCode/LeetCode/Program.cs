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


namespace LeetCode
{
    class Program
    {
        static void Main(string[] args)
        {
            
        }
    }
}
