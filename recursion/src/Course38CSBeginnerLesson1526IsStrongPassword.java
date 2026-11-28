class Course38CSBeginnerLesson1526IsStrongPassword {
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        // boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            Character wrappedChar = password.charAt(i);
            if (Character.isDigit(password.charAt(i))) {
                return true;
                // result = true;
                // break;
            };
        }
        return false;
        // return result;
    }
    public static void main(String[] args) {
        System.out.println(isStrongPassword("MyPass123"));
        System.out.println(isStrongPassword("short1"));
        System.out.println(isStrongPassword("noDigitsHere"));
        System.out.println(isStrongPassword("Abcd1234"));
        System.out.println(isStrongPassword("Password"));

        System.out.println(isStrongPassword("ALdb9Lbp81n"));
    }
}
