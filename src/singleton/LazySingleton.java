package singleton;

/***
 * Lazy load singleton multithread ortamlarda sorunlara yol açar.
 * Çünkü aynı anda bir kaç thread aynı anda null kontrolü yaparsa birden fazla singleton objesi oluşur
 * Bu durumda mutex lock konulur(synchronized). bu da maliyetli bir yapıdır. Çünkü gereksiz context switch yapılır.
 * synchronize şekilde yapılacak null kontrolü bize sadece obje yaratılana kadar lazımdır. Bu yüzden ikinci bir null
 * kontrolü eklenir. Synchronize null kontrolü sadece obje yaratılana kadar çalışır.
 * Double check locking problemli java 5 de fix ediliyor ama volatile ile kullanılması öneriliyor
 */

/***
 * Constructorlar private olsa bile refelection ile hala private constructionları çağırıp yeni obje oluşturabilirsiniz.
 * bu çözüm hala seriliziation ve reflection ile kırılabilir.
 */
public class LazySingleton {
    private static volatile LazySingleton val;
    private static int count = 0;
    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (val == null){
            synchronized (LazySingleton.class) {
                if (val == null) {
                    val = new LazySingleton();
                }
            }
        }
        count++;
        return val;

    }

    public static int getCount(){
        return count;
    }
}
