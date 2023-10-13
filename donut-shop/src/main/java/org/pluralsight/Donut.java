package org.pluralsight;

class Donut {
        String type;
        int calories;
        double price;
        String description;

        Donut(){
            type= "Jelly";
            calories= 170;
            price= 3.00;
            description="A delicious raspberry-filled donut";
        }
        Donut(String type, int calories, double price, String description) {
            this.type = type;
            this.calories = calories;
            this.price = price;
            this.description = description;
        }
        @Override
        public String toString() {
            return "Donut{" +
                    "type='" + type + '\'' +
                    ", calories=" + calories +
                    ", price=" + price +
                    ", description='" + description + '\'' +
                    '}';
        }
    }


