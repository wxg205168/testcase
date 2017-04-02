package compages;

import java.util.ArrayList;

public class compagesData {

  public compagesData() {
  }

  public ArrayList combine(int n[],int nn[],int m)
  {
    ArrayList temp=new ArrayList();
    temp.clear();
    int[] arrayTemp;
    String arrayString=new String();
    int[] arrayTest=new int[m];
    int sub=m;
    int order[]=new int[m+1];
    int total=n.length;
    int test=0;
    int have=0;
    int test1=0;


    order[0]=-1;
    for(int i=1;i<=sub;i++){
      order[i]=i;
    }

    int k=sub;
    boolean flag=true;

    while(order[0]==-1){

      if(flag){
        arrayTemp=new int[m];
        for(int i=1;i<=sub;i++){
          arrayTemp[i - 1] = n[order[i] - 1];
          arrayTest[i-1]=nn[order[i]-1];
        }

        have=0;

        for(int ii=0;ii<m;ii++){
          test=arrayTest[ii];
          for(int j=0;j<m;j++){
            test1=arrayTest[j];
            if(test1==test && j!=ii){
              have=1;
            }
          }
        }

        if(have!=1){
          temp.add(arrayTemp);
        }
        flag=false;
      }
      order[k]++;
      if(order[k]==total+1){
        order[k--]=0;
        continue;
      }

      if(k<sub){
        order[++k]=order[k-1];
        continue;
      }
      if(k==sub)
        flag=true;
     }

     for(int i=0;i<temp.size();i++){
       arrayTemp = (int[]) temp.get(i);

       for(int ii=0;ii<sub;ii++){
         System.out.print(arrayTemp[ii]);
         System.out.print(' ');
       }
       System.out.println();
     }

     return temp;
  }


}
