package com.ypren.demo;

/**
 * Test Java text block.
 * Which added since java 13.
 */
public class TextBlock {
    public static void main(String[] args) {
        System.out.println(getHtmlTextInJava8());
        System.out.println(getHtmlTextInJava17());
    }

    public static final String getHtmlTextInJava8() {
        return "<html>\n" +
                "  <body>\n" +
                "    <p>Hello, world</p>\n" +
                "  </body>\n" +
                "</html>";
    }

    public static final String getHtmlTextInJava17() {
        final String html = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
            """;
        return html;
    }
}
