import java.util.*;
class ComplexNumbers {
   int my_real_number, my_imaginary_number;
   ComplexNumbers() {}
   ComplexNumbers(int my_real_temp, int my_imaginary_temp){
      my_real_number = my_real_temp;
      my_imaginary_number = my_imaginary_temp;
   }
   ComplexNumbers AddComplexNumbers(ComplexNumbers my_input_1, ComplexNumbers my_input_2){
      ComplexNumbers my_temp = new ComplexNumbers();
      my_temp.my_real_number = my_input_1.my_real_number + my_input_2.my_real_number;
      my_temp.my_imaginary_number = my_input_1.my_imaginary_number +    my_input_2.my_imaginary_number;
      return my_temp;
   }
}
public class MainFunction {
   public static void main(String[] args){
      System.out.println("Required packages have been imported");
      ComplexNumbers my_input_1 = new ComplexNumbers(15, 24);
      System.out.println("The first complex number is defined as : " + my_input_1.my_real_number + " + i" + my_input_1.my_imaginary_number);
      ComplexNumbers my_input_2 = new ComplexNumbers(3, 7);
      System.out.println("The second complex number is defined as : " + my_input_2.my_real_number + " + i" + my_input_2.my_imaginary_number);
      ComplexNumbers my_result = new ComplexNumbers();
      my_result = my_result.AddComplexNumbers(my_input_1, my_input_2);
      System.out.println("The sum of complex number is : " + my_result.my_real_number + " + i"  + my_result.my_imaginary_number);
   }
}