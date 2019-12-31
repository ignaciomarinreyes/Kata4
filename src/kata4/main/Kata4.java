package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    private final String fileName;
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;

    public Kata4(String fileName) {
        this.fileName = fileName;
    }

    public static void main(String[] args) {
        Kata4 kata4 = new Kata4("email");
        kata4.execute();
    }

    public void execute() {
        input();
        process();
        output();
    }

    public void input() {
        mailList = MailListReader.read(fileName);
    }

    public void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    public void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
