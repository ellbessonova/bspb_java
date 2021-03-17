package Lesson_6;

public class Individual extends Client {

        private String gender;

    public Individual(String name, String gender, int age) {
            super(name, age);
            this.gender = gender;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Clients{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age + '\'' +
                    '}';
        }
    }
