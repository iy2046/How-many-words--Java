import java.util.*;

public class HowManyWords {
	
	public static void main(String[] args) {
		String readLine;
		String wordInLine;
		
		Scanner in = new Scanner(System.in);
		HashSet<String> allWords = new HashSet<String>();
		
		while(in.hasNextLine()) {
			readLine = in.nextLine();
			wordInLine = ""; 
			
			for (int i = 0; i < readLine.length(); i++) {
				
				char eachChar = readLine.charAt(i);
				
				if (Character.isAlphabetic(eachChar)) {
					wordInLine += eachChar;
				}
				else {
					if (!wordInLine.isEmpty()) {
						allWords.add(wordInLine.toLowerCase());
						
						wordInLine = "";
					}
				}
			}
			
			if (!wordInLine.isEmpty()) {
				allWords.add(wordInLine.toLowerCase()); 
			}
		}
		in.close();
		
		List<String> outputWordsList = new ArrayList<String>(allWords);
		
		
		Collections.sort(outputWordsList);
		for (String outputWord : outputWordsList) {
			System.out.println(outputWord);
		}
	}
}
