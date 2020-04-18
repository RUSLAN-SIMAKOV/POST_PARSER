public class PostParser {
    public static long parse(final String acctNbr) {
        StringBuffer oneDigitString = new StringBuffer();
        StringBuffer parsedNumber = new StringBuffer();
        String[] arr = acctNbr.split("\n");

        for (int i = 0; i < arr[0].length(); i = i + 3) {
            oneDigitString.append(arr[0].charAt(i));
            oneDigitString.append(arr[0].charAt(i + 1));
            oneDigitString.append(arr[0].charAt(i + 2));
            oneDigitString.append(arr[1].charAt(i));
            oneDigitString.append(arr[1].charAt(i + 1));
            oneDigitString.append(arr[1].charAt(i + 2));
            oneDigitString.append(arr[2].charAt(i));
            oneDigitString.append(arr[2].charAt(i + 1));
            oneDigitString.append(arr[2].charAt(i + 2));

            String number = oneDigitString.toString();
            parsedNumber.append(parseNumber(number));
            oneDigitString.delete(0, 9);
        }


        return (long) Long.parseLong(parsedNumber.toString());
    }

    private static int parseNumber(String number) {

        switch (number) {
            case " _ | ||_|":
                return 0;
            case "     |  |":
                return 1;
            case " _  _||_ ":
                return 2;
            case " _  _| _|":
                return 3;
            case "   |_|  |":
                return 4;
            case " _ |_  _|":
                return 5;
            case " _ |_ |_|":
                return 6;
            case " _   |  |":
                return 7;
            case " _ |_||_|":
                return 8;
            case " _ |_| _|":
                return 9;
            default:
                throw new IllegalArgumentException("Check you number!!!");

        }
    }

    public static void main(String[] args) {
        System.out.println(parse("    _  _     _  _  _  _  _ \n" +
                "  | _| _||_||_ |_   ||_||_|\n" +
                "  ||_  _|  | _||_|  ||_| _|\n"));
    }
}

