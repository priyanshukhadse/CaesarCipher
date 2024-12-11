import java.util.*;
public class CaesarCipher {

	public static String encrypt(String text, int shift) {
		StringBuilder result = new StringBuilder();
		for(char c : text.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				char base = Character.isLowerCase(c) ? 'a' : 'A' ;
				result.append((char) ((c - base + shift ) % 26  + base));
			}
			else {
				result.append(c);
			}
		}
		return result.toString();
	}
	
	public static String decrypt(String text,int shift)  {
	
		
			String intresult = encrypt( text,  shift);
			System.out.println("Decrypted Text : "+intresult);
			System.out.println();
			
			 
			System.out.print("Enter E for Exit and any key for Decryption : ");
			try (Scanner sc = new Scanner(System.in)) {
				String in = sc.nextLine().trim();
				
				System.out.println();
				
				
				if(in.equalsIgnoreCase("E")) {
					System.out.println("----END----");
					return intresult;
				}
				
				else{
					
					System.out.println("For next shift value");
					System.out.print("Enter shift value between 1 and 25 : ");
					int rshift = sc.nextInt();
					sc.nextLine();
					if(isValidShift(rshift)) {
						decrypt( text,  rshift);
					}
					
					else {
						System.out.println("Error: Shift value must be between 1 and 25.");
					}
				    
				    
				}
			}
			return "";
	}
	public static boolean isValidShift(int shift) {
        return shift > 0 && shift < 26;
    }
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter E for Encryption and D for Decryption : ");
		String in = sc.nextLine().trim();
		if(in.equalsIgnoreCase("E")) {
			System.out.print("Enter text : ");
			String text = sc.nextLine();
			
			System.out.print("Enter shift value between 1 and 25 : ");
			int shift = sc.nextInt();
			sc.nextLine();
			if(isValidShift(shift)) {
			
			String encryptedText = encrypt( text,  shift);
			System.out.println("Encrypted Text : "+encryptedText);
			System.out.println("----END----");
			}
			else {
				System.out.println("Error: Shift value must be between 1 and 25.");
			}
			
			
		}
		
		else if(in.equalsIgnoreCase("D")) {
			
			System.out.print("Enter text : ");
			String text = sc.nextLine();
			System.out.print("Enter shift value between 1 and 25 : ");
			int shift = sc.nextInt();
			sc.nextLine();
			if(isValidShift(shift)) {
				decrypt(text,  shift);
			}
			else {
				System.out.println("Error: Shift value must be between 1 and 25.");
			}
			
		}
		else {
			System.out.println("Invalid Input !!!");
		}
		
		
		sc.close();

	}

}
