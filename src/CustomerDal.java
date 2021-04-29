public class CustomerDal implements IEntityRepository<Customer>{
    //burada <Customer> olarak generic tipimizi belirttik
    //oraya sadece doğru veritabanı nesnesini göndermek gerekir(generic contraints = generik kısıt)
    @Override
    public void add(Customer entity) {

    }

    @Override
    public void delete(Customer entity) {

    }

    @Override
    public void update(Customer entity) {

    }
}
