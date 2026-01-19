package domain;

public class Car {
    private final int power;
    private final String model;
    private final int year;

    private Car(Builder builder) {
        this.power = builder.power;
        this.model = builder.model;
        this.year = builder.year;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Машина: " +
                "Мощность =" + power +
                ", модель='" + model + '\'' +
                ", год выпуска=" + year +
                '.';
    }



    static class Builder{
        private int power;
        private String model;
        private int year;

        // типо model обязателен, поэтому пихаем в конструктор
        Builder(String model){
            this.model = model;
        }

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

    }
}
