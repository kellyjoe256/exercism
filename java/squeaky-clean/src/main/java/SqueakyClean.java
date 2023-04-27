class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        String newIdentifier = identifier
            // remove emoji characters from string
            .replaceAll("[\ud83c\udf00-\ud83d\ude4f]|[\ud83d\ude80-\ud83d\udeff]", "")
            // remove or omit any Greek letters in the range 'α' to 'ω'
            .replaceAll("[α-ω]", "");
        for (int i = 0, length = newIdentifier.length(); i < length; i++) {
            char character = newIdentifier.charAt(i);
            if (Character.isSpaceChar(character)) {
                sb.append("_");
            } else if (Character.isISOControl(character)) {
                sb.append("CTRL");
            } else if (Character.isDigit(character)) {
                sb.append("");
            } else if (character == '-') {
                character = newIdentifier.charAt(++i);
                sb.append(Character.isLetter(character) ? Character.toUpperCase(character) : "");
            } else {
                sb.append(character);
            }
        }

        return sb.toString();
    }
}
