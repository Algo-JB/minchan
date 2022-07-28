import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class fountain{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int i=0;
        while(n>0){
            i++;
            n=n-i;
            
        }
        if(i%2==0){     // 짝수층이면 위에서 아래로
            //n이 0이면 i=4
            // i-n/n+1
            //n==1이면
            //i-n/n+1
            bw.write((i+n)+"/"+((n*-1)+1));
        }
        else{           // i가 홀수 층이면 아래서 위로
            // n=n*(-1);
            bw.write(((n*-1)+1)+"/"+(i+n));
        }

        bw.flush();
        bw.close();
        br.close();

    }
}