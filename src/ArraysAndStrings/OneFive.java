package ArraysAndStrings;

public class OneFive {
	public static void main(String[] args){
		String str = ReplaceSpace("this is  first   ");
		System.out.println(str);
	}
	public static String ReplaceSpace(String str){
		char[] chars=str.toCharArray();
		int spaceCount=0;
		for(int i=0;i<str.length();i++){
			if(chars[i]==' '){
				spaceCount++;
			}
		}
//		System.out.println(spaceCount);
		String result = new String();
		String[] a = str.split(" ");
//		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			if(i!=a.length-1)
				result+=a[i]+"%20";
			else
				result+=a[i];
		}
		if(spaceCount!=a.length-1){
			for(int j=0;j<(spaceCount-a.length+1);j++)
				result+="%20";
		}
		return result;
	}
}
