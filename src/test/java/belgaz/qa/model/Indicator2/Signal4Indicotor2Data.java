package belgaz.qa.model.Indicator2;

public class Signal4Indicotor2Data {
    private final String note;
    private final String contract;
    private final String dataCRP;
    private final String summOD;
    private final String summ;

    public Signal4Indicotor2Data(String note, String contract, String dataCRP, String summOD, String summ) {
        this.note = note;
        this.contract = contract;
        this.dataCRP = dataCRP;
        this.summOD = summOD;
        this.summ = summ;
    }

    public String getNote() {
        return note;
    }

    public String getContract() {
        return contract;
    }

    public String getDataCRP() {
        return dataCRP;
    }

    public String getSummOD() {
        return summOD;
    }

    public String getSumm() {
        return summ;
    }
}
