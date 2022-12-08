package concordance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Concordance {
	private String url;
	private ArrayList<String> lines;

	public Concordance() {
		super();
	}

	public Concordance(String url) {
		this.url = url;
		this.lines = FileUtils.readFile(url);
	}

	public static void main(String[] args) {
		Concordance cor = new Concordance();
		System.out.println(cor.countWords("We learn Data Structure"));

		Concordance corFile = new Concordance("src\\concordance\\emcuangayhomqua.txt");
		System.out.println(corFile.getLines());
		System.out.println(corFile.countWords());
		System.out.println(corFile.runConcordanceLine(corFile.getLines().toString()));
		System.out.println(corFile.runConcordanceFile());
//		System.out.println(FileUtils.readFile("src\\concordance\\emcuangayhomqua.txt"));
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ArrayList<String> getLines() {
		return lines;
	}

	public void setLines(ArrayList<String> lines) {
		this.lines = lines;
	}

	public int countWords(String lines) {
		StringTokenizer tokens = new StringTokenizer(lines, ",.:'?()[]{} /><!");// Working as iterator
		int result = 0;
		while (tokens.hasMoreTokens()) {
			tokens.nextToken();
			result++;
		}
		return result;
	}

	public int countWords() {
		int result = 0;
		for (String line : lines) {
			result += this.countWords(line);
		}
		return result;
	}

	public HashMap<String, Integer> runConcordanceLine(String line) {
		HashMap<String, Integer> result = new HashMap<>();
		StringTokenizer tokens = new StringTokenizer(line, ",.:'?()[]{} /><!");
		while (tokens.hasMoreTokens()) {
			String word = tokens.nextToken();
			if (result.containsKey(word) == true) {
				result.put(word, result.get(word) + 1);
			} else {
				result.put(word, 1);
			}
		}
		return result;
	}

	public HashMap<String, Integer> runConcordanceFile() {
//		HashMap<String, Integer> result = new HashMap<>();
//		for (String line : lines) {
//			result.putAll(runConcordanceLine(line));
//		}
//		return result;
		return runConcordanceLine(lines.toString());

	}
}
