package belgaz.qa.model;

public class Signal4Indicotor1Data {
    private final String statusEGR;
    private final String note;

    public Signal4Indicotor1Data(String statusEGR, String note) {
        this.statusEGR = statusEGR;
        this.note = note;
    }

    public String getStatusEGR() {
        return statusEGR;
    }

    public String getNote() {
        return note;
    }
}
