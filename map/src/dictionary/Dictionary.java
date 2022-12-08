package dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Dictionary {
	private String url;
	private TreeMap<String, String> vocabulary;

	public Dictionary(String url) {
		super();
		this.url = url;
		this.vocabulary = createDictionary(url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public TreeMap<String, String> getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(TreeMap<String, String> vocabulary) {
		this.vocabulary = vocabulary;
	}

	public static void main(String[] args) {
		Dictionary dic = new Dictionary("src\\dictionary\\vocabulary.txt");
		System.out.println(dic.searchVie("Apple"));
		System.out.println(dic.searchEng("Ca Rot"));
		System.out.println(dic.getVocabulary().keySet());
		System.out.println(dic.getVocabulary().values());
		Object[] arrayEng = dic.getVocabulary().keySet().toArray();
		Object[] arrayVie = dic.getVocabulary().values().toArray();
//		System.out.println(arrayEng[1]);
		System.out.println(arrayVie[0].toString().length());
		System.out.println(arrayVie[0].toString().trim().equalsIgnoreCase("Tao"));

		System.out.println(dic.searchVie("Carrot"));
		System.out.println(dic.searchEng("Tao"));
		System.out.println(Arrays.toString(FileUtils.readFile("src\\dictionary\\vocabulary.txt").toArray()));
	}

	public TreeMap<String, String> createDictionary(String url) {
		ArrayList<String> lines = FileUtils.readFile(url);
		TreeMap<String, String> result = new TreeMap<>();
		for (String line : lines) {
			StringTokenizer tokens = new StringTokenizer(line, "\t");
			int col = 0;
			String key = "";
			String value = "";
			while (tokens.hasMoreElements()) { // chay tren 1 dong
				switch (col) {
				case 0: {
					key = tokens.nextToken();
					col = 1;
					break;
				}
				case 1: {
					value = tokens.nextToken();
					break;
				}
				}
			}
			result.put(key, value);
		}
		return result;
	}

	public void updateMeaning(String vocab, String mean) {
		if (this.vocabulary.get(vocab) != null) {
			this.vocabulary.put(vocab, mean);
		} else {
			throw new RuntimeException("Can't find a vocab in list");
		}
	}

	public String searchVie(String eng) {
		if (this.vocabulary.get(eng) != null) {
			return this.vocabulary.get(eng);
		} else {
			throw new RuntimeException("Can't find mean of vocab in list");
		}
	}

	public String searchEng(String vie) {
		Object[] arrayEng = this.vocabulary.keySet().toArray();
		Object[] arrayVie = this.vocabulary.values().toArray();
		for (int i = 0; i < arrayVie.length; i++) {
			if (arrayVie[i].toString().trim().equalsIgnoreCase(vie)) {
				return arrayEng[i].toString();
			}
		}
		return null;
	}
}
