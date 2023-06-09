package ru.netology.javaqa;


public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Анна";
        post.passport = "7895 №999999";
        post.patronymic = "Игоревна";
        post.phone = "+7(666)6666666";
        post.surname = "Борзенкова";
        post.subscription = true;
        post.birthday.day = 14;
        post.birthday.month = 12;
        post.birthday.year = 1991;




        System.out.print(post);

               }
    }
