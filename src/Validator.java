public class Validator {
    //generic metod'da <T> public'ten sonra yazılır
    //IEntity implement edilen bir class ile kullanmak için extends ekledik(generic kısıt)
    public<T extends IEntity> void validate(T entity){

    }
}
