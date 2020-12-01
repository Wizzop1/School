public class BankAccount {
    public static long parse(final String str) {
        String res = "";
        for (int i = 0; i < (str.length() - 3) / 3; i += 3) {
            String a = str.substring(i, i + 3),
                    b = str.substring(i + (str.length() + 1) / 3, i + 3 + (str.length() + 1) / 3),
                    c = str.substring(i + (str.length() + 1) / 3 * 2, i + 3 + (str.length() + 1) / 3 * 2);
            if (b.charAt(1) == ' ' && c.charAt(1) == '_') res += "0";
            else if (a.charAt(1) == ' ' && b.charAt(1) == ' ') res += "1";
            else if (b.charAt(0) == ' ' && c.charAt(2) == ' ') res += "2";
            else if (b.charAt(0) == ' ' && b.charAt(1) == '_' && c.charAt(0) == ' ') res += "3";
            else if (a.charAt(1) == ' ' && b.charAt(1) == '_') res += "4";
            else if (b.charAt(2) == ' ' && c.charAt(0) == ' ') res += "5";
            else if (b.charAt(2) == ' ') res += "6";
            else if (c.charAt(1) == ' ') res += "7";
            else if (c.charAt(0) == '|') res += "8";
            else res += "9";
        }
        return Long.parseLong(res);
    }
}
