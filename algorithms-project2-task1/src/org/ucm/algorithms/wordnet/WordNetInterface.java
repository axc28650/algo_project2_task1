package org.ucm.algorithms.wordnet;

public interface WordNetInterface {
	// returns all WordNet nouns
	public Iterable<String> nouns();

	// is the word a WordNet noun?
	public boolean isNoun(String word);

	// distance between nounA and nounB (defined below)
	public int distance(String nounA, String nounB);

	// a synset (second field of synsets.txt) that is the common ancestor of
	// nounA and nounB in a shortest ancestral path (defined below)
	public String sap(String nounA, String nounB);
}
