package HackerBlocks;

/*
    Question link: https://hack.codingblocks.com/app/dcb/698
 */

import java.util.Scanner;

public class MelonEmployees {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int t = Integer.parseInt(s.nextLine());
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        while (t-- > 0){
            String st = s.nextLine();
            int[] f = new int[26];
            for (int i = 0; i < st.length(); i++) {
                f[st.charAt(i) - 'a']++;
            }
        }
    }
}
