public class Car implements Comparable<Car> {
    String brand;
    String model;
    int year;
    int engineV;

    public Car(String brand, String model, int year, int engineV) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineV = engineV;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineV() {
        return engineV;
    }

    public void setEngineV(int engineV) {
        this.engineV = engineV;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineV=" + engineV +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        int result = this.brand.compareTo(car.brand);
        if (result == 0) {
            if (this.year == car.year) {
                if (this.engineV == car.engineV) {
                    return 0;
                }
                if (this.engineV < car.engineV) {
                    return -1;
                } else {
                    return 1;
                }
            }
            if (this.year < car.year) {
                return -1;
            } else {
                return 1;
            }
        }
        return result;
    }
}
