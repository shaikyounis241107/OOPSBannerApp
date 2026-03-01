feature/UC3-stringjoin
public class stringjoin{

    public static void main(String[] args) {
        renderBanner();
    }

    public static void renderBanner() {

        String line1 = String.join(" ", "*****",   "*****",  "****",  "*****");

        String line2 = String.join(" ", "*   *",   "*   *",  "*  *",  "*    ");

        String line3 = String.join(" ", "*   *",   "*   *",  "****",  "*****");

        String line4 = String.join(" ", "*   *",   "*   *",  "*   ",  "    *");

        String line5 = String.join(" ", "*****",   "*****",  "*   ",  "*****");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);

   feature/UC5-InclineArray
   public class OOPSArrayInit {

    public static void main(String[] args) {

        // Declare and initialize array inline using String.join()
        String[] lines = {
            String.join(" ", " *** ", " *** ", " *****", " *****"),
			
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
			
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
			
            String.join(" ", "*   *", "*   *", "***** ", "***** "),
			
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
			
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
			
            String.join(" ", " *** ", " *** ", "*     ", "***** ")
        };

        // Loop to print banner
        for (String line : lines) {
            System.out.println(line);

    public class OOPSstatic {

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

       feature/UC6-Methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS (O O P S)
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );

        // Store all banner lines inside an array
        String[] banner = {

                String.join(" ",
                        "  ***  ",
                        "  ***  ",
                        "  ** ",
                        "  ***  "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *       "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " **  ",
                        "  ***  "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        "       * "),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *       ",
                        " *     * "),

                String.join(" ",
                        "  ***  ",
                        "  ***  ",
                        " *       ",
                        "  ***  ")
        };

        // Use loop instead of multiple print statements
        for (String line : banner) {
            System.out.println(line);
        main main
        }
 main
    }
}
