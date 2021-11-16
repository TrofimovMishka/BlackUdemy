package org.example.udemy.section3;

class Lesson_2 {   //        !!!!!!!!!!!!PARAMETRIZED CLASS!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        Info<String> inf = new Info<>("Hello");
        System.out.println(inf.toString());
        Info<Integer> inf1 = new Info<>(33);
        System.out.println(inf1.toString());

        Pair<String, Integer> pa1 = new Pair<>("hello", 33);
        Pair<Integer, String> pa2 = new Pair<>(33, "Bye");

        System.out.println(pa1.getValue1() + " " + pa1.getValue2());
        System.out.println(pa2.getValue1() + " " + pa2.getValue2());

    }


}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[;;" + value + ";;]}";
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class OterPair<V> {
    private V value1;
    private V value2;

    public OterPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}
    
