package com.learning.java.array.sign;

public class Sign {

    private String message;

    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }
    //ABCDEFG, 2 ==> ceil(3.5) => 4
    //AB;CD;EF;G


    public int numberOfLines() {
        // 7 * 1.0 / 2 = >  Math.ceil(3.5) => (int) 4.0 => 4
        return (int) Math.ceil((message.length() * 1.0) / width);
    }


    public String getLines() {

        if(message.isEmpty()) {
            return null;
        }
        String result = "";

        int numberOfLines = numberOfLines();

        //ABC222DE , 3 ==> 3
        // i = 0 (First line) ABC
        // start = 0 * 3 === 0
        // end = start + width = Min(3, 8) => 3
        // i = 1 (Second line)
        // start = 3
        // end = 6  Min(6, 8) ==> 6
        // i = 2 (Third line)
        // start = 6
        // end = 8 <====
        //ABC;222;DE;
        for(int i = 0 ; i < numberOfLines; i++) {
            int start = i * width;
            int end = Math.min(start + width, message.length()); // it's use to handle the last line scenario
            result = result + message.substring(start, end);

            if ( i != numberOfLines - 1) { // don't run this when we are at the last line
                result = result + ";";
            }
        }

        return result;
    }


}
