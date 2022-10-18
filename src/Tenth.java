public class Tenth {

        public static void main(String[] args) {
            String str = "Repeat this string";
            System.out.println(str.repeat(2));

            String complexWhitespacesString = "\u2005\u2005\u2005\u2005  This string is stripped. ";
            System.out.println(complexWhitespacesString.strip());

            System.out.println("\n\u2005   ".isBlank());

            String html =
                    "\t<html>\n"+
                            "\t\t<head>\n"+
                            "\t\t\t<body>\n"+
                            "\t\t\t\t<p>Html Text Executed Perfectly</p>\n"+
                            "\t\t\t</body>\n"+
                            "\t\t</head>\n"+
                            "\t<html>";


            System.out.println(html.stripIndent());


            System.out.println("\"I am \\n Shipra Sharma  \"");
            System.out.println("\"I am \\n shipra Sharma\"".translateEscapes());


            System.out.println("\n\u2005   ".isEmpty());

            System.out.println(String.format("Format %s","Executed"));
            System.out.println("Formatted %s".formatted("Executed"));

        }

    }
