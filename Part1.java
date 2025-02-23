public class Part1 {
    public static int[] solver()
    {
        int[] terms = new int[11];
        // All variables must be between 1-11, with no repeated numbers
        // The following equations are true:
        /* 
         * A + D = B + G
         * A + C = E + H
         * B + C = I + J
         * D + E = I + K
         * G + J = H + K
         */
        
        for (int A = 1; A <= 11; A++)
        {
            for (int B = 1; B <= 11; B++)
            {
                if (B == A)
                    continue;
                for (int C = 1; C <= 11; C++)
                {
                    if (C == A || C == B)
                        continue;
                    for (int D = 1; D <= 11; D++)
                    {
                        if (D == A || D == B || D == C)
                            continue;
                        for (int E = 1; E <= 11; E++)
                        {
                            if (E == A || E == B || E == C || E == D)
                                continue;
                            for (int F = 1; F <= 11; F++)
                            {
                                if (F == A || F == B || F == C || F == D || F == E)
                                    continue;
                                for (int G = 1; G <= 11; G++)
                                {
                                    if (G == A || G == B || G == C || G == D || G == E || G == F)
                                        continue;
                                    if (A + D != B + G)
                                        continue;
                                    for (int H = 1; H <= 11; H++)
                                    {
                                        if (H == A || H == B || H == C || H == D || H == E || H == F || H == G)
                                            continue;
                                        if (A + C != E + H)
                                            continue;
                                        for (int I = 1; I <= 11; I++)
                                        {
                                            if (I == A || I == B || I == C || I == D || I == E || I == F || I == G || I == H)
                                                continue;
                                            for (int J = 1; J <= 11; J++)
                                            {
                                                if (J == A || J == B || J == C || J == D || J == E || J == F || J == G || J == H || J == I)
                                                    continue;
                                                if (B + C != I + J)
                                                    continue;
                                                for (int K = 1; K <= 11; K++)
                                                {
                                                    if (K == A || K == B || K == C || K == D || K == E || K == F || K == G || K == H || K == I || K == J)
                                                        continue;
                                                    if (D + E != I + K)
                                                        continue;
                                                    if (G + J != H + K)
                                                        continue;
                                                    terms[0] = A;
                                                    terms[1] = B;
                                                    terms[2] = C;
                                                    terms[3] = D;
                                                    terms[4] = E;
                                                    terms[5] = F;
                                                    terms[6] = G;
                                                    terms[7] = H;
                                                    terms[8] = I;
                                                    terms[9] = J;
                                                    terms[10] = K;
                                                    return terms;
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
    public static void main(String[] args)
    {
        int[] terms = solver();
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
        System.out.println("K: " + terms[10]);
    }
}