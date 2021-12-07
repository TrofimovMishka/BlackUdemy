package org.example.udemy.section8;

class Lesson_11_7_printf_format {
    static void employeeInfo(Employe emp){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", emp.id, emp.name, emp.surname, emp.salary*(1+ emp.bonusPst));
        // %03d :  d- целые числа, 3 - это width, выделяем 3 символа для id, 0 - if id have 1 digital,
        // we will add 00 before(if id =12, result will be 012, if id =4 -> 004)
        // /t :   между значениями добавим таб
        // %-12s:  s-работаем со стрингом. 12 - выделяем 12 символов под него, - - выравниваем по левому краю
        // %,.1f : f- работаем с дробными десятичными, .1 - округляем до 1 знака после запятойб,   ,- запятая как разделитель разрядов в чис

    }
    public static void main(String[] args) {
//        System.out.printf("", "Hello", "3.14"); // в первом параметре даю команды как выводить его остальные параметры
        Employe employe1 = new Employe(12, "Kira", "Volkova", 1000, 0.15);
        Employe employe2 = new Employe(2, "Nika", "Gebler", 1500, 0.11);
        Employe employe3 = new Employe(533, "Ola", "Sukanova", 1200, 0.02);
        employeeInfo(employe1);
        employeeInfo(employe2);
        employeeInfo(employe3);

        String newString = String.format("%03d \t Hello %-12s \t %-12s \t %,.1f \n",
                employe1.id, employe1.name, employe1.surname, employe1.salary*(1+employe1.bonusPst));   // применили метод для
        //форматирования строки по указанному виду - "%03d \t %-12s \t %-12s \t %,.1f \n",
        System.out.println(newString);
    }
}

class Employe{
    int id;
    String name;
    String surname;
    int salary;
    double bonusPst;

    public Employe(int id, String name, String surname, int salary, double bonusPst) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPst = bonusPst;
    }
}
