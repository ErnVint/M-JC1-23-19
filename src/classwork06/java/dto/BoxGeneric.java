package dto;

import java.util.List;

public class BoxGeneric<T> {
    private T item;
    public T getItem(){
        return item;

    }
    public void setItem(T item){
        this.item = item;
    }

    public <X> X getValue(){
        return (X) item;
    }

}
