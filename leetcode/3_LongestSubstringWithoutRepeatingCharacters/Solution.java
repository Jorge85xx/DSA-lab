import java.util.HashMap;
import java.util.Map;

class Solution {
  // First solution
  // public static int lengthOfLongestSubstring(String s) {
  //   int maxLength = 0;
  //   for (int i = 0; i < s.length(); i++) {
  //       StringBuilder currentSubstring = new StringBuilder();
  //       for (int j = 0; j < s.length(); j++) {
  //         if(currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1){
  //           break;
  //         }
  //         currentSubstring.append(s.charAt(j));
  //         maxLength = Math.max(maxLength, currentSubstring.length());
  //       }
  //   }
  //   return maxLength;
  // }

  // Second Solutionn - Better
  public static int lengthOfLongestSubstring(String s){
    int maxlength = 0;
    Map<Character, Integer> visitedCharacters = new HashMap<>();
    for (int right = 0, left = 0; right < s.length(); right++) {
      char currentChar = s.charAt(right);
      if(visitedCharacters.containsKey(currentChar) && 
      visitedCharacters.get(currentChar) >= left){
        left = visitedCharacters.get(currentChar) + 1;
      }
      maxlength = Math.max(maxlength, right - left + 1);
      visitedCharacters.put(currentChar, right);
    }
    return maxlength; 
  }

  public static void main(String[] args) {
    
    System.out.println(lengthOfLongestSubstring("aab"));
    System.out.println(lengthOfLongestSubstring("abcabcbb"));
    System.out.println(lengthOfLongestSubstring(""));
    System.out.println(lengthOfLongestSubstring(" "));
    System.out.println(lengthOfLongestSubstring("bbbbb"));
    System.out.println(lengthOfLongestSubstring("pwwkew"));
  }
} 