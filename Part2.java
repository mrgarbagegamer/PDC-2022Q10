public class Part2 {
    public static int[] solver()
    {
        // This one's a bit weird since it uses 1-12, excluding 11 and 7. I can solve this by making a starting array to use, though.
        int[] oldTerms = {1, 2, 3, 4, 5, 6, 8, 9, 10, 12};
        // Conditions to test:
        /*
         * A + C + F = H + G + E | Test after H
         * A + F + I = E + D + B | Test after I
         * A + C + I = B + H + J | Test after J
         * C + F + I = J + G + D | Test after J
         * I + H + G = D + C + B | Test after I
         * I + G + E = B + F + J | Test after J
         * I + H + E = J + D + A | Test after J
         * E + D + C = F + H + J | Test after J
         * E + C + B = J + G + A | Test after J
         * B + F + H = G + D + A | Test after H
         */
        int[] newTerms = new int[10];
        // Make sure to grab the nth term from the oldTerms array in your for loops.
        for (int A = 0; A < oldTerms.length; A++)
        {
            for (int B = 0; B < oldTerms.length; B++)
            {
                if (oldTerms[B] == oldTerms[A]) 
                    continue;
                for (int C = 0; C < oldTerms.length; C++)
                {
                    if (oldTerms[C] == oldTerms[A] || oldTerms[C] == oldTerms[B]) 
                        continue;
                    for (int D = 0; D < oldTerms.length; D++)
                    {
                        if (oldTerms[D] == oldTerms[A] || oldTerms[D] == oldTerms[B] || oldTerms[D] == oldTerms[C]) 
                            continue;
                        for (int E = 0; E < oldTerms.length; E++)
                        {
                            if (oldTerms[E] == oldTerms[A] || oldTerms[E] == oldTerms[B] || oldTerms[E] == oldTerms[C] || oldTerms[E] == oldTerms[D]) 
                                continue;
                            for (int F = 0; F < oldTerms.length; F++)
                            {
                                if (oldTerms[F] == oldTerms[A] || oldTerms[F] == oldTerms[B] || oldTerms[F] == oldTerms[C] || oldTerms[F] == oldTerms[D] || oldTerms[F] == oldTerms[E]) 
                                    continue;
                                for (int G = 0; G < oldTerms.length; G++)
                                {
                                    if (oldTerms[G] == oldTerms[A] || oldTerms[G] == oldTerms[B] || oldTerms[G] == oldTerms[C] || oldTerms[G] == oldTerms[D] || oldTerms[G] == oldTerms[E] || oldTerms[G] == oldTerms[F]) 
                                        continue;
                                    for (int H = 0; H < oldTerms.length; H++)
                                    {
                                        if (oldTerms[H] == oldTerms[A] || oldTerms[H] == oldTerms[B] || oldTerms[H] == oldTerms[C] || oldTerms[H] == oldTerms[D] || oldTerms[H] == oldTerms[E] || oldTerms[H] == oldTerms[F] || oldTerms[H] == oldTerms[G]) 
                                            continue;
                                        if (oldTerms[A] + oldTerms[C] + oldTerms[F] != oldTerms[H] + oldTerms[G] + oldTerms[E]) 
                                            continue;
                                        if (oldTerms[B] + oldTerms[F] + oldTerms[H] != oldTerms[G] + oldTerms[D] + oldTerms[A]) 
                                            continue;
                                        for (int I = 0; I < oldTerms.length; I++)
                                        {
                                            if (oldTerms[I] == oldTerms[A] || oldTerms[I] == oldTerms[B] || oldTerms[I] == oldTerms[C] || oldTerms[I] == oldTerms[D] || oldTerms[I] == oldTerms[E] || oldTerms[I] == oldTerms[F] || oldTerms[I] == oldTerms[G] || oldTerms[I] == oldTerms[H]) 
                                                continue;
                                            if (oldTerms[A] + oldTerms[F] + oldTerms[I] != oldTerms[E] + oldTerms[D] + oldTerms[B]) 
                                                continue;
                                            if (oldTerms[I] + oldTerms[H] + oldTerms[G] != oldTerms[D] + oldTerms[C] + oldTerms[B]) 
                                                continue;
                                            for (int J = 0; J < oldTerms.length; J++)
                                            {
                                                if (oldTerms[J] == oldTerms[A] || oldTerms[J] == oldTerms[B] || oldTerms[J] == oldTerms[C] || oldTerms[J] == oldTerms[D] || oldTerms[J] == oldTerms[E] || oldTerms[J] == oldTerms[F] || oldTerms[J] == oldTerms[G] || oldTerms[J] == oldTerms[H] || oldTerms[J] == oldTerms[I]) 
                                                    continue;
                                                if (oldTerms[A] + oldTerms[C] + oldTerms[I] != oldTerms[B] + oldTerms[H] + oldTerms[J]) 
                                                    continue;
                                                if (oldTerms[C] + oldTerms[F] + oldTerms[I] != oldTerms[J] + oldTerms[G] + oldTerms[D]) 
                                                    continue;
                                                if (oldTerms[I] + oldTerms[G] + oldTerms[E] != oldTerms[B] + oldTerms[F] + oldTerms[J]) 
                                                    continue;
                                                if (oldTerms[I] + oldTerms[H] + oldTerms[E] != oldTerms[J] + oldTerms[D] + oldTerms[A]) 
                                                    continue;
                                                if (oldTerms[E] + oldTerms[D] + oldTerms[C] != oldTerms[F] + oldTerms[H] + oldTerms[J]) 
                                                    continue;
                                                if (oldTerms[E] + oldTerms[C] + oldTerms[B] != oldTerms[J] + oldTerms[G] + oldTerms[A]) 
                                                    continue;
                                                else
                                                {
                                                    newTerms[0]=oldTerms[A];
                                                    newTerms[1]=oldTerms[B];
                                                    newTerms[2]=oldTerms[C];
                                                    newTerms[3]=oldTerms[D];
                                                    newTerms[4]=oldTerms[E];
                                                    newTerms[5]=oldTerms[F];
                                                    newTerms[6]=oldTerms[G];
                                                    newTerms[7]=oldTerms[H];
                                                    newTerms[8]=oldTerms[I];
                                                    newTerms[9]=oldTerms[J];
                                                    return newTerms;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] terms = solver();
        if (terms != null) {
            System.out.println("A: " + terms[0]);
            System.out.println("B: " + terms[1]);
            System.out.println("C: " + terms[2]);
            System.out.println("D: " + terms[3]);
            System.out.println("E: " + terms[4]);
            System.out.println("F: " + terms[5]);
            System.out.println("G: " + terms[6]);
            System.out.println("H: " + terms[7]);
            System.out.println("I: " + terms[8]);
            System.out.println("J: " + terms[9]);
        }
        else {
            System.out.println("No solution found.");
        }
    }
}
