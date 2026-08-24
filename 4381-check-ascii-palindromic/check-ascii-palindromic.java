class Solution {
    public boolean isPalindromic(String s) {

        StringBuilder binary = new StringBuilder();

        for (char c:s.toCharArray()){
            int ascii = (int) c;
            //Building binary string
            String bits = Integer.toBinaryString(ascii);

            while(bits.length() < 8){
                bits = "0" + bits;
            }

             binary.append(bits);
        }
        //for reversing 

        String original = binary.toString();
        String reversed = binary.reverse().toString();

        //for compairing
        return original.equals(reversed);

    }
}