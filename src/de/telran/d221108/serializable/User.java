package de.telran.d221108.serializable;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;

public class User implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //создаем наш объект
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Smith");
        user.setEmail("jsmith@mail.com");
        user.setBirthDate(LocalDate.of(1991, 7, 16));
        user.setLogin("ssmith");
        user.setPassword("password12");

        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        user.setList(list);


        System.out.println("initial user: " + user + "\r\n");
        serialize(user);


        User loadedUser = deserialize();
        System.out.println("loaded user:  " + loadedUser + "\r\n");

        list = loadedUser.getList();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;

    private LinkedList<String> list = new LinkedList<>();
    transient private String login;
    transient private String password;

    public User() {
    }

    public User(String firstName, String lastName, String email, LocalDate birthDate, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.login = login;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LinkedList<String> getList() {
        return list;
    }

    public void setList(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                ", list=" + list +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void serialize(User user) throws IOException {
        String path = "./output.txt";
        FileOutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            //создаем 2 потока для сериализации объекта и сохранения его в файл
            outputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(outputStream);

            // сохраняем объект в файл
            objectOutputStream.writeObject(user);
        } finally {
            // Закроем потоки в блоке finally
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    static User deserialize() throws IOException, ClassNotFoundException {
        String path = "./output.txt";
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            //создаем 2 потока для десериализации объекта из файла
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            //загружаем объект из файла
            return  (User) objectInputStream.readObject();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
        }
    }
}
