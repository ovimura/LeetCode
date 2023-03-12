class Solution:
    per = []

    def perm(self, a, i):
        if i == len(a):
            print(a)
            self.per.append(a.copy())
        else:
            for j in range(i, len(a)):
                a[i], a[j] = a[j], a[i]
                self.perm(a, i + 1)
                a[i], a[j] = a[j], a[i]

    def pe(self, a, i, t):
        if i == len(a):
            print(t)
            self.per.append(t.copy())
        for j in range(i, len(a)):
            a[j], a[i] = a[i], a[j]
            self.pe(a, i + 1, a)
            a[j], a[i] = a[i], a[j]


    def p(self, a, b):
        if len(a) == 0:
            print(b)
            return
        for i in range(len(a)):
            c = a[i]
            l = a[:i]
            r = a[i+1:]
            t = l + r
            self.p(t, b+c)



ss = Solution()

# ss.pe([1, 2, 3], 0, [])

ss.p("abc", "")


# print(ss.per)
# ss.perm([1, 2, 3], 0)
# print(ss.per)

