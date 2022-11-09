package MyGeneric;

/**
 *
 * @author Talitha Hayyinas
 */
class MyData<T> {
    private T Girl;

    protected void setGirl(T Girl){
        this.Girl = Girl;
    }

    protected T getGirl(){
        return Girl;
    }
}