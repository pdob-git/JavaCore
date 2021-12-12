public class Pair<T,S> {
    private T t;
    private S s;

    public Pair(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "<" + t + " ; " + s + ">";
    }
}
