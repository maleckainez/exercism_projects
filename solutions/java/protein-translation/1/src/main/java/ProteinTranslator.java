import java.util.List;
import java.util.ArrayList;
import java.util.Map;
class ProteinTranslator {
    private static final Map<String, String> codonsMap = Map.ofEntries(
        Map.entry("AUG", "Methionine"),
        Map.entry("UUU", "Phenylalanine"),
        Map.entry("UUC", "Phenylalanine"),
        Map.entry("UUA", "Leucine"),
        Map.entry("UUG", "Leucine"),
        Map.entry("UCU", "Serine"),
        Map.entry("UCC", "Serine"),
        Map.entry("UCA", "Serine"),
        Map.entry("UCG", "Serine"),
        Map.entry("UAU", "Tyrosine"),
        Map.entry("UAC", "Tyrosine"),
        Map.entry("UGU", "Cysteine"),
        Map.entry("UGC", "Cysteine"),
        Map.entry("UGG", "Tryptophan"),
        Map.entry("UAA", "STOP"),
        Map.entry("UAG", "STOP"),
        Map.entry("UGA", "STOP")
    );
    
    List<String> translate(String rna) {
        List<String> proteins = new ArrayList<>();
        for(int i=0; i<rna.length(); i+=3){
            if(rna.length()<i+3){break;}
            if(rna.length()%3!=0 && !(rna.contains("UAA")) && !(rna.contains("UAG")) && !(rna.contains("UGA"))){throw new IllegalArgumentException("Invalid codon");}
            String codon = rna.substring(i, i + 3);
            if (!(codonsMap.containsKey(codon))){throw new IllegalArgumentException("Invalid codon");}
            String protein = codonsMap.get(codon);
            if (protein == null) continue;
            if (protein.equals("STOP")) break;
            proteins.add(protein);
        }
        return proteins;
    }
}
