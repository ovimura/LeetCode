

def splitNum(num: int) -> int:
    num1 = []
    num2 = []
    items = [int(n) for n in str(num)]
    items.sort()
    str_items = [str(i) for i in items]
    for i, e in enumerate(str(''.join(str_items))):
        if i % 2 == 0:
            num1.append((e))
        else:
            num2.append((e))
    return int("".join(num1)) + int("".join(num2))


assert 75 == (splitNum(678))

