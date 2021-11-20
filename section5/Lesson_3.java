package org.example.udemy.section5;

class Lesson_3 {        //local inner nested class - example
    public static void main(String[] args) {
        SoeClass soeClass = new SoeClass();
//        soeClass.someMethod();
        soeClass.someMethod(21, 4);
    }

}

class SoeClass{
    public void someMethod(final int delimoe, final int delitel){
//        int delimoe = 21;  // effectively final - потому что переменная нигде не менялалсь,
                            // если ее поменять - то local inner nested class не будет иметь к ней доступа
         class Devision{
//            private int delimoe;
//            private int delitel;

//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

//            public int getDelimoe() {
//                return delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }

            public int getCHastnoe(){
                return delimoe/delitel;
            }
            public double getOstatoc(){
                return delimoe%delitel;
            }
        }

        Devision devision = new Devision();
//        devision.setDelimoe(21);
//        devision.setDelitel(4 );
        System.out.println("Delimoe = "+ delimoe);
//        System.out.println("Delitel = "+ devision.getDelitel());
        System.out.println("Delitel = "+ delitel);
        System.out.println("Chasnoe = "+ devision.getCHastnoe());
        System.out.println("Ostatoc = "+ devision.getOstatoc());
    };

}
