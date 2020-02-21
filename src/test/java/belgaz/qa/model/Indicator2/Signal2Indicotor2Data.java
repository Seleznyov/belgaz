package belgaz.qa.model.Indicator2;

public class Signal2Indicotor2Data {
    private final String note;
    private final String dataCRP;
    private final String contract;
    private final String summOD;
    private final String maxsummOD;
    private final String overdue;
    private final String maxdelay;

    public Signal2Indicotor2Data(String note, String dataCRP, String contract, String summOD, String maxsummOD, String Overdue, String maxdelay) {
        this.note = note;
        this.dataCRP = dataCRP;
        this.contract = contract;
        this.summOD = summOD;
        this.maxsummOD = maxsummOD;
        this.overdue = Overdue;
        this.maxdelay = maxdelay;
    }

    public String getNote() {
        return note;
    }

    public String getDataCRP() {
        return dataCRP;
    }

    public String getContract() {
        return contract;
    }

    public String getSummOD() {
        return summOD;
    }

    public String getMaxsummOD() {
        return maxsummOD;
    }

    public String getOverdue() {
        return overdue;
    }

    public String getMaxdelay() { return maxdelay;
    }
}
