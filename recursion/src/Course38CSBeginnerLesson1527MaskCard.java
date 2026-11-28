class Course38CSBeginnerLesson1527MaskCard {
    public static String maskCard(String cardNumber) {
        String maskedCardNumber = "";
        for (int i = cardNumber.length() - 1, count = 1; i >= 0; i--, count++) {
            if (count <= 4) {
                maskedCardNumber = cardNumber.charAt(i) + maskedCardNumber;
            } else {
                maskedCardNumber = "*" + maskedCardNumber;
            }
        }
        return maskedCardNumber;
    }
    public static void main(String[] args) {
        System.out.println(maskCard("1234567890123456"));
        System.out.println(maskCard("4111111111111111"));
        System.out.println(maskCard("12345678"));
        System.out.println(maskCard("12345"));
        System.out.println(maskCard("9876543210"));
    }
}
