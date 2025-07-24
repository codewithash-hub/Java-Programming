package com.LanguageFamilies;

import java.util.*;

public class LanguageFamilies {

	public static void main(String[] args) {
		// Step 1: Define a map of language families
		Map<String, List<String>> languageFamilies = new HashMap<>();
		
		languageFamilies.put("Germanic", Arrays.asList("English", "German", "Dutch", "Swedish", "Norwegian"));
		languageFamilies.put("Romance", Arrays.asList("Spanish", "Portuguese", "French", "Italian", "Romanian"));
        languageFamilies.put("Slavic", Arrays.asList("Russian", "Polish", "Czech", "Bulgarian"));
        languageFamilies.put("Sino-Tibetan", Arrays.asList("Mandarin", "Cantonese", "Burmese"));
        languageFamilies.put("Afro-Asiatic", Arrays.asList("Arabic", "Hebrew", "Amharic"));
        languageFamilies.put("Niger-Congo", Arrays.asList("Swahili", "Yoruba", "Zulu", "Shona"));
        
        // Step 1: Print families and their language
        System.out.println("🌍 Language Families and Their Language:\n");
        for (Map.Entry<String, List<String>> entry : languageFamilies.entrySet()) {
        	System.out.println(entry.getKey() + " Family:");
        	for (String language : entry.getValue()) {
        		System.out.println("  - " + language);
        	}
        	System.out.println();
        }
        
        // Step 3: Count how many languages per family
        System.out.println("🧾 Number of languages per Family:\n");
        for (Map.Entry<String, List<String>> entry: languageFamilies.entrySet()) {
        	System.out.println(entry.getKey() + ": " + entry.getValue().size() + " Language");
        }
        
        // Step 4: Find the family with the most languages
        String mostLanguagesFamily  = "";
        int maxLanguages = 0;
        
        for (Map.Entry<String, List<String>> entry : languageFamilies.entrySet()) {
        	if (entry.getValue().size() > maxLanguages) {
        		mostLanguagesFamily = entry.getKey();
        		maxLanguages = entry.getValue().size();
        	}
        }
        
        System.out.println("\n🏆 The family with the most languages is " + mostLanguagesFamily + " with " + maxLanguages + " languages.");
        
        // Step 5: Search for a language
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n🔍 Enetr a language to find its family:");
        String searchLang  = scanner.nextLine().trim();
        
        boolean found = false;
        for (Map.Entry<String, List<String>> entry : languageFamilies.entrySet()) {
        	if (entry.getValue().stream().anyMatch(lang -> lang.equalsIgnoreCase(searchLang))) {
        		System.out.println(searchLang + " belongs to the " + entry.getKey() + " family.");
        		found = true;
        		break;
        	}
        }
        
        if (!found) {
        	System.out.println(searchLang + " was not found in the database.");
        }
	}

}
