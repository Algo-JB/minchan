import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count =0;

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        bw.write(recursion(Integer.parseInt(br.readLine())) + "");
        bw.close();
        br.close();
    }

    public static String recursion(int n) throws IOException  {

        for(int i=0; i<count;i++){bw.write("____");}
        bw.write("\"재귀함수가 뭔가요?\"\n");
        if(n==0) {
            for(int i=0; i<count;i++){bw.write("____");}
            bw.write("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
            for(int i=0; i<count;i++){bw.write("____");}
            bw.write("라고 답변하였지.\n");
            return "" ;
        }
        else{
            for(int i=0; i<count;i++){bw.write("____");}
            bw.write("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
            for(int i=0; i<count;i++){bw.write("____");}
            bw.write("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
            for(int i=0; i<count;i++){bw.write("____");}
            bw.write("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
        }
        count++;
        recursion(n-1);
        count--;
        for(int i=0; i<count;i++){bw.write("____");}
        bw.write("라고 답변하였지.\n");
        return "";
    }
}