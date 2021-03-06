package dao.interfaces;

import java.util.List;

// generic interface
public interface MainDAO<T> {
    List<T> getAll();
    T getById(int id);
    void save(T t);
    void update(T t);
    void delete(int id);
}
