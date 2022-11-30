package ch7.parse;

public class ParseTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("html");
    }
}
