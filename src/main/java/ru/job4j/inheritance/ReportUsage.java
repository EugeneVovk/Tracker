package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        TextReport report2 = new HtmlReport();
        System.out.println(report2.generate("Report's name", "Report's body"));

        TextReport report3 = new JSONReport();
        System.out.println(report3.generate("Report's name", "Report's body"));
    }
}
