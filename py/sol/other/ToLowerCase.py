def toLowerCase(str: str) -> str:
    s = ''
    for i in range(len(str)):
        if 91 > ord(str[i]) > 64:
            s += chr(ord(str[i]) + 32)
        else:
            s += str[i]
    return s


assert toLowerCase('AGG') == 'agg'
assert toLowerCase('Hello') == 'hello'
assert toLowerCase("al&phaBET") == "al&phabet"

print(toLowerCase('AGG'))

