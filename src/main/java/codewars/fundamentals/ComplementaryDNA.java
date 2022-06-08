package codewars.fundamentals;

public class ComplementaryDNA {
/*
    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and
    carries the "instructions" for the development and functioning of living
    organisms. In DNA strings, symbols "A" and "T" are complements of each other,
    as "C" and "G". You function receives one side of the DNA (string); you need
    to return the other complementary side. DNA strand is never empty or there
    is no DNA at all.
    Example: (input --> output)
        "ATTGC" --> "TAACG"
        "GTAT" --> "CATA"
 */

    public static String makeComplement(String dna) {
        dna = dna.replace('T', 'a');
        dna = dna.replace('A', 'T');
        dna = dna.replace('a', 'A');
        dna = dna.replace('C', 'g');
        dna = dna.replace('G', 'C');
        dna = dna.replace('g', 'G');
        return dna;
    }
}
