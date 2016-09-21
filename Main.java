import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(printBinary(0.25));
		int[] a={8,1,2,0,6,4,5,7};
		//System.out.println(findMissing(a));
	}
	
	public static int findMissing2(int[] a){//if it is in order
		int lastBit=1;
		for(int x:a){
			int bit=x&1;
			if(bit==lastBit){
				return x-1;
			}else{
				lastBit=bit;
			}
		}
		return -1;
		
	}
	
	public static int findMissing(ArrayList<BitInteger> array){
		return findMissing(array,0);
	}
	
	public static int findMissing(ArrayList<BitInteger> al, int column){
		if(column>BitInteger.INTEGER_SIZE){return 0;}
		ArrayList<BitInteger> ones=new ArrayList<BitInteger>(al.size()/2);
		ArrayList<BitInteger> zeros=new ArrayList<BitInteger>(al.size()/2);
		
		for(BitInteger n:al){
			if(n.fetch(column)==0){
				zeros.add(n);
			}else{
				ones.add(n);
			}
		}
		
		if(zeros.size()<=ones.size()){//the least significant of v is 0
			int v=findMissing(zeros,column+1);//find v from zeros
			return (v<<1)|0;
		}else{
			int v=findMissing(ones,column+1);
			return (v<<1)|1;
		}
	}


}
