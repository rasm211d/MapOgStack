public class Customer {
    private int id;
    private String navn;

    public Customer(int id, String navn) {
        this.id = id;
        this.navn = navn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }
}
