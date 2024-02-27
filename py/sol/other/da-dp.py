
def lcs(X, Y):
    """
    This function finds the length of the longest common subsequence of two strings.

    Args:
      X: The first string.
      Y: The second string.

    Returns:
      The length of the longest common subsequence.
    """
    m = len(X)
    n = len(Y)

    # Create a table to store the lengths of the longest common subsequences of substrings.
    dp = [[0 for _ in range(n + 1)] for _ in range(m + 1)]

    # Fill the DP table in a bottom-up manner.
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if X[i-1] == Y[j-1]:
                dp[i][j-1] = dp[i-1][j-1] + 1
            else:
                dp[i][j] = min(dp[i-1][j], dp[i][j-1])

    # The length of the LCS is stored in the bottom right corner of the DP table.
    return dp[m][n]


def lcs2(X, Y):
    """
    Finds the length of the longest common subsequence (LCS) of two strings X and Y.

    Args:
        X: The first string.
        Y: The second string.

    Returns:
        The length of the LCS.
    """

    m = len(X)
    n = len(Y)

    # Create a table to store LCS lengths of substrings.
    # DP table dimensions are (m+1)x(n+1) to accommodate base cases (empty strings)
    dp = [[0 for j in range(n + 1)] for i in range(m + 1)]

    # Build the DP table in bottom-up manner (tabulation)
    for i in range(1, m + 1):
        for j in range(1, n + 1):
            if X[i - 1] == Y[j - 1]:  # If characters match
                dp[i][j] = dp[i - 1][j - 1] + 1
            else:  # If characters don't match
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])

    # The length of the LCS is in the bottom-right corner of the table
    return dp[m][n]


# Example usage
# X = "ABCDE"
# Y = "BCDFG"

X = "AGGTAB"
Y = "GXTXAYB"

lcs_length = lcs(X, Y)
print(f"The length of the longest common subsequence is: {lcs_length}")


# Function to find lcs_algo
def lcs_algo(S1, S2, m, n):
    L = [[0 for x in range(n + 1)] for x in range(m + 1)]

    # Building the mtrix in bottom-up way
    for i in range(m + 1):
        for j in range(n + 1):
            if i == 0 or j == 0:
                L[i][j] = 0
            elif S1[i - 1] == S2[j - 1]:
                L[i][j] = L[i - 1][j - 1] + 1
            else:
                L[i][j] = max(L[i - 1][j], L[i][j - 1])

    index = L[m][n]

    lcs_algo = [""] * (index + 1)
    lcs_algo[index] = ""

    i = m
    j = n
    while i > 0 and j > 0:

        if S1[i - 1] == S2[j - 1]:
            lcs_algo[index - 1] = S1[i - 1]
            i -= 1
            j -= 1
            index -= 1

        elif L[i - 1][j] > L[i][j - 1]:
            i -= 1
        else:
            j -= 1

    # Printing the sub sequences
    print("S1 : " + S1 + "\nS2 : " + S2)
    print("LCS: " + "".join(lcs_algo))


S1 = "AGGTAB"
S2 = "GXTXAYB"


m = len(S1)
n = len(S2)
print(lcs_algo(S1, S2, m, n))


