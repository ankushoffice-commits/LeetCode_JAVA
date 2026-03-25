import java.util.HashMap;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "mumbai";
        HashMap<String, Integer> freqMap = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i)); // Convert char to String
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println(freqMap.toString());
    }
}
