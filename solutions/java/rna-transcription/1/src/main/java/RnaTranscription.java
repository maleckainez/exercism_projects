class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for(char nucleotide: dnaStrand.toCharArray()){
            switch (nucleotide){
                case 'G':
                    sb.append("C");
                    break;
                case 'C':
                    sb.append("G");
                    break;
                case 'T':
                    sb.append("A");
                    break;
                case 'A':
                    sb.append("U");
                    break;
                default:
                    sb.append(" ");
                    break;
            }
            }
        return sb.toString();
        }
    }