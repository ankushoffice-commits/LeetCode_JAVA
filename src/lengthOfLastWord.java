class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        // s = "what color is the sky"
        String[] str = s.split(" ");
        
        String lastword = str[str.length-1];
        
        return lastword.length();
    }
    
    public static void main(String[] args){
        System.out.println(lengthOfLastWord("what color is the sky"));
    }
}
