public class Exercise {
    public static void main(String[] args) throws Exception {

        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};

        // PATTERN 1
        int sum = 0;
        for (int i = 0; i < mdArray.length; i++) {
        sum += mdArray[0][i];
        }
        System.out.println("1. SUM OF PATTERN 1: " + sum);
      
       // PATTERN 2
       int sum2 = 0;
       for (int i = 0; i < mdArray.length; i++) {
        sum2 += mdArray[i][0];
       }
       System.out.println("");
       System.out.println("2. SUM OF PATTERN 2: " + sum2);

        // PATTERN 3
        int sum3 = 0;
        for (int i = 0; i < mdArray.length; i++) { 
            for (int j = 0; j < mdArray.length; j++) { 
                if (i == 0  || j == 0) {
                sum3 += mdArray[i][j];
                }
                else {
                    continue;
                }   
            }
        }
      System.out.println("");
      System.out.println("3. SUM OF PATTERN 3: " + sum3);
    
      
      // PATTERN 4
      int sum4 = 0;
      for (int i = 0; i < mdArray.length; i++) {
        for (int j = 0; j < mdArray.length; j++) {
            if ((i == 0  & j == 0) || (i == 0 & j == 3) || (i == 3 & j == 0) || (i == 3 & j == 3)) {
            sum4 += mdArray[i][j];
            }
        }
    }
      System.out.println("");
      System.out.println("4. SUM OF PATTERN 4: " + sum4);


      // PATTERN 5
      int sum5 = 0;
      for (int i = 0; i < mdArray.length; i++) {
        for (int j = 0; j < mdArray.length; j++) {
            if ((i == 1  & j == 1) || (i == 1 & j == 2) || (i == 2 & j == 1) || (i == 2 & j == 2)) {
                sum5 += mdArray[i][j];
            }
        }
    }
      System.out.println("");
      System.out.println("5. SUM OF PATTERN 5: " + sum5);
    
      // PATTERN 6
      int sum6 = 0;
      for (int i = 0; i < mdArray.length; i++) {
        for (int j = 0; j < mdArray.length; j++) {
            if (((i == 0  & j == 0) || (i == 0 & j == 3) || (i == 3 & j == 0) || (i == 3 & j == 3) ||
                (i == 1  & j == 1) || (i == 1 & j == 2) || (i == 2 & j == 1) || (i == 2 & j == 2) )) {
                sum6 += mdArray[i][j];
            }
        }
    }
      System.out.println("");
      System.out.println("6. SUM OF PATTERN 6: " + sum6);
  }

    }
    
