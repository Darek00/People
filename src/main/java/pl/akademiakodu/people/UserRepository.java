package pl.akademiakodu.people;

import org.springframework.data.repository.CrudRepository;

/*
     rozszerzanie interfejsów to ianczej dopisanie do interfejsu metod abstrakcyjnych

 */
public interface UserRepository extends CrudRepository<User, Integer> {
    /*
        W miejsce:
        S,T-> User
        ID->Integer
     */
    /*
    <S extends T> S save(S var1);
    <S extends T> Iterable<S> saveAll(Iterable<S> var1);
    Optional<T> findById(ID var1);
    boolean existsById(ID var1);
    Iterable<T> findAll();
     */
    // User save(User var1)
    // boolean existById(Integer var1)
}
