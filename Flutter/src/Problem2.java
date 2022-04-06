import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Problem2 {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n;j++){
                arr[j] = in.nextInt();
            }
            int flag = 0;
            for(int x = 0; x < n;x++){
                for(int y = 0; y < n;y++){
                    for(int z = 0; z < n;z++){
                        if ((z == x) || (z == y) || (x==y)){
                            continue;
                        }
                        if(check(arr[x],arr[y],arr[z])){
                            out.print(arr[x]);
                            out.print(" ");
                            out.print(arr[y]);
                            out.print(" ");
                            out.print(arr[z]);
                            out.println();
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1){
                        break;
                    }
                }
                if(flag ==1 ){
                    break;
                }
            }
        }
        out.flush();
        out.close();

    }
    public static boolean check(int n1, int n2,int n3){
        int[] mass = new int[10];
        String str1 = Integer.toString(n1);
        String str2 = Integer.toString(n2);
        String str3 = Integer.toString(n3);
        for(int i =0; i < str1.length();i++){
            if(str1.charAt(i)=='0'){
                mass[0]++;
            }
            if(str1.charAt(i)=='1'){
                mass[1]++;
            }
            if(str1.charAt(i)=='2'){
                mass[2]++;
            }
            if(str1.charAt(i)=='3'){
                mass[3]++;
            }
            if(str1.charAt(i)=='4'){
                mass[4]++;
            }
            if(str1.charAt(i)=='5'){
                mass[5]++;
            }
            if(str1.charAt(i)=='6'){
                mass[6]++;
            }
            if(str1.charAt(i)=='7'){
                mass[7]++;
            }
            if(str1.charAt(i)=='8'){
                mass[8]++;
            }
            if(str1.charAt(i)=='9'){
                mass[9]++;
            }

        }
        for(int i =0; i < str2.length();i++){
            if(str2.charAt(i)=='0'){
                mass[0]++;
            }
            if(str2.charAt(i)=='1'){
                mass[1]++;
            }
            if(str2.charAt(i)=='2'){
                mass[2]++;
            }
            if(str2.charAt(i)=='3'){
                mass[3]++;
            }
            if(str2.charAt(i)=='4'){
                mass[4]++;
            }
            if(str2.charAt(i)=='5'){
                mass[5]++;
            }
            if(str2.charAt(i)=='6'){
                mass[6]++;
            }
            if(str2.charAt(i)=='7'){
                mass[7]++;
            }
            if(str2.charAt(i)=='8'){
                mass[8]++;
            }
            if(str2.charAt(i)=='9'){
                mass[9]++;
            }

        }
        for(int i =0; i < str3.length();i++){
            if(str3.charAt(i)=='0'){
                mass[0]++;
            }
            if(str3.charAt(i)=='1'){
                mass[1]++;
            }
            if(str3.charAt(i)=='2'){
                mass[2]++;
            }
            if(str3.charAt(i)=='3'){
                mass[3]++;
            }
            if(str3.charAt(i)=='4'){
                mass[4]++;
            }
            if(str3.charAt(i)=='5'){
                mass[5]++;
            }
            if(str3.charAt(i)=='6'){
                mass[6]++;
            }
            if(str3.charAt(i)=='7'){
                mass[7]++;
            }
            if(str3.charAt(i)=='8'){
                mass[8]++;
            }
            if(str3.charAt(i)=='9'){
                mass[9]++;
            }

        }
        boolean flag = true;
        for(int i = 0; i < mass.length;i++){
            if(mass[i] == 0){
                flag = false;
            }
        }
        return flag;
    }
}
class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner() {
        init();
    }

    public FastScanner(String name) {
        init(name);
    }

    public FastScanner(boolean isOnlineJudge) {
        if (!isOnlineJudge || System.getProperty("ONLINE_JUDGE") != null) {
            init();
        } else {
            init("input.txt");
        }
    }

    private void init() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    private void init(String name) {
        try {
            br = new BufferedReader(new FileReader(name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String nextToken() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() {
        return Double.parseDouble(nextToken());
    }

}
