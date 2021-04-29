public interface IEntityRepository<T extends IEntity> {
    //buraya sadece veritabanı nesnelerinin bulunduğu classlar gelmesini sağladık
    //çünkü kullanıcı yanlışlıkla başka bir class'ı generic olarak verirse hata almayabilir
    void add(T entity);

    void delete(T entity);

    void update(T entity);
    //burada genericleri veritabanı ile alakalı işlemleri tutan interface için kullandık
}
