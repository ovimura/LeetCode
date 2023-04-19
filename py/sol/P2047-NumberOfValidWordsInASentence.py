class Solution:
    def countValidWords(self, sentence: str) -> int:
        tokens = []
        i = 0
        while i < len(sentence):
            if sentence[i] != " ":
                for j in range(i, len(sentence)):
                    if sentence[j] == " ":
                        tokens.append(sentence[i:j])
                        i = j+1
                        break
                    elif j == (len(sentence)-1):
                        tokens.append(sentence[i:])
                        i = j + 1
                        break
            else:
                i += 1
        valid_words = []
        for t in tokens:
            isnum = False
            for tt in t:
                if tt.isnumeric():
                    isnum = True
                    break
            if not isnum:
                if len(t) <= 2:
                    if '-' in t:
                        continue
                    elif len(t) == 1 and t[0] in ['!', '.', ',']:
                        valid_words.append(t)
                        continue
                # validate hyphen
                count_h = 0
                count_bad_h = 0
                for i in range(1, len(t)-1):
                    if t[0] == "-" or t[-1] == "-":
                        count_bad_h += 1
                        continue
                    elif t[i] == '-' and t[i-1].isalpha() and t[i+1].isalpha():
                        count_h += 1
                    elif t[i] == '-':
                        count_bad_h += 1
                # validate punctuation
                count_p = 0
                count_bad_p = 0
                for i in range(len(t)):
                    if t[i] in ['!', '.', ',']:
                        if i != len(t)-1:
                            count_bad_p += 1
                        elif i == len(t)-1:
                            count_p += 1
                # collect the valid tokens
                if count_bad_p == 0 and count_bad_h == 0 and count_h <= 1 and count_p <= 1:
                    valid_words.append(t)
        return len(valid_words)


s = Solution()

assert 3 == (s.countValidWords("cat and  dog"))
assert 0 == (s.countValidWords("!this  1-s b8d!"))
assert 5 == (s.countValidWords("alice and  bob are playing stone-game10"))
assert 17 ==(s.countValidWords("q-o  x-p! g-l- q-n  f-o, m-u. m-i! y-k, i-j, d-p! e-t, h-u  j-j- d-z- v-w, r-a  i-h. d-a! z-o, v-l, "))
