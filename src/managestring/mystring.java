package managestring;


public class mystring{

  public mystring() {

  }
  public boolean have(String temp){
    int a=0;
    a=temp.indexOf("\n");
    if(a==-1)
      return false;
    else
      return true;
  }

  public String replace(String temp){

    String temp1=new String();

//    temp1=temp.replaceAll("&#39;","\'");
    temp1=temp.replaceAll("\"","&#34;");
    temp1=temp1.replaceAll("<","&#60;");
    temp1=temp1.replaceAll(">","&#62;");
//    temp1=temp1.replaceAll("&","&#38;");
//    temp1=temp1.replaceAll(" ","&nbsp;");

    return temp1;
  }

  public String replaceBlank(String temp){
    String temp1=new String();
    temp1=temp.replaceAll(" ","&nbsp;");
    return temp1;
  }

  public String restore(String temp){

    String temp1=new String();

//    temp1=temp.replaceAll("&#39;","\'");
    temp1=temp.replaceAll("&#34;","\"");
    temp1=temp1.replaceAll("&#60;","<");
    temp1=temp1.replaceAll("&#62;",">");
//    temp1=temp1.replaceAll("&#38;","&");
    temp1=temp1.replaceAll("&nbsp;"," ");

    return temp1;

  }

  public String replaceString(String temp){
    String temp1=new String();
    temp1=temp.replaceAll("\'","\'\'");
    return temp1;
  }

  public String restoreString(String temp){
    return temp;
  }

  public String[] getID(String temp){

    int count=0;
    char separator=' ';
    int index=0;
    String [] temp1;
    String [] temp2;

    do{
      ++count;
      ++index;
      index=temp.indexOf(separator,index);
    }while(index!=-1);

    temp1=new String[count];
    temp2=new String[count];
    index=0;
    int endIndex=0;
    for(int i=0;i<count;i++){
      endIndex=temp.indexOf(separator,index);

      if(endIndex==-1)
        temp1[i]=temp.substring(index);
      else
        temp1[i]=temp.substring(index,endIndex);

      index=endIndex+1;

    }
    int x=0;
    for(int i=(count-1);i>=0;i--){

      temp2[x]=temp1[i];
      x++;
    }
    return temp2;

  }

  public String newline(String temp){
    String temp1=new String();


    return temp1;
  }

  public boolean checkString(String temp){
    boolean check=true;

    if (temp.equals(""))
      return false;

    StringBuffer sb = new StringBuffer(temp);
    for (int i=0; i<sb.length(); i++) {
      switch (sb.charAt(i)) {
        case '\'':
           check=false;
           break;
        case '/':
           check=false;
           break;
        case '[':
           check=false;
           break;
        case ']':
           check=false;
           break;
        case '*':
           check=false;
           break;
        case '?':
          check=false;
          break;
       default:
           break;
      }
    }
    return check;
  }
  public boolean checkStringNull(String temp){
    boolean check=false;
    if (temp.equals(""))
      return true;
    return check;
  }
  public String removeBlank(String value){
    StringBuffer convertStr=new StringBuffer(value);
    StringBuffer  target=new StringBuffer();

    for(int i=0; i<value.length(); i++){
      if (!(convertStr.charAt(i)==' ')){
       	target.append(convertStr.charAt(i));
      }
    }
    return target.toString();
  }
}
