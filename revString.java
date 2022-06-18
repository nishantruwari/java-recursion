public class revString {
    static StringBuffer reverse(String str, int index, StringBuffer sb) {
        /*
         * method 1
         * sb.append(str);
         * sb.reverse();
         * return sb;
         */
        /* method 2 */
        if (index < 0) {
            return sb;
        }
        sb.append(str.charAt(index));
        index--;
        return reverse(str, index, sb);

    }

    public static void main(String[] args) {
        String str = "tim";
        int index = str.length() - 1;
        StringBuffer sb = new StringBuffer();
        System.out.println(reverse(str, index, sb));
    }

}
