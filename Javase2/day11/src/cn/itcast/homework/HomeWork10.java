package cn.itcast.homework;

import java.io.*;
import java.util.Objects;

public class HomeWork10 {

    public static void main(String[] args) throws Exception {

        writeObject();

        readObject();


    }

    private static void writeObject() throws Exception {

        User user = new User();
        user.setId(1);
        user.setName("zs");
        user.setAddress("西安");
        User.setTest("test");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
        oos.writeObject(user);
    }

    private static void readObject() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
        User user = (User) ois.readObject();
        System.out.println(user);
    }

    static class User implements Serializable {

        private static final long serialVersionUID = 42L;
        private static String test;
        private Integer id;
        private String name;
        private String address;

        public User() {
        }

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public static String getTest() {
            return test;
        }

        public static void setTest(String test) {
            User.test = test;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", test='" + test + '\'' +
                    '}';
        }

        public User(Integer id, String name, String address, String test) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.test = test;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(address, user.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, address);
        }
    }


}
