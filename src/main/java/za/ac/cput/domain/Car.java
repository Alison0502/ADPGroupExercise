/*
 * Car.java
 * This is the POJO class Car
 * Ashton Williams - 220468478
 * 14 March 2023
 */
package za.ac.cput.domain;

import java.util.Objects;

    public class Car {

        public String carModel;
        public String engine;
        public int carYear;
        public double carPrice;

        public Car(String carModel, String engine, int carYear, double carPrice) {
            this.carModel = carModel;
            this.engine = engine;
            this.carYear = carYear;
            this.carPrice = carPrice;
        }

        public String getCarModel() {
            return carModel;
        }

        public String getEngine() {
            return engine;
        }

        public int getCarYear() {
            return carYear;
        }

        public double getCarPrice() {
            return carPrice;
        }

        public void setCarModel(String carModel) {
            this.carModel = carModel;
        }

        public void setEngine(String engine) {
            this.engine = engine;
        }

        public void setCarYear(int carYear) {
            this.carYear = carYear;
        }

        public void setCarPrice(double carPrice) {
            this.carPrice = carPrice;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return carYear == car.carYear &&
                    Double.compare(car.carPrice, carPrice) == 0 &&
                    Objects.equals(carModel, car.carModel) &&
                    Objects.equals(engine, car.engine);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "carModel='" + carModel + '\'' +
                    ", engine='" + engine + '\'' +
                    ", carYear=" + carYear +
                    ", carPrice=" + carPrice +
                    '}';
        }
    }

