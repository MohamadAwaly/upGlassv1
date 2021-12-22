package be.atc.upglass.enums;

public enum ModeOfPayementEnum {

    Domicile("CASH");

    private String text;

    private ModeOfPayementEnum( String text ) {
        this.text = text;
    }

    public String display() {
        return text;
    }
}
