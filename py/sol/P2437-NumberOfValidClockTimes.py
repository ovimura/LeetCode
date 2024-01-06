
class Solution:
    def countTime(self, time: str) -> int:
        clocks = []
        mclocks = []
        if time[0:2] == "??":
            for i in range(24):
                clocks.append(i)
        else:
            if time[0] == "?":
                if int(time[1]) <= 3:
                    for i in range(0, 3):
                        t = (0, i)
                        clocks.append(t)
                elif int(time[1]) > 3:
                    for i in range(2):
                        t = (0, i)
                        clocks.append(t)
            if time[1] == "?":
                if time[0] == "2":
                    for i in range(0, 4):
                        t = (1, i)
                        clocks.append(t)
                elif int(time[0]) < 2:
                    for i in range(0, 10):
                        t = (1, i)
                        clocks.append(t)
        if time[3:5] == "??":
            for i in range(60):
                mclocks.append(i)
        else:
            if time[3] == "?":
                for i in range(0, 6):
                    t = (3, i)
                    mclocks.append(t)
            if time[4] == "?":
                for i in range(0, 10):
                    t = (4, i)
                    mclocks.append(t)
        if(len(mclocks) == 0) and (len(clocks) == 0):
            return 1
        elif len(mclocks) == 0:
            return (len(clocks)*1)
        elif len(clocks) == 0:
            return (1*len(mclocks))
        else:
            return len(clocks)*len(mclocks)


s = Solution()

assert 240 == (s.countTime("2?:??"))

