class Solution(object):
    def countDaysTogether(self, arriveAlice, leaveAlice, arriveBob, leaveBob):
        """
        :type arriveAlice: str
        :type leaveAlice: str
        :type arriveBob: str
        :type leaveBob: str
        :rtype: int
        """
        # 0 days together
        if self.compare_times(leaveAlice, arriveBob) < 0 or self.compare_times(leaveBob, arriveAlice) < 0:
            return 0
        # all days together
        elif (arriveAlice == arriveBob) and (leaveAlice == leaveBob):
            return self.getNoOfDays(arriveAlice, leaveAlice)
        # time overlap, Alice arrived first
        elif self.compare_times(arriveBob, arriveAlice) > 0 and self.compare_times(leaveBob, leaveAlice) > 0:
            # calculate arrive bob
            t = self.getNoOfDays(arriveBob, leaveAlice)
            return t
        # time overlap, Bob arrived first
        elif self.compare_times(arriveBob, arriveAlice) < 0 and self.compare_times(leaveBob, leaveAlice) < 0:
            # calculate arrive bob
            t = self.getNoOfDays(arriveAlice, leaveBob)
            return t
        # Alice's included into the Bob's time
        elif self.compare_times(arriveAlice, arriveBob) >= 0 >= self.compare_times(leaveAlice, leaveBob):
            t = self.getNoOfDays(arriveAlice, leaveAlice)
            return t
        # Bob's time included into Alice's time
        elif self.compare_times(arriveBob, arriveAlice) >= 0 >= self.compare_times(leaveBob, leaveAlice):
            t = self.getNoOfDays(arriveBob, leaveBob)
            return t
        return 0

    def getNoOfDays(self, a, l):
        # print("{} - {}".format(a, l))
        days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        if int(a[0:2]) == int(l[0:2]):
            return (int(l[3:5]) - int(a[3:5])) + 1
        else:
            ds = 0
            if (int(l[0:2]) - int(a[0:2])) > 2:
                ds += (days[int(a[0:2])-1] - int(a[3:5]))+1
                for m in range(int(a[0:2]), int(l[0:2]) - 1):
                    ds += days[m]
                ds += int(l[3:5])
            elif (int(l[0:2]) - int(a[0:2])) == 2:
                ds += (days[int(a[0:2]) - 1] - int(a[3:5])) + 1
                ds += days[int(a[0:2])]
                ds += (int(l[3:5]))
            elif (int(l[0:2]) - int(a[0:2])) == 1:
                ds += (int(l[3:5]))
                ds += (days[int(a[0:2]) - 1] - int(a[3:5]))+1
            return ds

    def compare_times(self, t1, t2) -> int:
        if t1 == t2:
            return 0
        elif int(t1[0:2]) == int(t2[0:2]):
            if int(t1[3:5]) > int(t2[3:5]):
                return 1
            else:
                return -1
        elif int(t1[0:2]) > int(t2[0:2]):
            return 1
        elif int(t1[0:2]) < int(t2[0:2]):
            return -1


s = Solution()

assert 90 == (s.countDaysTogether("10-01","12-30","10-02","12-31"))
assert 81 == (s.countDaysTogether("10-02","12-21","10-01","12-30"))
assert 3 == (s.countDaysTogether("08-15","08-18","08-16","08-19"))
assert 4 == (s.countDaysTogether("08-15","08-18","08-15","08-18"))
assert 49 == (s.countDaysTogether("09-01","10-19","06-19","10-20"))
assert 40 == (s.countDaysTogether("09-01","10-19","06-19","10-10"))
assert 92 == (s.countDaysTogether("03-05","07-14","04-14","09-21"))

