package likeinhaskell;

/**
 * Created by Niklas on 2016-02-07.
 */
// TODO task 1: Implement this class. It should act like a tuple in e.g.
//  Haskell or Python. An object of this type should hold two values of
//  (possibly) different (arbitrary) types, and have the methods fst()
//  and snd() to return the respective components.
//  NOTE: The class should be read-only after initial construction.
public class Tuple<T, U> {

    private final T fstItem;
    private final U sndItem;

    public Tuple(T fstItem, U sndItem) {
        this.fstItem = fstItem;
        this.sndItem = sndItem;
    }

     public T fst(){
        return this.fstItem;
     }

     public U snd(){
        return this.sndItem;
     }
}
