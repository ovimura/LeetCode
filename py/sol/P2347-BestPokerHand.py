from typing import List


class Solution:
    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        cnt_flush = 0
        for i in range(len(ranks)):
            if suits[i] == suits[0]:
                cnt_flush += 1
        if cnt_flush == len(suits):
            return "Flush"
        cnt_three_of_a_kind = {}
        for i in range(len(ranks)):
            if ranks[i] not in cnt_three_of_a_kind.keys():
                cnt_three_of_a_kind[ranks[i]] = 1
            else:
                v = cnt_three_of_a_kind[ranks[i]] + 1
                cnt_three_of_a_kind[ranks[i]] = v
        for k in cnt_three_of_a_kind.keys():
            if cnt_three_of_a_kind[k] >= 3:
                return "Three of a Kind"
        for k in cnt_three_of_a_kind.keys():
            if cnt_three_of_a_kind[k] >= 2:
                return "Pair"
        cnt_High_card_ranks = set()
        for i in range(len(ranks)):
            cnt_High_card_ranks.add(ranks[i])
        if len(cnt_High_card_ranks) == len(ranks):
            return "High Card"
        return ""


s = Solution()

assert "Flush" == (s.bestHand([13, 2, 3, 1, 9], ["a", "a", "a", "a", "a"]))
assert "Three of a Kind" == (s.bestHand([4, 4, 2, 4, 4], ["d", "a", "a", "b", "c"]))
assert "Pair" == (s.bestHand([10, 10, 2, 12, 9], ["a", "b", "c", "a", "d"]))
assert "High Card" == (s.bestHand([10, 11, 2, 12, 9], ["a", "b", "c", "d", "e"]))

