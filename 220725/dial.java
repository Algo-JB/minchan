import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class dial{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alpha = {"ABC","DEF","GHI","JKL","MNO",
                            "PGRS","TUV","WXYZ"};
        String st =br.readLine();
        int sum=0;
        for(int i=0;i<st.length();i++){
            for(int j=0;j<alpha.length;j++){
                if(alpha[j].contains(""+st.charAt(i))){
                    sum+=3+j;
                }
            }
        }
        bw.write(sum+"");
        bw.close();
        br.close();

    }


    public static int rNum(String strnum){

        char[] num=new char[3];
        for(int i=0; i<strnum.length();i++){
            num[i]=strnum.charAt(i);
        }
        char temp= num[0];
        num[0]=num[2];
        num[2]=temp;

        return Integer.parseInt(""+num[0]+num[1]+num[2]);
    }
}