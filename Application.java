package com;

public class Application {
    public static void main(String[] args) {
        Box firstBox = new Box();
        Box secondBox = new Box();

        firstBox.setContent(new Journal(60, "Ogonek", "Entertainment"));
        //firstBox.setContent(new Book(200, "1984yuiyuiyuiyi", "Orwell", 1948));
        secondBox.setContent(new Book(200, "1984", "Orwell", 1948));



        System.out.println(firstBox.getContent().toString());
        System.out.println(secondBox.getContent().toString());
    }
    //можно иметь одну и ту же книгу в разных коробках
    //нет , не изменится
}
