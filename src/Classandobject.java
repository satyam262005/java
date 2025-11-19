
    class Studentname {
        String name;

        void display() {
            System.out.println("shruti");

        }
    }



    class Studentrollnumber {
        String name;

        void display() {
            System.out.println("313");

        }
    }
    class Studentmarks{
        String name;

        void display() {
            System.out.println("9");

        }
    }

    class Classandobject{
        public static void main(String[] args) {
            Studentname obj = new Studentname();
            obj.display();

            Studentrollnumber obj1 = new Studentrollnumber();
            obj1.display();

            Studentmarks obj2 = new Studentmarks();
            obj2.display();

        }
        }