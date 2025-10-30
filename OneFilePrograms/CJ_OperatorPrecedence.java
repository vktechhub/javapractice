public class CJ_OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println("===== POSTFIX (expr++, expr--)  — Left to Right =====");
        {
            int x = 5;
            int a = x++; // a=5, then x becomes 6
            int b = x--; // b=6, then x becomes 5
            System.out.println("x++ then x-- -> a=" + a + ", b=" + b + ", x=" + x);
        }

        System.out.println("\n===== UNARY (++expr, --expr, +, -, ~, !) — Right to Left =====");
        {
            int x = 5;
            int y = ++x;      // pre-increment: x=6, y=6
            int z = -y;       // unary minus: z=-6
            int pos = +z;     // unary plus: +(-6) = -6
            int bit = ~1;     // bitwise NOT: ~0001 = ...1110 (two's complement)
            boolean flag = !false; // logical NOT
            System.out.println("++x=" + y + ", -y=" + z + ", +z=" + pos + ", ~1=" + bit + ", !false=" + flag);
        }

        System.out.println("\n===== MULTIPLICATIVE (*, /, %) — Left to Right =====");
        {
            int a = 7 * 3;    // 21
            int b = 7 / 3;    // 2 (integer division)
            int c = 7 % 3;    // 1
            System.out.println("7*3=" + a + ", 7/3=" + b + ", 7%3=" + c);
        }

        System.out.println("\n===== ADDITIVE (+, -) — Left to Right =====");
        {
            int a = 10 + 5 - 2; // (10+5)-2 = 13
            String s = "Hi " + "there"; // string concatenation
            System.out.println("10+5-2=" + a + ", \"Hi \"+\"there\"=" + s);
        }

        System.out.println("\n===== SHIFT (<<, >>, >>>) — Left to Right =====");
        {
            int x = 0b0001_0000; // 16
            int l = x << 2;      // 16<<2 = 64
            int ar = -8 >> 1;    // arithmetic right shift keeps sign bit
            int lr = -8 >>> 1;   // logical right shift fills with zeros
            System.out.println("16<<2=" + l + ", (-8)>>1=" + ar + ", (-8)>>>1=" + lr);
        }

        System.out.println("\n===== RELATIONAL (<, <=, >, >=, instanceof) — Left to Right =====");
        {
            int a = 5, b = 8;
            boolean r1 = a < b;        // true
            boolean r2 = a >= b;       // false
            Object obj = "hello";
            boolean r3 = obj instanceof String; // true
            boolean r4 = null instanceof String; // false
            System.out.println("5<8=" + r1 + ", 5>=8=" + r2 + ", \"hello\" instanceof String=" + r3 + ", null instanceof String=" + r4);
        }

        System.out.println("\n===== EQUALITY (==, !=) — Left to Right =====");
        {
            int a = 10, b = 10, c = 20;
            boolean e1 = (a == b); // true
            boolean e2 = (a != c); // true
            String s1 = new String("java");
            String s2 = new String("java");
            boolean refEq = (s1 == s2);    // false (different objects)
            boolean valEq = s1.equals(s2); // true (same contents)
            System.out.println("10==10=" + e1 + ", 10!=20=" + e2 + ", s1==s2=" + refEq + ", s1.equals(s2)=" + valEq);
        }

        System.out.println("\n===== BITWISE AND (&) — Left to Right =====");
        {
            int a = 0b1100; // 12
            int b = 0b1010; // 10
            int res = a & b; // 1000 (8)
            System.out.println("1100 & 1010 = " + Integer.toBinaryString(res) + " (" + res + ")");
        }

        System.out.println("\n===== BITWISE XOR (^) — Left to Right =====");
        {
            int a = 0b1100; // 12
            int b = 0b1010; // 10
            int res = a ^ b; // 0110 (6)
            System.out.println("1100 ^ 1010 = " + Integer.toBinaryString(res) + " (" + res + ")");
        }

        System.out.println("\n===== BITWISE OR (|) — Left to Right =====");
        {
            int a = 0b1100; // 12
            int b = 0b1010; // 10
            int res = a | b; // 1110 (14)
            System.out.println("1100 | 1010 = " + Integer.toBinaryString(res) + " (" + res + ")");
        }

        System.out.println("\n===== LOGICAL AND (&&) — Left to Right (short-circuit) =====");
        {
            int cnt = 0;
            boolean left = (++cnt > 0); // cnt becomes 1, left=true
            boolean right = (cnt++ > 1); // evaluated only if left==true; here left is true, so right uses cnt=1 -> false; cnt becomes 2 after post++
            boolean all = left && right; // false
            System.out.println("left=" + left + ", right=" + right + ", cnt=" + cnt + ", left&&right=" + all);

            // Short-circuit skip example:
            cnt = 0;
            boolean sc = false && (++cnt > 0); // left is false => right NOT evaluated
            System.out.println("false&&... short-circuits; cnt stays " + cnt + ", result=" + sc);
        }

        System.out.println("\n===== LOGICAL OR (||) — Left to Right (short-circuit) =====");
        {
            int cnt = 0;
            boolean left = (cnt++ == 0); // true, cnt becomes 1
            boolean rightSkipped = true || (++cnt > 0); // short-circuits, ++cnt not executed
            System.out.println("left=" + left + ", rightSkipped=" + rightSkipped + ", cnt=" + cnt);
        }

        System.out.println("\n===== TERNARY (?:) — Right to Left =====");
        {
            int x = 5;
            String s = (x % 2 == 0) ? "even" : "odd";
            System.out.println("x=5 -> " + s);

            // Nesting shows right-to-left binding:
            int n = -3;
            String sign = (n > 0) ? "positive" : (n == 0) ? "zero" : "negative";
            System.out.println("n=-3 -> " + sign);
        }

        System.out.println("\n===== ASSIGNMENT (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=) — Right to Left =====");
        {
            int a, b, c;
            a = b = c = 5; // right-to-left chaining
            System.out.println("a=" + a + ", b=" + b + ", c=" + c);

            int x = 8;
            x += 4;   // 12
            x -= 2;   // 10
            x *= 3;   // 30
            x /= 4;   // 7 (integer)
            x %= 5;   // 2
            System.out.println("After +=,-=,*=,/=,%= -> x=" + x);

            int m = 0b0101; // 5
            m &= 0b0110;    // 0100 (4)
            m |= 0b0001;    // 0101 (5)
            m ^= 0b0011;    // 0110 (6)
            System.out.println("After &=, |=, ^= -> m=" + Integer.toBinaryString(m) + " (" + m + ")");

            int sh = 0b0001_0000; // 16
            sh <<= 2;  // 64
            sh >>= 1;  // 32
            sh >>>= 1; // 16
            System.out.println("After <<=, >>=, >>>= -> sh=" + sh);
        }

        System.out.println("\n===== BONUS: PARENTHESES override precedence =====");
        {
            int a = 10 + 5 * 2;     // 20 (5*2 first)
            int b = (10 + 5) * 2;   // 30
            System.out.println("10 + 5 * 2 = " + a + ", (10 + 5) * 2 = " + b);
        }
    }
}
