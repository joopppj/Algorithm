package test;

public class ReplaceSpace{
	// replace all space all spaces in a string with '10%'
	public static void ReplaceSpace(char[] str, int trueLength){
		int spaceCount =0,index,i=0;
		for(i=0;i<trueLength;i++){
			if(str[i]==' ')spaceCount++;
		}
		index = trueLength+spaceCount*2;
		if(trueLength<str.length)str[trueLength]='\0';
		for(i=trueLength-1;i>=0;i--){
			if(str[i]==' '){
				str[index-1]='%';
				str[index-2]='0';
				str[index-3]='1';
				index=index-3;
			}else{
				str[index-1]=str[i];
				index--;
			}
		}
	}
	
	public static void main(String[] args){
		String s= "Mr John Smith     ";
		char[] chars= s.toCharArray();
		ReplaceSpace(chars,13);
		System.out.println(String.valueOf(chars));
	}
}