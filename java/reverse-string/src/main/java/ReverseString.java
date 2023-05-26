class ReverseString {

    String reverse(String inputString) {
        if (inputString == null || inputString == "") {
            return "";
        }

        return (new StringBuilder(inputString)).reverse().toString();
    }

}
