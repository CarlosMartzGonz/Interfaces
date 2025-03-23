package Ejercicio1;

public enum TypeWorker {
    GENERAL (50), ELECTRICIAN(200), PLUMBER(100), ADMINISTRATOR(150), IT_SPECIALIST(300);
    private int complement;

    TypeWorker(int complement) {
        this.complement = complement;
    }

    public int getComplement() {
        return complement;
    }
}
