package HW8;

import java.util.Arrays;

public class moloko {

        public static void main(String[] args) {
            String str = "moloko kolbasa maslo pomidor";
            String[] words = str.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
