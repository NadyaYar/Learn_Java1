package Lesson16;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        String test = "test is some some text";
        System.out.println(deleteDuplicates(test));
        System.out.println(Arrays.toString(countDuplicates(test, new String[]{"test", "is", "ere"})));

    }

//    public static String replace(String input, String target, String replacement) {
//
//    }

    // delete replacing words
    public static String deleteDuplicates(String input) {
        String test = "test is some some text";
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j]))
                    words[j] = "";
            }
        }
        String res = "";
        for (String word : words) {
            res += word;
            if (!word.isEmpty())
                res += " ";

        }
        return res;
    }

    public static int[] countDuplicates(String input, String[] words) {
        String[] strings = input.split(" ");
        int[] res = new int[words.length];

        for (String string : strings) {
            for (int i = 0; i < words.length; i++) {
                if (string.equals(words[i]))
                    res[i]++;
            }
        }
        return res;
    }
}
