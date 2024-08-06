//continue within a loop skips the rest of the loop and causes the next iteration of the loop to take place
//the lines of code after the skip
//labeled continue can be used in the same way as a labeled break

public class Continue {

    static double average(double[] scores) {
        double average = 0;
        double sum = 0;
        //here is an example of continue if the score is -1 which indicated the student was absent the rest of the loop is skipped and the next iteration takes place

        for (double score : scores) {
            if (score == -1) {
                continue;
            }

            sum += score;
        }

        average = sum/scores.length;
        return average;
    }

    static double[] average(double[][] studentScores) {
        double sum = 0 ,average = 0;
        int count = 0;
        double[] studentAverage = new double[studentScores.length];
        outerLoop : for (double[] scores : studentScores) {
             for (double score : scores) {
                if (score == -1) {
                    count++;
                    continue outerLoop;
                }

                sum += score;
            }

             average = sum/scores.length;
             studentAverage[count++] = average;
        }
        return studentAverage;
    }

    public static void main(String[] args) {
        double[] scores = {90,99,89,89};
        double average = average(scores);
        System.out.println(average);
    }

}
