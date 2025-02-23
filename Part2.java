public class Part2 {
    public static int[] solver()
    {
        // This one's a bit weird since it uses 1-10, then 12, excluding 11. I can solve this by making a starting array to use, though.
        int[] oldTerms = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        // Conditions to test:
        /*
         * A + C + F = H + G + E | Test after H
         * A + F + I = E + D + B | Test after I
         * A + C + I = B + H + J | Test after J
         * C + F + I = J + G + D | Test after J
         * I + H + G = D + C + B | Test after I
         * I + G + E = B + F + J | Test after J
         * I + H + E = J + D + A | Test after I
         * E + D + C = F + H + J | Test after J
         * E + C + B = J + G + A | Test after J
         * B + F + H = G + D + A | Test after H
         */
        // Make sure to grab the nth term from the oldTerms array in your for loops.
    }
}
