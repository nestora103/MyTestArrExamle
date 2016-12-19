package com.gubenko.myArray;

/**
 * Created by Nestor on 28.09.2016.
 */
class Cat{
    private int catID;
    private String name;
    private int width;
    private int height;
    private int age;
    private String color;


    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Cat(int catID,String name,int width,int height,int age,String color) {
        this.catID = catID;
        this.name = name;
        this.width = width;
        this.height = height;
        this.age = age;
        this.color = color;

    }
}




public class TestArray {
    public static void main(String[] args) {
        //объявление массива
        Cat[] catsArr;
        //определение массива в 50 котов
        catsArr=new Cat[50];
        //инициализация массива собственными значениями
        String[] catNameArr={"Мурзик","Тузик","Пузатик"};


        //перебираем весь массив котов заполняя каждую его ячейку котом
        for (int i=0;i<catsArr.length;i++){
            catsArr[i]=new Cat(i,"Kitty",10,10,5,"White");
        }

        //перебираем весь массив и выводим в консоль котов
        for (int i=0;i<catsArr.length;i++){
            //конкотенация строк
            System.out.print("Кот №"+catsArr[i].getCatID()+" ");
            System.out.print("Зовут:"+catsArr[i].getName()+" ");
            System.out.print("Длинна:"+catsArr[i].getHeight()+" ");
            System.out.print("Ширина:"+catsArr[i].getWidth()+" ");
            System.out.print("Лет:"+catsArr[i].getAge()+" ");
            System.out.print("Цвет:"+catsArr[i].getColor()+" ");
            System.out.println(" ");
        }

        System.out.println("+++");
        //вывели имена котов из предопределенного массива
        for (int i=0;i<catNameArr.length;i++){
            System.out.println(catNameArr[i]);
        }

    }
}
