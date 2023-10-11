package manager;

import java.util.ArrayList;

public interface IManagerProduct <E>{
    void add(E e);
    void update(int producCode,E e);
    void remove (int productCode);
    ArrayList<E> findAll();
    int findByid(int productCode);

}
