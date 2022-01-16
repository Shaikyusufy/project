package project;

import java.util.regex.Pattern;

public class RegularExpressin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


				
				
				System.out.println(Pattern.matches("[a-z]+", "Facebook"));
				System.out.println(Pattern.matches("[a-z]+","hello 1everyone"));
				System.out.println(Pattern.matches("[a-z]+","a"));
				
				System.out.println(Pattern.matches("^[a-zA-Z0-9_.]+@(.+)$", "ram123@yahoo.com"));
			}

		}

	


