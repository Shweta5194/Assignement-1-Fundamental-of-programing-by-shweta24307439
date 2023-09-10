import java.util.Scanner;

class Assessment
{
    public static void main(String [] args){
        // F1  allows the user to input the assessment name
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Assessment Name; ");
        String assessmentName = input.nextLine();
        // F2
        double[] marks = new double[3];
        for (int i = 0 ; i<marks.length;i++){
            double mark;
            do{
                System.out.print("Enter the mark: ");
                mark = input.nextDouble();
                if (mark <0 || mark >30){
                    System.out.println("Error: The mark should be between 0 and 30|");// F3
                }
                
            }while (mark <0 || mark >30);
            
            marks[i] = mark;
        }
      // F4 
      System .out.println(" Assessment Name: "+ assessmentName);
      for (int i = 0 ; i<marks.length;i++){
          System.out.println(marks[i]);
      // F5
       int[]Marks = {/* array of marks*/};
       int maxMark=30;
       int minMark=1;
       
       for (int mark:Marks){
           if (mark>maxMark){
               maxMark=mark;
            }
            if (mark<minMark){
                minMark=mark;
            }
           }
           System.out.println("Highest Mark:"+maxMark);
           System.out.println("Lowest Mark:"+minMark);
           // F6
           double sum = 0;
           int count = marks.length;
           for(int j = 0; i < count; j++) {
               sum += marks[i];
            }
           double mean = sum / count;
           double squareDiffSum = 0;
           for (int j = 0; j < count; j++){
               double diff = marks[j] - mean;
               squareDiffSum += diff * diff;
           }
           double variance = squareDiffSum / (count - 1);
           double stdDeviation = Math.sqrt(variance);
           System.out.println("Mean:" +mean);
           System.out.println("Standard Deviation;" +stdDeviation);
           
       }
          
      }
      }
    
    

    
