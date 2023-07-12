public class StringEqual {
    public static void main(String[] args) {
        String name1, name2;
        name1 = "God";
        name2 = name1;
        if (name1 == name2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

//Output: Equal

public class thisSample {
    public static void main(String[] args) {
        Square square = new Square();
        square.display(5);
        int area = square.calculateArea();
        System.out.println("The area of the Square is : " + area);
    }
}

class Square {
    int length;
    void display (int length){
        this.length = length;
    }
    int calculateArea() {
        return (length*length);
    }
}

//Output: The area of the Square is : 25
