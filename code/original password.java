 class Main {

    public static void main(String[] args) {
        String originalPassword = "";
        String maskedPassword = maskPassword(originalPassword);

        System.out.println("Original Password: " + originalPassword);
        System.out.println("Masked Password: " + maskedPassword);
    }

   
    public static String maskPassword(String password) {
        if (password == null || password.isEmpty()) {
            return "";
        }

       
        return "*".repeat(password.length());
    }
}