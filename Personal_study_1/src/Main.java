public class Main {
    public static void main(String[] args) {
        // non-primitive data type include: String, arrays and classes.
        // primitive data types includes: char,int,byte,short,long,float,double and boolean
        int number1 = 100;
        //float has a precision of 6 to 7 digits
        float number2 = 5.66f;
        //double has a precision of 6 to 7 digits
        double number3 = 3.1242d;
        //Scientific number
        double sci_number = 2e2d;
        System.out.println(sci_number);
        //boolean
        boolean is_Fair = true;
        System.out.println(is_Fair);
        // character: note single quote used
        char my_Grade = 'A';
        //Using the ASCII value
        char csc_303 = 65;
        System.out.println(csc_303);
        //Strings
        String greeting = "Good day";
        /* non-primitive:
            1. Non-primitive types ae created by the programmer and is not defined by Java (except string)
            2. Non-primitive types can be used to call methods to perform certain operations
            3. Non-primitive type can be null
            4. Non-primitive types start with an uppercase letter

            TYPE CASTING:TYPE CASTING is when you assign a value of one primitive data type to another type.
                1. Widening casting (automatically): Converting a smaller type to a larger type size.
                   i.e byte->short-> char->int->long->float->double.
                   It's done automatically when passing a smaller size type to a laeger size type
                2. Narrowing casting (manually): Converting a larger type to a smaller size type
                   i.e double->float->long->int->char->short->byte.
                   It's done by manually done by placing the type in parentheses () in front of the value
         */

        // Widening casting:
        short grade = 90;
        long grade1 = grade;
        float grade2 = grade;
        System.out.println("Widening casting:");
        System.out.println(grade);
        System.out.println(grade1);
        System.out.println(grade2);

        // Narrowing casting:
        double score = 90.59;
        float score1 = (float) score;
        int score2 = (int) score;
        System.out.println("Narrowing casting:");
        System.out.println(score);
        System.out.println(score1);
        System.out.println(score2);

        // Java operators
        int x = 2;
        x += 2;
        System.out.println(x);

        //Some string methods: length(), toUpperCase(), toLowerCase(), indexOf(),

        String first_Name = "Chimbueze";
        int fn_length = first_Name.length();
        System.out.println(fn_length);

        String other_Name = "David";
        String on_upper = other_Name.toUpperCase();
        System.out.println(on_upper);

        String last_Name = "Okoroji";
        String ln_lower = last_Name.toLowerCase();
        System.out.println(ln_lower);

        String full_Name = "Chimbueze David Okoroji";
        System.out.println(full_Name.indexOf("Okoroji"));
        System.out.println(full_Name + " " + "is a lover of the work\'s of God");

        // Concatenation
        String course = "CSC ";
        int code = 303;
        System.out.println(course + code);

        String course1 = "CSC ";
        String code1 = "307";
        System.out.println(course1.concat(code1));

        // Boolean
        boolean is_black = true;
        boolean is_fair = false;

        // Math functions
        int root = 64;
        int root_1 = 120;
        int t_root=Math.max(root, root_1);
        int root_2 = 110;
        System.out.println(Math.sqrt(root));
        System.out.println(Math.max(t_root,root_2));
        System.out.println(Math.min(root, root_1));
        System.out.println(Math.abs(-14));

        // Switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Write a Java program that takes voters input to determine the eligibility of a voter using age(>17) and nationality("Nigeria")

        int amount= 300;
        if(amount>=200 && amount<=300){
            System.out.println("You are eligible");
        }
        else if(amount>=100 && amount<=199){
            System.out.println("Try again, almost eligible");
        }
        else{
            System.out.println("Your fully ineligible");
        }

        int i=1; //variable
        while (i<=10){ //while loop block
            System.out.println(i);//output
            i++; //increment
        }

        int a=3;
        do{
            System.out.println("Excellent is your Name, ");
            ++a;
        } while(a<=9);


        for (int b=3; b<=9;++b){
            System.out.println("LORD you are Wonderful, my God you are Excellent");
        }

        String[] cars= {"Volvo", "BMW", "Benz", "Ford", "Lamborghini"};
        System.out.println(cars [1]);
        for (String car: cars){
            System.out.println(car);
        }

    }
}