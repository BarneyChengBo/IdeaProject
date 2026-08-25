package exercise10;

public class PasswordCheck {


    public boolean check(String password) {


        //boolean isValid = false;
        boolean moreThan8Char = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;


        if (password.length() >= 8){
            moreThan8Char = true;
        }

        for( int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)) {
                hasDigit = true;
            }
            if(!Character.isLetterOrDigit(c)){
                hasSpecialChar = true;
            }



        }




        return  moreThan8Char && hasDigit && hasSpecialChar;
    }
}
