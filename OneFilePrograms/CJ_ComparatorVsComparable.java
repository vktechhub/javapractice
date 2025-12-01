import java.util.Comparator;

    // Comparable interface example
    class Student implements Comparable<Student> {
        String name;
        int age;

        public int getAge() {
            return age;
        }

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(this.getAge(), other.getAge()); // Natural ordering by age
        }
    }

    // Comparator interface example

    class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            //customer ordering by age
            return Integer.compare(s1.getAge(), s2.getAge());
        }
    }


    public class CJ_ComparatorVsComparable {
        public static void main(String[] args) {
            System.out.println(
                    "This class is intended to demonstrate the difference between Comparator and Comparable interfaces in Java.");

            Student student1 = new Student("Alice", 22);
            Student student2 = new Student("Bob", 20);
            Student student3 = new Student("Charlie", 22);
            System.out.println("Student 1: " + student1.name + ", Age: " + student1.age);
            System.out.println("Student 2: " + student2.name + ", Age: " + student2.age);
            System.out.println("Student 3: " + student3.name + ", Age: " + student3.age);
            // Using Comparable
            int S1comparetoS2 = student1.compareTo(student2);
            System.out.println("Age Difference (Comparable): " + S1comparetoS2);
            int S2comparetoS3 = student2.compareTo(student3);
            System.out.println("Age Difference (Comparable): " + S2comparetoS3);
            int S1comparetoS3 = student1.compareTo(student3);
            System.out.println("Age Difference (Comparable): " + S1comparetoS3);

            System.out.println("A negative integer if this is less than obj.\r\n" + //
                                "Zero if this is equal to obj.\r\n" + //
                                "A positive integer if this is greater than obj.");

            // Using Comparator
            StudentComparator ageComparator = new StudentComparator();
            int AgeDifference = ageComparator.compare(student1, student2);
            System.out.println("Age Difference (Comparator): " + AgeDifference);
            int AgeDifference2 = ageComparator.compare(student2, student3);
            System.out.println("Age Difference (Comparator): " + AgeDifference2);
            int AgeDifference3 = ageComparator.compare(student1, student3);
            System.out.println("Age Difference (Comparator): " + AgeDifference3);
        }

    }