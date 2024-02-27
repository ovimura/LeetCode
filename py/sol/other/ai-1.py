
def convert_C_to_K_and_F(degree:float) -> [float, float]:
    try:
        degree:float = float(degree)
    except:
        raise Exception("error: {} is not a floating-point; provide a floating-point as argument".format(degree))
    if degree < 0:
        raise Exception('error: {0} is less than 0'.format(degree))
    C:float = degree
    K:float = round(C + 273.15, 5)
    F:float = round(C * 1.80 + 32.00, 5)
    return [K, F]

print(convert_C_to_K_and_F("36") )

assert convert_C_to_K_and_F("36") == [309.15, 96.8]
