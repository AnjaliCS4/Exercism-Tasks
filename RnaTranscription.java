public class RnaTranscription
{
    String transcribe(String dnaStrand)
    {
        StringBuilder result = new StringBuilder();
        for(char c : dnaStrand.toCharArray())
        {
            switch(c)
            {
                case 'G': result.append('C');
                    break;
                case 'C' : result.append('G');
                    break;
                case 'T' : result.append('A');
                    break;
                case 'A' : result.append('U');
                    break;
                default : break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RnaTranscription rna = new RnaTranscription();
        System.out.println(rna.transcribe("GCTA"));
    }
}
