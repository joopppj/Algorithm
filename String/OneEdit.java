package test;
public class OneEdit{
	//suppose we only have three operation on a string: removing a character ,replace a character and insert a character
	// this function returns true , when s1 only need one(or 0) operation to become s2.
	static boolean OneEdit(String s1,String s2){
		if(Math.abs(s1.length()-s2.length())>1){
			return false;
		}
		String x=s1.length()<s2.length()?s1:s2;
		String y=s1.length()<s2.length()?s2:s1;
		int i1=0;int i2=0;
		boolean difference=false;
		while(i2<y.length()&&i1<x.length()){
			if(x.charAt(i1)!=y.charAt(i2)){
				if(difference) return false;
				difference=true;
				
				if(x.length()==y.length()){
					i1++;
				}
			}else{
				i1++;
			}
			i2++;
		}
		return true;
		
	}
}