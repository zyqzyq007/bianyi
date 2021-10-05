import java.util.*;
public class TEST {

    public static boolean F(char[] fuhao ,char ch){
        int i=0;
        while(i<fuhao.length){
            if(ch==fuhao[i]){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] key1Arr = new String[] { "if", "else", "while" ,"break","continue","return","=",";","(",")","{","}","+","*","/","<",">","=="};
        String[] key2Arr = new String[] { "If", "Else", "While" ,"Break","Continue","Return","Assign","Semicolon","LPar","RPar","LBrace","RBrace","Plus","Mult","Div","Lt","Gt","Eq"};
        char [] fuhao = {'=',';','(',')','{','}','+','*','/','<','>'};
        String[] fuhao2 = {"Assign","Semicolon","LPar","RPar","LBrace","RBrace","Plus","Mult","Div","Lt","Gt"};



        Scanner in = new Scanner(System.in);

        StringBuffer a=new StringBuffer();
        String str="123";
        if(str.equals(new String(a))){
            System.out.println(a.charAt(2));
        }

        while(in.hasNext()){
            String line = in.nextLine();

            int i=0;
            while(i<line.length()){
                if(line.charAt(i)==' ' ||  line.charAt(i)=='\t'){
                        i++;
                        continue;
                }else if(Character.isLetter(line.charAt(i)) || line.charAt(i)=='_'){//是标识符或者是关键字
                    int temp=i;
                    i++;
                    while(i<line.length() && (Character.isLetter(line.charAt(i)) || Character.isDigit(line.charAt(i)) || line.charAt(i)=='_')){
                        i++;
                    }
                    String tempstr=line.substring(temp,i);
                    boolean judge=false;
                    for(int j=0;j<key1Arr.length;j++){//判断是否是关键字
                        if(tempstr.equals(key1Arr[j])){
                            System.out.println(key2Arr[j]);
                            judge=true;
                            break;
                        }
                    }
                    if(!judge){//不是关键字就是标识符
                        System.out.println("Ident("+tempstr+")");
                    }
                }else if(Character.isDigit(line.charAt(i))){//判断是无符号整数
                    int temp=i;
                    i++;
                    while(i<line.length() && Character.isDigit(line.charAt(i))){
                        i++;
                    }
                    String tempstr=line.substring(temp,i);
                    System.out.println("Number("+tempstr+")");
                }else if(F(fuhao,line.charAt(i))){
                    int temp=i;
                    i++;
                    while(i<line.length() && F(fuhao,line.charAt(i))){
                        i++;
                    }
                    String tempstr=line.substring(temp,i);

                    int ii=0;
                    while(ii<tempstr.length()){
                        if(tempstr.charAt(ii)!='='){
                            for(int iii=0;iii<fuhao.length;iii++){
                                if(fuhao[iii]==tempstr.charAt(ii)){
                                    System.out.println(fuhao2[iii]);
                                }
                            }

                            ii++;
                        }else{
                            if(ii<tempstr.length()-1 && tempstr.charAt(ii+1)=='='){
                                System.out.println("Eq");
                                ii=ii+2;
                            }else{
                                for(int iii=0;iii<fuhao.length;iii++){
                                    if(fuhao[iii]==tempstr.charAt(ii)){
                                        System.out.println(fuhao2[iii]);
                                    }
                                }

                                ii++;
                            }
                        }
                    }

                }else{
                    System.out.println("Err");
                    System.exit(0);
                }


            }
            //System.out.println(line);

        }

    }
}
