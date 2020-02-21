package belgaz.qa.model.Indicator2;

public class Signal1Indicotor2Data {
    private final String note;
    private final String dataCRP;
    private final String contract;
    private final String summ;

    public Signal1Indicotor2Data(String note, String dataCRP, String contract, String summ) {
        this.note = note;
        this.dataCRP = dataCRP;
        this.contract = contract;
        this.summ = summ;
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

    public String getSumm() {
        return summ;
    }
}
