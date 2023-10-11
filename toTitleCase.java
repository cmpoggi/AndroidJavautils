    public String toTitleCase(String string) {
        if (string == null) return null;
        boolean whiteSpace = true;

        StringBuilder builder = new StringBuilder(string);
        final int builderLength = builder.length();

        for (int i = 0; i < builderLength; ++i) {
            char c = builder.charAt(i);
            if (whiteSpace) {
                if (!Character.isWhitespace(c)) {
                    builder.setCharAt(i, Character.toTitleCase(c));
                    whiteSpace = false;
                }
            }
            else if (Character.isWhitespace(c)) {
                whiteSpace = true;
            }
            else builder.setCharAt(i, Character.toLowerCase(c));
        }
        return builder.toString();
    }
