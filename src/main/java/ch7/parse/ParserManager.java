package ch7.parse;

public class ParserManager {
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();
        }
        else{
            Parseable p = new HTMLParse();
            return p;
        }
    }
}
