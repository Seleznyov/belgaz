package belgaz.qa.model.Indicator1;

public class Signal2Indicotor1Data {
    private final String statusEGR;
    private final String note;

    public Signal2Indicotor1Data(String statusEGR, String note) {
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
