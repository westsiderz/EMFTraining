package javaHelpers;

import java.util.ArrayList;
import java.util.HashMap;

public class Helper {
	/**
	 * Adds a translation string to the map for the given language. 
	 * Checks if the translationId exists and if not, creates a new pair.
	 * If the language doesn't exist, creates a new translation table
	 * @param language: The language for which we add the translation
	 * @param translationId: The translation ID
	 * @param translation: The translation value
	 */
	public static void AddTranslation(String language, String translationId, String translation) {
		if(mTranslations.containsKey(language) == true) {
			HashMap<String, String> translationTable = mTranslations.get(language);
			if(translationTable.containsKey(translationId) == false) {
				translationTable.put(translationId, translation);
			}
		}
		else {
			HashMap<String, String> translationTable = new HashMap<String, String>();
			translationTable.put(translationId, translation);
			mTranslations.put(language, translationTable);
		}
	}
	
	/**
	 * Gets the translation table for the given language if it exists.
	 * Fills any missing translations. Returns all the translations
	 * as a list of strings.
	 * @param language: The language to get the translations for.
	 * @param mainLanguage: The main language to check for missing translations from.
	 * @return: List with translations for the given language.
	 */
	public static ArrayList<String> GetTranslationsForGivenLanguage(String language, String mainLanguage) {
		ArrayList<String> result = new ArrayList<String>();
		
		if(mTranslations.containsKey(language)) {
			if(language.equals(mainLanguage) == false) {
				FillMissingTranslations(mTranslations.get(language), mTranslations.get(mainLanguage));
			}
			
			HashMap<String, String> translationTable = mTranslations.get(language);
			for(String key : translationTable.keySet()) {
				result.add(String.format("{ \"%s\", \"%s\"}", key, translationTable.get(key)));
			}
			
		}
		return result;
	}
	
	/**
	 * Checks if a translation string in the main language is missing in the other
	 * languages and if so, adds it's value there. This will make sure that no
	 * translations strings are missing. Make sure that the main language has been 
	 * processed first.
	 * @param languageTranslations: The translations for the currently processed language
	 * @param mainLanguageTranslations: The translations for the main language
	 */
	private static void FillMissingTranslations(HashMap<String, String> languageTranslations, HashMap<String, String> mainLanguageTranslations) {
		for(String key : mainLanguageTranslations.keySet()) {
			if(languageTranslations.containsKey(key) == false) {
				languageTranslations.put(key, mainLanguageTranslations.get(key));
			}
		}
	}
	
	private static HashMap<String, HashMap<String, String>> mTranslations = new HashMap<String, HashMap<String, String>>();
}
