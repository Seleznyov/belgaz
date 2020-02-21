package belgaz.qa.model.Indicator2;

public class Signal3Indicotor2Data {
    private final String note;
    private final String dataCRP;
    private final String summOD;
    private final String maxsummOD;
    private final String contract;
    private final String summ;
    private final String maxdelay;

    public Signal3Indicotor2Data(String note, String dataCRP, String summOD, String maxsummOD, String contract, String summ, String maxdelay) {
        this.note = note;
        this.dataCRP = dataCRP;
        this.summOD = summOD;
        this.maxsummOD = maxsummOD;
        this.contract = contract;
        this.summ = summ;
        this.maxdelay = maxdelay;
    }

    public String getNote() {
        return note;
    }

    public String getDataCRP() {
        return dataCRP;
    }

    public String getSummOD() {
        return summOD;
    }

    public String getMaxsummOD() {
        return maxsummOD;
    }

    public String getContract() {
        return contract;
    }

    public String getSumm() {
        return summ;
    }

    public String getMaxdelay() {
        return maxdelay;
    }
}
