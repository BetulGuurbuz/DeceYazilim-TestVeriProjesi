import com.github.javafaker.Faker;

public class KartVerisi {

    public static void main(String[] args) {
        Faker faker = new Faker();
            String krediKartNo = faker.finance().creditCard();
            String ibanNo = faker.finance().iban();

            System.out.println("Kart Numarası: " + krediKartNo);
            System.out.println("Iban Numarası " + ibanNo);
    }
}