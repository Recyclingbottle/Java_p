package java_05;

public class student {
    public static void main(String args[])
    {
        int [][] scores = new int[5][7];
        int[] sum = new int[scores.length];

        double[] avg = new double[scores.length];

        for(int i = 0; i<scores.length; i++)
        {
            for(int k=0; k<scores[i].length; k++)
            {
                scores[i][k] = (int)(Math.random() * 101 );
            }
        }
        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){
            sum[i] += scores[i][j];
            }
        avg[i] = (double)sum[i] / scores[i].length;
        System.out.println(i + 1 + "번 학생의 점수의 합계는 " + sum[i] + "점, 평균은 " + avg[i]+ "점입니다.");
        }
    }
}
