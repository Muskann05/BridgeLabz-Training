public class StringConcatComparison {
    public static void main(String[] args) {
        int n = 1_000_000;
        String text = "hello";
        // StringBuffer test
        long startBuffer = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;
        // StringBuilder test
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append(text);
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;
        // Output results
        System.out.println("Time taken by StringBuffer  : " + bufferTime + " ns");
        System.out.println("Time taken by StringBuilder : " + builderTime + " ns");
    }
}
