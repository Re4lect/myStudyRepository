public enum DeliverTypes {
    AERO("Авиа доставка, стоит 500р."),
    STEP("Пешая доставка, стоит 100р."),
    AUTO("Авто доставка, стоит 200р.");
    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
