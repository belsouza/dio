package novidadesOnze;

import java.util.stream.Collectors;

public class StringLinesExample {
    public static void main(String[] args) {
        String html = "<!DOCTYPE html><head><title>Foo</title></head><body><div>Foo</div></body></html>";
       // System.out.println(html.replaceAll("><", ">\n<"));
       // System.out.println(html.replaceAll("><", ">\n<").lines().filter(s -> s.contains("head")).collect(Collectors.joining()));
        System.out.println(html.replaceAll("><", ">\n<").lines().map(s -> "[TAG] ::" + s ).collect(Collectors.joining()));
    }
}
