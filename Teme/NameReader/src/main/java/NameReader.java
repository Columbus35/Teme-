import java.util.Scanner;

public class NameReader {

    public static void main(String[] args) {
        String a;
        System.out.println("Enter you word");
        Scanner s = new Scanner(System.in);
        a = s.next();
        filter(a);

    }

    static void filter(String text) {
        int chair_a = 0;
        int chair_b = 0;
        int chair_c = 0;
        int chair_d = 0;
        int chair_e = 0;
        int chair_f = 0;
        int chair_g = 0;
        int chair_h = 0;
        int chair_i = 0;
        int chair_j = 0;
        int chair_k = 0;
        int chair_l = 0;
        int chair_m = 0;
        int chair_n = 0;
        int chair_p = 0;
        int chair_q = 0;
        int chair_r = 0;
        int chair_v = 0;
        int chair_w = 0;
        int chair_t = 0;
        int chair_u = 0;
        int chair_x = 0;
        int chair_y = 0;
        int chair_z = 0;
        int chair_o = 0;
        int chair_s = 0;


        char[] in = text.toCharArray();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 'a') {
                ++chair_a;
            }
            if (in[i] == 'b') {
                ++chair_b;

            }
            if (in[i] == 'c') {
                ++chair_c;
            }
            if (in[i] == 'd') {
                ++chair_d;
            }
            if (in[i] == 'e') {
                ++chair_e;
            }
            if (in[i] == 'f') {
                ++chair_f;
            }
            if (in[i] == 'g') {
                ++chair_g;
            }
            if (in[i] == 'h') {
                ++chair_h;
            }
            if (in[i] == 'i') {
                ++chair_i;
            }
            if (in[i] == 'j') {
                ++chair_j;
            }
            if (in[i] == 'k') {
                ++chair_k;
            }
            if (in[i] == 'l') {
                ++chair_l;
            }
            if (in[i] == 'm') {
                ++chair_m;
            }
            if (in[i] == 'n') {
                ++chair_n;
            }
            if (in[i] == 'o') {
                ++chair_o;
            }
            if (in[i] == 'p') {
                ++chair_p;
            }
            if (in[i] == 'q') {
                ++chair_q;
            }
            if (in[i] == 'r') {
                ++chair_r;
            }
            if (in[i] == 's') {
                ++chair_s;
            }
            if (in[i] == 't') {
                ++chair_t;
            }
            if (in[i] == 'v') {
                ++chair_v;
            }
            if (in[i] == 'w') {
                ++chair_w;
            }
            if (in[i] == 'x') {
                ++chair_x;
            }
            if (in[i] == 'y') {
                ++chair_y;
            }
            if (in[i] == 'z') {
                ++chair_z;
            }

        }
        int chars = chair_a + chair_b + chair_c + chair_d + chair_e + chair_f + chair_g + chair_h +
                chair_i + chair_j + chair_l + chair_m + chair_n + chair_o + chair_q + chair_p + chair_r +
                chair_s + chair_t + chair_v + chair_w + chair_x + chair_y + chair_z +chair_u;
        System.out.println("The word hase " + chars + " caracters");

        if (chair_a > 0) {
            System.out.println("a:" + chair_a);

        }
        if (chair_b > 0) {
            System.out.println("b:" + chair_b);
        }
        if (chair_c > 0) {
            System.out.println("c:" + chair_c);
        }
        if (chair_d > 0) {
            System.out.println("d:" + chair_d);
        }
        if (chair_e > 0) {
            System.out.println("e:" + chair_e);
        }
        if (chair_g > 0) {
            System.out.println("g:" + chair_g);
        }
        if (chair_h > 0) {
            System.out.println("h:" + chair_h);
        }
        if (chair_i > 0) {
            System.out.println("i:" + chair_i);
        }
        if (chair_j > 0) {
            System.out.println("j:" + chair_j);
        }
        if (chair_k > 0) {
            System.out.println("k:" + chair_k);
        }
        if (chair_l > 0) {
            System.out.println("l:" + chair_l);
        }
        if (chair_m > 0) {
            System.out.println("m:" + chair_m);
        }
        if (chair_n > 0) {
            System.out.println("n:" + chair_n);
        }
        if (chair_o > 0) {
            System.out.println("o:" + chair_o);
        }
        if (chair_q > 0) {
            System.out.println("q:" + chair_q);
        }
        if (chair_p > 0) {
            System.out.println("p:" + chair_p);
        }
        if (chair_r > 0) {
            System.out.println("r:" + chair_r);
        }
        if (chair_t > 0) {
            System.out.println("t:" + chair_t);
        }
        if (chair_s > 0) {
            System.out.println("s:" + chair_s);
        }
        if (chair_v > 0) {
            System.out.println("v" + chair_v);
        }
        if (chair_w > 0) {
            System.out.println("w:" + chair_w);
        }
        if (chair_x > 0) {
            System.out.println("x:" + chair_x);
        }
        if (chair_y > 0) {
            System.out.println("y:" + chair_y);
        }
        if (chair_z > 0) {
            System.out.println("z:" + chair_z);
        }


    }
}
