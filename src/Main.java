public class Main {

    public static void main(String[] args) {
        //genellikle repository deseni veritabanı işlemleri için kullanılır(add update delete işlemleri)

        //generic metodu IEntity implement edilen class ile kullanmak için onu da çağırmamız gerek
        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}
