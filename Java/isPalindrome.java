public class isPalindrome {

    public static Boolean isPalindrm(String strng) {
        for (int i = 0, j = strng.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(strng.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(strng.charAt(j))) {
                j--;
            }
            if (strng.charAt(i) != strng.charAt(j)) {
                return false;
            }
        }
        
        return true;

    }

    public static void main(String[] args) {
        Boolean srg = isPalindrm("acaa");
        System.out.println(srg);
        // System.out.println("Asantosh");
        // }
    }
}
