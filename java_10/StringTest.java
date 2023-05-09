package java_10;
public class StringTest{
    public static void main(String args[]){
        if("java".equals("java")) {
            System.out.println("동일함(0)");
        }
        String str1 = "java";
        String str2 = "java";
        if(str1 == str2) {
            System.out.println("동일함(1-1)");
        }
        if(str1.equals(str2)) {
            System.out.println("동일함(1-2)");
        }
        String str3 = new String("java");
        String str4 = new String("java");
        if(str3 == str4) {
            System.out.println("동일함(2-1)");
        }
        if(str3.equals(str4)) {
            System.out.println("동일함(2-2)");
        }
        String src = "윤석열 대통령의 국정 수행 지지율이 소폭 올라 2주 연속 상승했다는 여론조사 결과가 오늘(8일) 나왔습니다.윤석열 대통령의 국정 수행에 대한 긍정 평가는 전주보다 0.1%포인트(p) 상승한 34.6%로 집계됐습니다.";
        String result = src.replace("윤석열", "문재인");
        System.out.println(result);

        String src2 = " 3 +  5 *9";
        String [] result2 = src2.split("[+-/*]");
        for(String s : result2){
            System.out.println(s);
        }
        String src3 = "  5 ";
        String result3 = src3.trim();
        System.out.println(result3);
    }
}