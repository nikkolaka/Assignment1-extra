import org.w3c.dom.Node;

public class MTFList <Type extends Comparable<Type>>{
    private MyLinkedList<Type> list = new MyLinkedList<>();

    public void add(Type item){
        list.first();
        list.addBefore(item);
    }
    public Type remove(Type item){
        list.first();
        for(list.first(); list.current() != null; list.next()){

            if(list.current().compareTo(item) == 0){
                return list.remove();
            }
        }
        return null;
    }

    public Type find(Type item){
        list.first();
        for(list.first(); list.current() != null; list.next()){

            if(list.current().compareTo(item) == 0){
                Type temp = list.current();
                list.first();
                list.addBefore(temp);
                return list.first();
            }
        }
        return null;
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public String toString(){
        return list.toString();
    }
}
