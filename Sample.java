// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DuplicateFinder {
    public static void main(String[] args) {
        String input = "abcafavdvvddd";
        Set<Character> result = new LinkedHashSet();
        List<Character> removedChars= new ArrayList();
            while(input.length()>1){
                if(!removedChars.contains(input.charAt(0))){
                removedChars.add(input.charAt(0));
                
                }
                else {
                      result.add(input.charAt(0));
                    
                }
                input = removeFirstChar(input);
            }
        
        System.out.println("Duplicate chars : " + result);
        System.out.println("removedChars:" + removedChars);
    }
    
    private static String removeFirstChar(String input){
        System.out.println("Removed : " +  input.charAt(0));
        String strNew = input.substring(1, input.length());
        return strNew;
    }
}
