package Task2;

    public class Cat extends Animal{

        public Cat(String name) {

            super.name = name;
            super.type =type;

        }

        @Override
        public String getType() {
            return "Cat";
        }

        public void start() {
            System.out.println(getType() + " start! ");
        }

        public void stop() {
            System.out.println(getType() + " stop! ");
        }
    }