package de.telran.d221025;

public class House implements Comparable<House> {

    private int price;
    private double square;
    private String postCode;
    private String adressName;
    int[] nums;

        @Override
    public int compareTo(House other) {
        return other.getPrice() - other.getPrice();
    }

    public House() {
    }

    public House(int price, double square, String postCode, String adressName) {
        this.price = price;
        this.square = square;
        this.postCode = postCode;
        this.adressName = adressName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAdress() {
        return adressName;
    }

    public void setAdressName(String adressName) {
        this.adressName = adressName;
    }

//    @Override
//    public int compareTo(House other) {
//        return other.getPrice() - other.getPrice();
//    }

//    @Override
//    public int compareTo(House other) {
//        double result = this.getPrice() * 1.0 / this.getSquare() - other.getPrice() * 1.0 / other.getSquare();
//        return (int) Math.round(result);
//    }

    public int compareTo(int[] nums) {
//        if(this.nums.length != nums.length) {
//            if(this.nums.length > nums.length) {
//                return  1;
//            } else {
//                return -1;
//            }
//        }else {
//            for (int i = 0; i < nums.length; i++) {
//                if (this.nums.length > nums[i]){
//                    return 1;
//                } else if (this.nums.length)
//            }
//        }

        int counter = 0;
        int thisCounter = 0;

        for (int i : nums) {
            counter += 1;
        }
        for (int i : this.nums) {
            thisCounter += 1;
        }

//        if (thisCounter > counter) {
//            return 1;
//        } else if (thisCounter < counter) {
//            return  -1;
//        } else {
//            return 0;
//        }

        return thisCounter - counter;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
//                ", square=" + square +
//                ", postCode='" + postCode + '\'' +
//                ", adressName='" + adressName + '\'' +
//                ", nums=" + Arrays.toString(nums) +
                '}';
    }
}
